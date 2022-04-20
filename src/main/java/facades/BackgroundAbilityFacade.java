package facades;

import dtos.BackgroundAbilityDTO;
import dtos.BackgroundDTO;
import entities.Background;
import entities.BackgroundAbility;
import errorhandling.NotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class BackgroundAbilityFacade {

    public static EntityManagerFactory emf;
    private static BackgroundAbilityFacade instance;

    public BackgroundAbilityFacade() {}

    public static BackgroundAbilityFacade getBackgroundAbilityFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new BackgroundAbilityFacade();
        }
        return instance;
    }

    public BackgroundAbilityDTO create(BackgroundAbilityDTO dto, BackgroundDTO bdto) throws NotFoundException {
        Background background = BackgroundFacade.getBackgroundFacade(emf).getById(bdto.getId());
        if (background == null) {
            throw new NotFoundException();
        }
        BackgroundAbility backgroundAbility = new BackgroundAbility(
                dto.getBackgroundAbilityName(),
                dto.getBackgroundAbilityDescription(),
                background
        );
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(backgroundAbility);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return new BackgroundAbilityDTO(backgroundAbility);
    }
}
