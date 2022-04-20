package populators;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.BackgroundDTO;
import dtos.CharacterDTO;
import dtos.CharacterSkillDTO;
import errorhandling.NotFoundException;
import facades.BackgroundFacade;
import facades.CharacterFacade;
import utils.EMF_Creator;

import javax.persistence.EntityManagerFactory;
import java.util.Random;

public class CharacterPopulator {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws NotFoundException {
        populateCharacters();
    }

    public static void populateCharacters() throws NotFoundException {
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        CharacterFacade cFacade = CharacterFacade.getCharacterFacade(emf);
        BackgroundFacade bFacade = BackgroundFacade.getBackgroundFacade(emf);

        BackgroundDTO b1 = new BackgroundDTO(bFacade.getById(2L));
        CharacterSkillDTO cs1 = randomSkills();
        CharacterDTO c1 = new CharacterDTO(
                "Character Name",
                1L,
                1L,
                10L,
                5L,
                4L,
                "user",
                b1,
                cs1
        );
        CharacterDTO c1DTO = cFacade.create(c1);
        System.out.println(GSON.toJson(c1DTO));
    }

    private static CharacterSkillDTO randomSkills() {
        return new CharacterSkillDTO((long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn(), (long) rn());
    }

    private static int rn() {
        Random random = new Random();
        return random.nextInt(10 - 1 + 1) + 1;
    }
}
