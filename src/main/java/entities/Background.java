package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "backgrounds")
public class Background {

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
    @Column(name = "background_name")
    private String backgroundName;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "background_morale")
    private String backgroundMorale;

    @Basic(optional = false)
    @NotNull
    @Column(name = "background_description", columnDefinition="LONGTEXT")
    private String backgroundDescription;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "background")
    private List<Character> characters;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "background")
    private List<BackgroundAbility> backgroundAbilities;

    public Background() {}

    public Background(String backgroundName, String backgroundMorale, String backgroundDescription) {
        this.backgroundName = backgroundName;
        this.backgroundMorale = backgroundMorale;
        this.backgroundDescription = backgroundDescription;
    }

    public Background(String backgroundName, String backgroundMorale, String backgroundDescription, List<Character> characters, List<BackgroundAbility> backgroundAbilities) {
        this.backgroundName = backgroundName;
        this.backgroundMorale = backgroundMorale;
        this.backgroundDescription = backgroundDescription;
        this.characters = characters;
        this.backgroundAbilities = backgroundAbilities;
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

    public List<Character> getCharacters() {
        return characters;
    }

    public List<BackgroundAbility> getBackgroundAbilities() {
        return backgroundAbilities;
    }
}
