package miniProject;

import java.util.ArrayList;
import java.util.List;

public class UserServiceInMemory implements UserService {
    private List<User> users;

    public UserServiceInMemory() {
        this.users = new ArrayList<>();
    }

    public UserServiceInMemory(List<User> users) {
        this.users = new ArrayList<>(users);
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public boolean deleteUser(String email) {
        int userIndex = this.findUserByEmail(email);
        if (userIndex == -1) return false;
        users.remove(userIndex);
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        int userIndex = this.findUserByEmail(user.getEmail());
        if (userIndex == -1) return false;
        users.set(userIndex, user);
        return true;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public boolean isExistUser(String email) {
        return findUserByEmail(email) == -1;
    }

    private int findUserByEmail(String email) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(email)) {
                return i;
            }
        }
        return -1;
    }
}
