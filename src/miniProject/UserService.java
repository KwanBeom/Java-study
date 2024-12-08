package miniProject;

import java.util.List;

public interface UserService {
    public void addUser(User user);

    public boolean deleteUser(String email);

    public boolean updateUser(User user);

    public List<User> getUsers();

    public boolean isExistUser(String email);
}
