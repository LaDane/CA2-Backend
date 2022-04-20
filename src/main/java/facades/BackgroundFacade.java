package facades;

import dtos.BackgroundDTO;
import entities.Background;
import errorhandling.NotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class BackgroundFacade {

    private static EntityManagerFactory emf;
    private static BackgroundFacade instance;

    public BackgroundFacade() {}

    public static BackgroundFacade getBackgroundFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new BackgroundFacade();
        }
        return instance;
    }

    public BackgroundDTO create(BackgroundDTO dto) {
        Background background = new Background(
                dto.getBackgroundName(),
                dto.getBackgroundMorale(),
                dto.getBackgroundDescription()
        );
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(background);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return new BackgroundDTO(background);
    }

    public Background getById(Long id) throws NotFoundException {
        EntityManager em = emf.createEntityManager();
        Background background;
        try {
            background = em.find(Background.class, id);
            if (background == null) {
                throw new NotFoundException();
            }
        } finally {
            em.close();
        }
        return background;
    }

    public List<BackgroundDTO> getAllBackgrounds() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Background> tq = em.createQuery("SELECT b FROM Background b", Background.class);
        List<BackgroundDTO> dtos = new ArrayList<>();
        for (Background b : tq.getResultList()) {
            dtos.add(new BackgroundDTO(b));
        }
        return dtos;
    }
}
