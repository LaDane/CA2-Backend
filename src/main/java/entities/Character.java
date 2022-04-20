package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "characters")
public class Character {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "character_name")
    private String characterName;

    @Basic(optional = false)
    @NotNull
    @Column(name = "character_level")
    private Long characterLevel;

    @Basic(optional = false)
    @NotNull
    @Column(name = "character_xp")
    private Long characterXp;

    @Basic(optional = false)
    @NotNull
    @Column(name = "character_hp")
    private Long characterHp;

    @Basic(optional = false)
    @NotNull
    @Column(name = "character_armor")
    private Long characterArmor;

    @Basic(optional = false)
    @NotNull
    @Column(name = "character_angles")
    private Long characterAngles;

    @ManyToOne()
    @JoinColumn(name = "user_name")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "background_id")
    private Background background;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "character_skill_id", referencedColumnName = "id")
    private CharacterSkill characterSkill;

    public Character() {}

    public Character(String characterName, Long characterLevel, Long characterXp, Long characterHp, Long characterArmor, Long characterAngles, User user, Background background, CharacterSkill characterSkill) {
        this.characterName = characterName;
        this.characterLevel = characterLevel;
        this.characterXp = characterXp;
        this.characterHp = characterHp;
        this.characterArmor = characterArmor;
        this.characterAngles = characterAngles;
        this.user = user;
        this.background = background;
        this.characterSkill = characterSkill;
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

    public User getUser() {
        return user;
    }

    public String getUserName() {
        return user.getUserName();
    }

    public Background getBackground() {
        return background;
    }

    public CharacterSkill getCharacterSkill() {
        return characterSkill;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setCharacterLevel(Long characterLevel) {
        this.characterLevel = characterLevel;
    }

    public void setCharacterXp(Long characterXp) {
        this.characterXp = characterXp;
    }

    public void setCharacterHp(Long characterHp) {
        this.characterHp = characterHp;
    }

    public void setCharacterArmor(Long characterArmor) {
        this.characterArmor = characterArmor;
    }

    public void setCharacterAngles(Long characterAngles) {
        this.characterAngles = characterAngles;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public void setCharacterSkill(CharacterSkill characterSkill) {
        this.characterSkill = characterSkill;
    }
}
