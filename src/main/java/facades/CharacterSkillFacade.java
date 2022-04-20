package facades;

import dtos.CharacterDTO;
import dtos.CharacterSkillDTO;
import entities.CharacterSkill;
import errorhandling.NotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class CharacterSkillFacade {

    private static EntityManagerFactory emf;
    private static CharacterSkillFacade instance;

    private CharacterSkillFacade() {}

    public static CharacterSkillFacade getCharacterSkillFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new CharacterSkillFacade();
        }
        return instance;
    }

    public CharacterSkill generate(CharacterDTO dto) {
        return new CharacterSkill(
                dto.getCharacterSkillDTO().getStrength(),
                dto.getCharacterSkillDTO().getEndurance(),
                dto.getCharacterSkillDTO().getIntelligence(),
                dto.getCharacterSkillDTO().getFinesse(),
                dto.getCharacterSkillDTO().getPerception(),
                dto.getCharacterSkillDTO().getCharisma(),
                dto.getCharacterSkillDTO().getInitiative(),
                dto.getCharacterSkillDTO().getNerves(),
                dto.getCharacterSkillDTO().getMelee(),
                dto.getCharacterSkillDTO().getThrowingString(),
                dto.getCharacterSkillDTO().getFirearms(),
                dto.getCharacterSkillDTO().getSneak(),
                dto.getCharacterSkillDTO().getFlatter(),
                dto.getCharacterSkillDTO().getLie(),
                dto.getCharacterSkillDTO().getIntimidate(),
                dto.getCharacterSkillDTO().getTrade(),
                dto.getCharacterSkillDTO().getRepair(),
                dto.getCharacterSkillDTO().getTraps(),
                dto.getCharacterSkillDTO().getSurvival(),
                dto.getCharacterSkillDTO().getCrafting(),
                dto.getCharacterSkillDTO().getScience(),
                dto.getCharacterSkillDTO().getAlchemy(),
                dto.getCharacterSkillDTO().getMedical(),
                dto.getCharacterSkillDTO().getHistory()
        );
    }

    public CharacterSkill updateValues(CharacterSkill cs, CharacterSkillDTO dto) {
        cs.setStrength(dto.getStrength());
        cs.setEndurance(dto.getEndurance());
        cs.setIntelligence(dto.getIntelligence());
        cs.setFinesse(dto.getFinesse());
        cs.setPerception(dto.getPerception());
        cs.setCharisma(dto.getCharisma());
        cs.setInitiative(dto.getInitiative());
        cs.setNerves(dto.getNerves());
        cs.setMelee(dto.getMelee());
        cs.setThrowingString(dto.getThrowingString());
        cs.setFirearms(dto.getFirearms());
        cs.setSneak(dto.getSneak());
        cs.setFlatter(dto.getFlatter());
        cs.setLie(dto.getLie());
        cs.setIntimidate(dto.getIntimidate());
        cs.setTrade(dto.getTrade());
        cs.setRepair(dto.getRepair());
        cs.setTraps(dto.getTraps());
        cs.setSurvival(dto.getSurvival());
        cs.setCrafting(dto.getCrafting());
        cs.setScience(dto.getScience());
        cs.setAlchemy(dto.getAlchemy());
        cs.setMedical(dto.getMedical());
        cs.setHistory(dto.getHistory());
        return cs;
    }

    public CharacterSkill getById(Long id) throws NotFoundException {
        EntityManager em = emf.createEntityManager();
        CharacterSkill characterSkill;
        try {
            characterSkill = em.find(CharacterSkill.class, id);
            if (characterSkill == null) {
                throw new NotFoundException();
            }
        } finally {
            em.close();
        }
        return characterSkill;
    }

    public CharacterSkillDTO getByIdDTO(Long id) throws NotFoundException {
        return new CharacterSkillDTO(getById(id));
    }
}
