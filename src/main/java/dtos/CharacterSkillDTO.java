package dtos;

import entities.CharacterSkill;

public class CharacterSkillDTO {
    private Long id;
    private Long strength;
    private Long endurance;
    private Long intelligence;
    private Long finesse;
    private Long perception;
    private Long charisma;
    private Long initiative;
    private Long nerves;
    private Long melee;
    private Long throwingString;
    private Long firearms;
    private Long sneak;
    private Long flatter;
    private Long lie;
    private Long intimidate;
    private Long trade;
    private Long repair;
    private Long traps;
    private Long survival;
    private Long crafting;
    private Long science;
    private Long alchemy;
    private Long medical;
    private Long history;

    public CharacterSkillDTO(Long strength, Long endurance, Long intelligence, Long finesse, Long perception, Long charisma, Long initiative, Long nerves, Long melee, Long throwingString, Long firearms, Long sneak, Long flatter, Long lie, Long intimidate, Long trade, Long repair, Long traps, Long survival, Long crafting, Long science, Long alchemy, Long medical, Long history) {
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

    public CharacterSkillDTO(CharacterSkill characterSkill) {
        if (characterSkill.getId() != null) {
            this.id = characterSkill.getId();
        }
        this.strength = characterSkill.getStrength();
        this.endurance = characterSkill.getEndurance();
        this.intelligence = characterSkill.getIntelligence();
        this.finesse = characterSkill.getFinesse();
        this.perception = characterSkill.getPerception();
        this.charisma = characterSkill.getCharisma();
        this.initiative = characterSkill.getInitiative();
        this.nerves = characterSkill.getNerves();
        this.melee = characterSkill.getMelee();
        this.throwingString = characterSkill.getThrowingString();
        this.firearms = characterSkill.getFirearms();
        this.sneak = characterSkill.getSneak();
        this.flatter = characterSkill.getFlatter();
        this.lie = characterSkill.getLie();
        this.intimidate = characterSkill.getIntimidate();
        this.trade = characterSkill.getTrade();
        this.repair = characterSkill.getRepair();
        this.traps = characterSkill.getTraps();
        this.survival = characterSkill.getSurvival();
        this.crafting = characterSkill.getCrafting();
        this.science = characterSkill.getScience();
        this.alchemy = characterSkill.getAlchemy();
        this.medical = characterSkill.getMedical();
        this.history = characterSkill.getHistory();
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
}
