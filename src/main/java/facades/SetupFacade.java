package facades;

import com.google.gson.JsonObject;
import entities.Background;
import entities.Role;
import errorhandling.NotFoundException;
import populators.BackgroundPopulator;
import populators.RolePopulator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

public class SetupFacade {

    private static EntityManagerFactory emf;
    private static SetupFacade instance;

    private SetupFacade() {}

    public static SetupFacade getSetupFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new SetupFacade();
        }
        return instance;
    }

    public JsonObject setupDatabase() throws NotFoundException {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Role> roleTQ = em.createQuery("SELECT r FROM Role r", Role.class);
        if (roleTQ.getResultList().size() != 0) {
            JsonObject jo = new JsonObject();
            jo.addProperty("status", "ERROR");
            jo.addProperty("msg", "Roles already exist");
            return jo;
        }
        TypedQuery<Background> backgroundTQ = em.createQuery("SELECT b FROM Background b", Background.class);
        if (backgroundTQ.getResultList().size() != 0) {
            JsonObject jo = new JsonObject();
            jo.addProperty("status", "ERROR");
            jo.addProperty("msg", "Backgrounds already exist");
            return jo;
        }

        RolePopulator.populateRoles(emf);
        BackgroundPopulator.populateBackgrounds(emf);

        JsonObject jo = new JsonObject();
        jo.addProperty("status", "SUCCESS");
        jo.addProperty("msg", "Roles and backgrounds created");
        return jo;
    }

}
