package dtos;

import entities.Background;
import entities.BackgroundAbility;

import java.util.ArrayList;
import java.util.List;

public class BackgroundDTO {

    private Long id;
    private String backgroundName;
    private String backgroundMorale;
    private String backgroundDescription;
    private String backgroundImg;
    private List<BackgroundAbilityDTO> backgroundAbilities = new ArrayList<>();

    public BackgroundDTO(String backgroundName, String backgroundMorale, String backgroundDescription, String backgroundImg) {
        this.backgroundName = backgroundName;
        this.backgroundMorale = backgroundMorale;
        this.backgroundDescription = backgroundDescription;
        this.backgroundImg = backgroundImg;
    }

    public BackgroundDTO(String backgroundName, String backgroundMorale, String backgroundDescription, String backgroundImg, List<BackgroundAbilityDTO> backgroundAbilities) {
        this.backgroundName = backgroundName;
        this.backgroundMorale = backgroundMorale;
        this.backgroundDescription = backgroundDescription;
        this.backgroundImg = backgroundImg;
        this.backgroundAbilities = backgroundAbilities;
    }

    public BackgroundDTO(Background background) {
        if (background.getId() != null) {
            this.id = background.getId();
        }
        this.backgroundName = background.getBackgroundName();
        this.backgroundMorale = background.getBackgroundMorale();
        this.backgroundDescription = background.getBackgroundDescription();
        this.backgroundImg = background.getBackgroundImg();
        for (BackgroundAbility ba : background.getBackgroundAbilities()) {
            this.backgroundAbilities.add(new BackgroundAbilityDTO(ba));
        }
    }

    public Long getId() {
        return id;
    }

    public String getBackgroundName() {
        return backgroundName;
    }

    public String getBackgroundMorale() {
        return backgroundMorale;
    }

    public String getBackgroundDescription() {
        return backgroundDescription;
    }

    public String getBackgroundImg() {
        return backgroundImg;
    }

    public List<BackgroundAbilityDTO> getBackgroundAbilities() {
        return backgroundAbilities;
    }
}
