package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import facades.UserFacade;
import utils.EMF_Creator;

import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.util.List;

@Path("users")
public class UserResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    private static final UserFacade FACADE = UserFacade.getUserFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @Context
    private UriInfo context;

    @Context
    SecurityContext securityContext;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("all")
    @RolesAllowed("admin")
    public Response getAllUsers() {
        List<String> usernames = FACADE.getAllUsernames();
        return Response
                .ok("SUCCESS")
                .entity(GSON.toJson(usernames))
                .build();
    }
}
