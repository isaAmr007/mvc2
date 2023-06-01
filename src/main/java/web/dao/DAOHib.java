package web.dao;

import web.model.User;

import java.util.List;

public interface DAOHib {
    void updateUser(User user);

    void removeUserById(int id);

    List<User> getAllUsers();

    User getUserById(int id);
}
