package rest;

import errorhandling.NotFoundException;
import populators.BackgroundPopulator;
import utils.EMF_Creator;

import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

@Path("background")
public class BackgroundResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();

    @Context
    private UriInfo context;

    @Context
    SecurityContext securityContext;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("populate")
    @RolesAllowed("admin")
    public Response populateBackgrounds() throws NotFoundException {
        BackgroundPopulator.populateBackgrounds();
        return Response
                .ok("SUCCESS")
                .build();
    }
}
