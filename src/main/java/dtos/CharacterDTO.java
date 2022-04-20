package dtos;

import entities.Character;

public class CharacterDTO {

    private Long id;
    private String characterName;
    private Long characterLevel;
    private Long characterXp;
    private Long characterHp;
    private Long characterArmor;
    private Long characterAngles;
    private String userName;
    private BackgroundDTO backgroundDTO;
    private CharacterSkillDTO characterSkillDTO;

    public CharacterDTO(String characterName, Long characterLevel, Long characterXp, Long characterHp, Long characterArmor, Long characterAngles, String userName, BackgroundDTO backgroundDTO, CharacterSkillDTO characterSkillDTO) {
        this.characterName = characterName;
        this.characterLevel = characterLevel;
        this.characterXp = characterXp;
        this.characterHp = characterHp;
        this.characterArmor = characterArmor;
        this.characterAngles = characterAngles;
        this.userName = userName;
        this.backgroundDTO = backgroundDTO;
        this.characterSkillDTO = characterSkillDTO;
    }

    public CharacterDTO(Character character) {
        if (character.getId() != null) {
            this.id = character.getId();
        }
        this.characterName = character.getCharacterName();
        this.characterLevel = character.getCharacterLevel();
        this.characterXp = character.getCharacterXp();
        this.characterHp = character.getCharacterHp();
        this.characterArmor = character.getCharacterArmor();
        this.characterAngles = character.getCharacterAngles();
        this.userName = character.getUserName();
        this.backgroundDTO = new BackgroundDTO(character.getBackground());
        this.characterSkillDTO = new CharacterSkillDTO(character.getCharacterSkill());
    }

    public Long getId() {
        return id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public Long getCharacterLevel() {
        return characterLevel;
    }

    public Long getCharacterXp() {
        return characterXp;
    }

    public Long getCharacterHp() {
        return characterHp;
    }

    public Long getCharacterArmor() {
        return characterArmor;
    }

    public Long getCharacterAngles() {
        return characterAngles;
    }

    public String getUserName() {
        return userName;
    }

    public BackgroundDTO getBackgroundDTO() {
        return backgroundDTO;
    }

    public CharacterSkillDTO getCharacterSkillDTO() {
        return characterSkillDTO;
    }
}
