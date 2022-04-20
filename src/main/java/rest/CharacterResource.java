package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.CharacterDTO;
import errorhandling.NotFoundException;
import facades.CharacterFacade;
import utils.EMF_Creator;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("character")
public class CharacterResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    private static final CharacterFacade FACADE = CharacterFacade.getCharacterFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @Path("{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getCharacterById(@PathParam("id") Long id) throws NotFoundException {
        CharacterDTO dto = FACADE.getByIdDTO(id);
        return Response
                .ok("SUCCESS")
                .entity(GSON.toJson(dto))
                .build();
    }

    @Path("user/{userName}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getCharactersByUserName(@PathParam("userName") String userName) {
        List<CharacterDTO> characterDTOList = FACADE.getCharactersByUserNameDTO(userName);
        return Response
                .ok()
                .entity(GSON.toJson(characterDTOList))
                .build();
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response create(String jsonContext) throws NotFoundException {
        CharacterDTO characterDTO = GSON.fromJson(jsonContext, CharacterDTO.class);
        CharacterDTO newCharacterDTO = FACADE.create(characterDTO);
        return Response
                .ok("SUCCESS")
                .entity(GSON.toJson(newCharacterDTO))
                .build();
    }

    @Path("{id}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Response update(@PathParam("id") long id, String jsonContext) throws NotFoundException {
        CharacterDTO characterDTO = GSON.fromJson(jsonContext, CharacterDTO.class);
        CharacterDTO updatedCharacterDTO = FACADE.update(characterDTO);
        return Response
                .ok("SUCCESS")
                .entity(GSON.toJson(updatedCharacterDTO))
                .build();
    }
}
