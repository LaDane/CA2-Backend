package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.BackgroundDTO;
import errorhandling.NotFoundException;
import facades.BackgroundFacade;
import populators.BackgroundPopulator;
import utils.EMF_Creator;

import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.util.List;

@Path("background")
public class BackgroundResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    private static final BackgroundFacade FACADE = BackgroundFacade.getBackgroundFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @Context
    private UriInfo context;

    @Context
    SecurityContext securityContext;

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("populate")
//    @RolesAllowed("admin")
//    public Response populateBackgrounds() throws NotFoundException {
//        BackgroundPopulator.populateBackgrounds();
//        return Response
//                .ok("SUCCESS")
//                .build();
//    }

    @Path("all")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getAllBackgrounds() {
        List<BackgroundDTO> dtos = FACADE.getAllBackgrounds();
        return Response
                .ok("SUCCESS")
                .entity(GSON.toJson(dtos))
                .build();
    }
}
