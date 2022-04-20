package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "background_abilities")
public class BackgroundAbility {

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
    @Column(name = "background_ability_name")
    private String backgroundAbilityName;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "background_ability_description", columnDefinition="LONGTEXT")
    private String backgroundAbilityDescription;

    @ManyToOne()
    @JoinColumn(name = "background")
    private Background background;

    public BackgroundAbility() {}

    public BackgroundAbility(String backgroundAbilityName, String backgroundAbilityDescription, Background background) {
        this.backgroundAbilityName = backgroundAbilityName;
        this.backgroundAbilityDescription = backgroundAbilityDescription;
        this.background = background;
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

    public Background getBackground() {
        return background;
    }
}
