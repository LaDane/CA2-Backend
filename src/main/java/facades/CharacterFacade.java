package facades;

import dtos.CharacterDTO;
import entities.Background;
import entities.Character;
import entities.CharacterSkill;
import entities.User;
import errorhandling.NotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class CharacterFacade {

    private static EntityManagerFactory emf;
    private static CharacterFacade instance;

    private CharacterFacade() {}

    public static CharacterFacade getCharacterFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new CharacterFacade();
        }
        return instance;
    }

    public CharacterDTO create(CharacterDTO dto) throws NotFoundException {
        User user = UserFacade.getUserFacade(emf).getUserByName(dto.getUserName());
        Background background = BackgroundFacade.getBackgroundFacade(emf).getById(dto.getBackgroundDTO().getId());
        CharacterSkill characterSkill = CharacterSkillFacade.getCharacterSkillFacade(emf).generate(dto);
        Character character = new Character(
                dto.getCharacterName(),
                dto.getCharacterLevel(),
                dto.getCharacterXp(),
                dto.getCharacterHp(),
                dto.getCharacterArmor(),
                dto.getCharacterAngles(),
                user,
                background,
                characterSkill
        );
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(character);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return new CharacterDTO(character);
    }

    public CharacterDTO update(CharacterDTO dto) throws NotFoundException {
        Character foundCharacter = getById(dto.getId());
        CharacterSkill foundCharacterSkill = CharacterSkillFacade.getCharacterSkillFacade(emf).getById(dto.getCharacterSkillDTO().getId());

        Character updatedCharacterValues = updateValues(foundCharacter, dto);

        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(updatedCharacterValues);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return new CharacterDTO(updatedCharacterValues);
    }

    public Character updateValues(Character c, CharacterDTO dto) {
        c.setCharacterName(dto.getCharacterName());
        c.setCharacterLevel(dto.getCharacterLevel());
        c.setCharacterXp(dto.getCharacterXp());
        c.setCharacterHp(dto.getCharacterHp());
        c.setCharacterArmor(dto.getCharacterArmor());
        c.setCharacterAngles(dto.getCharacterAngles());
        c.setCharacterSkill(CharacterSkillFacade.getCharacterSkillFacade(emf).updateValues(c.getCharacterSkill(), dto.getCharacterSkillDTO()));
        return c;
    }

    public Character getById(Long id) throws NotFoundException {
        EntityManager em = emf.createEntityManager();
        Character character;
        try {
            character = em.find(Character.class, id);
            if (character == null) {
                throw new NotFoundException();
            }
        } finally {
            em.close();
        }
        return character;
    }

    public CharacterDTO getByIdDTO(Long id) throws NotFoundException {
        return new CharacterDTO(getById(id));
    }

    public List<Character> getCharactersByUserName(String userName) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Character> tq = em.createQuery("SELECT c FROM Character c WHERE c.user.userName = '"+userName+"'", Character.class);
        return tq.getResultList();
    }

    public List<CharacterDTO> getCharactersByUserNameDTO(String userName) {
        List<Character> characterList = getCharactersByUserName(userName);
        List<CharacterDTO> characterDTOList = new ArrayList<>();
        for (Character c : characterList) {
            characterDTOList.add(new CharacterDTO(c));
        }
        return characterDTOList;
    }
}
