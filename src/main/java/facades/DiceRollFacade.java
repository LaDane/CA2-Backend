package facades;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import utils.Utility;

import javax.persistence.EntityManagerFactory;
import java.io.IOException;

public class DiceRollFacade {

    private static DiceRollFacade instance;
    private static EntityManagerFactory emf;

    private DiceRollFacade() {}

    public static DiceRollFacade getDiceRollFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new DiceRollFacade();
        }
        return instance;
    }

    public int getDiceRoll(String diceType) throws IOException {
        String result = Utility.fetchData("http://roll.diceapi.com/json/"+ diceType);
        JsonObject object = new JsonParser().parse(result).getAsJsonObject().getAsJsonArray("dice").get(0).getAsJsonObject();
        return object.get("value").getAsInt();
    }

//    public static void main(String[] args) throws IOException {
//        System.out.println(getDiceRoll("d20"));
//    }
}
