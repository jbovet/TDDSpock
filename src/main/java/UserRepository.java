import exceptions.DuplicateUserException;

/**
 * Created by josebovet on 8/4/16.
 */
public interface UserRepository {

    int insertUser(User user) throws DuplicateUserException;
}
