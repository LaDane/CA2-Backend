package dtos;

import entities.BackgroundAbility;

public class BackgroundAbilityDTO {

    private Long id;
    private String backgroundAbilityName;
    private String backgroundAbilityDescription;

    public BackgroundAbilityDTO(String backgroundAbilityName, String backgroundAbilityDescription) {
        this.backgroundAbilityName = backgroundAbilityName;
        this.backgroundAbilityDescription = backgroundAbilityDescription;
    }

    public BackgroundAbilityDTO(BackgroundAbility backgroundAbility) {
        if (backgroundAbility.getId() != null) {
            this.id = backgroundAbility.getId();
        }
        this.backgroundAbilityName = backgroundAbility.getBackgroundAbilityName();
        this.backgroundAbilityDescription = backgroundAbility.getBackgroundAbilityDescription();
    }

    public Long getId() {
        return id;
    }

    public String getBackgroundAbilityName() {
        return backgroundAbilityName;
    }

    public String getBackgroundAbilityDescription() {
        return backgroundAbilityDescription;
    }
}
