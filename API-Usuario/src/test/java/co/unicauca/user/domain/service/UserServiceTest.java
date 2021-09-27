package co.unicauca.user.domain.service;

import co.unicauca.user.access.UserRepository;
import co.unicauca.user.domain.entity.User;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


/**
 *
* @author Beca98
 */
public class UserServiceTest {
    
    /**
     * Test of CRUD
     */

    @Test
    public void CrudUsers (){
    
        System.out.println("CRUD_User");
        UserService service = new UserService();
        service.setUserRepository(new UserRepository());
        
        
        List<User> listUsers = service.findAll();
        /* En la clase UserRepository se inserto un solo usuario
         * con datos USERNAME ='mfgranoble', ID = '1062', NAME = 'Mannuel',LASTNAME = 'Granoble',
         * PASSWORD = '123',CITY = 'popayan',ADDRESS = 'limonar',PHONE = '3127242012',TYPE = 'usuario'
         */
        assertEquals(1, listUsers.size());
        
        //Creacion de un usuario
        service.create(new User("magutierrez", "1061", "Michel", "Gutierrez","111","Popayan", "pandiguando", "3104564324","administrador"));
        //Buscar a un usuario por su userName
        User user = service.findByUserName("magutierrez");
        assertEquals("1061", user.getAtrIdentification());
        assertEquals("Michel", user.getAtrName());
        assertEquals("Gutierrez", user.getAtrLastName());
        assertEquals("111", user.getAtrPassword());
        assertEquals("Popayan", user.getAtrCity());
        assertEquals("pandiguando", user.getAtrAddress());
        assertEquals("3104564324", user.getAtrPhone());
        assertEquals("administrador", user.getAtrType());
        
        //Modificar la informacion de un usuario
        user.setAtrAddress("Esmeralda");
        service.update(user.getAtrUserName(), user);
        assertEquals("Esmeralda", user.getAtrAddress());
        
        //Eliminar un usuario
        service.delete("mfgranoble");
        user = service.findByUserName("mfgranoble");
        assertEquals(null,user);
        
    }
}
