package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import facades.DiceRollFacade;
import utils.EMF_Creator;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("dice")
public class DiceRollResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    private static final DiceRollFacade FACADE = DiceRollFacade.getDiceRollFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @Path("d4")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public int rollD4() throws IOException {
        return FACADE.getDiceRoll("d4");
    }

    @Path("d6")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public int rollD6() throws IOException {
        return FACADE.getDiceRoll("d6");
    }

    @Path("d8")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public int rollD8() throws IOException {
        return FACADE.getDiceRoll("d8");
    }

    @Path("d10")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public int rollD10() throws IOException {
        return FACADE.getDiceRoll("d10");
    }

    @Path("d12")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public int rollD12() throws IOException {
        return FACADE.getDiceRoll("d12");
    }

    @Path("d20")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public int rollD20() throws IOException {
        return FACADE.getDiceRoll("d20");
    }
}
