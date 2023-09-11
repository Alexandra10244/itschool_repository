package session11.userservice;

public interface UserService {

    void createUser(User user);

    User findUserById(long id);

    void deleteUser(long id);
}
