package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "character_skills")
public class CharacterSkill {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @NotNull
    @Column(name = "strength")
    private Long strength;

    @Basic(optional = false)
    @NotNull
    @Column(name = "endurance")
    private Long endurance;

    @Basic(optional = false)
    @NotNull
    @Column(name = "intelligence")
    private Long intelligence;

    @Basic(optional = false)
    @NotNull
    @Column(name = "finesse")
    private Long finesse;

    @Basic(optional = false)
    @NotNull
    @Column(name = "perception")
    private Long perception;

    @Basic(optional = false)
    @NotNull
    @Column(name = "charisma")
    private Long charisma;

    @Basic(optional = false)
    @NotNull
    @Column(name = "initiative")
    private Long initiative;

    @Basic(optional = false)
    @NotNull
    @Column(name = "nerves")
    private Long nerves;

    @Basic(optional = false)
    @NotNull
    @Column(name = "melee")
    private Long melee;

    @Basic(optional = false)
    @NotNull
    @Column(name = "throwing_string")
    private Long throwingString;

    @Basic(optional = false)
    @NotNull
    @Column(name = "firearms")
    private Long firearms;

    @Basic(optional = false)
    @NotNull
    @Column(name = "sneak")
    private Long sneak;

    @Basic(optional = false)
    @NotNull
    @Column(name = "flatter")
    private Long flatter;

    @Basic(optional = false)
    @NotNull
    @Column(name = "lie")
    private Long lie;

    @Basic(optional = false)
    @NotNull
    @Column(name = "intimidate")
    private Long intimidate;

    @Basic(optional = false)
    @NotNull
    @Column(name = "trade")
    private Long trade;

    @Basic(optional = false)
    @NotNull
    @Column(name = "repair")
    private Long repair;

    @Basic(optional = false)
    @NotNull
    @Column(name = "traps")
    private Long traps;

    @Basic(optional = false)
    @NotNull
    @Column(name = "survival")
    private Long survival;

    @Basic(optional = false)
    @NotNull
    @Column(name = "crafting")
    private Long crafting;

    @Basic(optional = false)
    @NotNull
    @Column(name = "science")
    private Long science;

    @Basic(optional = false)
    @NotNull
    @Column(name = "alchemy")
    private Long alchemy;

    @Basic(optional = false)
    @NotNull
    @Column(name = "medical")
    private Long medical;

    @Basic(optional = false)
    @NotNull
    @Column(name = "history")
    private Long history;

    @OneToOne(mappedBy = "characterSkill")
    private Character character;

    public CharacterSkill() {}

    public CharacterSkill(Long strength, Long endurance, Long intelligence, Long finesse, Long perception, Long charisma, Long initiative, Long nerves, Long melee, Long throwingString, Long firearms, Long sneak, Long flatter, Long lie, Long intimidate, Long trade, Long repair, Long traps, Long survival, Long crafting, Long science, Long alchemy, Long medical, Long history) {
        this.strength = strength;
        this.endurance = endurance;
        this.intelligence = intelligence;
        this.finesse = finesse;
        this.perception = perception;
        this.charisma = charisma;
        this.initiative = initiative;
        this.nerves = nerves;
        this.melee = melee;
        this.throwingString = throwingString;
        this.firearms = firearms;
        this.sneak = sneak;
        this.flatter = flatter;
        this.lie = lie;
        this.intimidate = intimidate;
        this.trade = trade;
        this.repair = repair;
        this.traps = traps;
        this.survival = survival;
        this.crafting = crafting;
        this.science = science;
        this.alchemy = alchemy;
        this.medical = medical;
        this.history = history;
    }

    public CharacterSkill(Long strength, Long endurance, Long intelligence, Long finesse, Long perception, Long charisma, Long initiative, Long nerves, Long melee, Long throwingString, Long firearms, Long sneak, Long flatter, Long lie, Long intimidate, Long trade, Long repair, Long traps, Long survival, Long crafting, Long science, Long alchemy, Long medical, Long history, Character character) {
        this.strength = strength;
        this.endurance = endurance;
        this.intelligence = intelligence;
        this.finesse = finesse;
        this.perception = perception;
        this.charisma = charisma;
        this.initiative = initiative;
        this.nerves = nerves;
        this.melee = melee;
        this.throwingString = throwingString;
        this.firearms = firearms;
        this.sneak = sneak;
        this.flatter = flatter;
        this.lie = lie;
        this.intimidate = intimidate;
        this.trade = trade;
        this.repair = repair;
        this.traps = traps;
        this.survival = survival;
        this.crafting = crafting;
        this.science = science;
        this.alchemy = alchemy;
        this.medical = medical;
        this.history = history;
        this.character = character;
    }

    public Long getId() {
        return id;
    }

    public Long getStrength() {
        return strength;
    }

    public Long getEndurance() {
        return endurance;
    }

    public Long getIntelligence() {
        return intelligence;
    }

    public Long getFinesse() {
        return finesse;
    }

    public Long getPerception() {
        return perception;
    }

    public Long getCharisma() {
        return charisma;
    }

    public Long getInitiative() {
        return initiative;
    }

    public Long getNerves() {
        return nerves;
    }

    public Long getMelee() {
        return melee;
    }

    public Long getThrowingString() {
        return throwingString;
    }

    public Long getFirearms() {
        return firearms;
    }

    public Long getSneak() {
        return sneak;
    }

    public Long getFlatter() {
        return flatter;
    }

    public Long getLie() {
        return lie;
    }

    public Long getIntimidate() {
        return intimidate;
    }

    public Long getTrade() {
        return trade;
    }

    public Long getRepair() {
        return repair;
    }

    public Long getTraps() {
        return traps;
    }

    public Long getSurvival() {
        return survival;
    }

    public Long getCrafting() {
        return crafting;
    }

    public Long getScience() {
        return science;
    }

    public Long getAlchemy() {
        return alchemy;
    }

    public Long getMedical() {
        return medical;
    }

    public Long getHistory() {
        return history;
    }

    public Character getCharacter() {
        return character;
    }

    public void setStrength(Long strength) {
        this.strength = strength;
    }

    public void setEndurance(Long endurance) {
        this.endurance = endurance;
    }

    public void setIntelligence(Long intelligence) {
        this.intelligence = intelligence;
    }

    public void setFinesse(Long finesse) {
        this.finesse = finesse;
    }

    public void setPerception(Long perception) {
        this.perception = perception;
    }

    public void setCharisma(Long charisma) {
        this.charisma = charisma;
    }

    public void setInitiative(Long initiative) {
        this.initiative = initiative;
    }

    public void setNerves(Long nerves) {
        this.nerves = nerves;
    }

    public void setMelee(Long melee) {
        this.melee = melee;
    }

    public void setThrowingString(Long throwingString) {
        this.throwingString = throwingString;
    }

    public void setFirearms(Long firearms) {
        this.firearms = firearms;
    }

    public void setSneak(Long sneak) {
        this.sneak = sneak;
    }

    public void setFlatter(Long flatter) {
        this.flatter = flatter;
    }

    public void setLie(Long lie) {
        this.lie = lie;
    }

    public void setIntimidate(Long intimidate) {
        this.intimidate = intimidate;
    }

    public void setTrade(Long trade) {
        this.trade = trade;
    }

    public void setRepair(Long repair) {
        this.repair = repair;
    }

    public void setTraps(Long traps) {
        this.traps = traps;
    }

    public void setSurvival(Long survival) {
        this.survival = survival;
    }

    public void setCrafting(Long crafting) {
        this.crafting = crafting;
    }

    public void setScience(Long science) {
        this.science = science;
    }

    public void setAlchemy(Long alchemy) {
        this.alchemy = alchemy;
    }

    public void setMedical(Long medical) {
        this.medical = medical;
    }

    public void setHistory(Long history) {
        this.history = history;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
