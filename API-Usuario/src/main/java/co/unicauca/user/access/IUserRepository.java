package co.unicauca.user.access;

import co.unicauca.user.domain.entity.User;
import java.util.List;

/**
 *
 * @author Beca98
 */
public interface IUserRepository {
    
    List<User> findAll();

    User findByUserName(String prmUserName);

    boolean create(User prmNewUser);

    boolean update(User prmNewUser);

    boolean delete(String prmUserName);

    
}
