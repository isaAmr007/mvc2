package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.DAOHib;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    DAOHib daoHib;

    @Override
    public void updateUser(User user) {
        daoHib.updateUser(user);

    }

    @Override
    public void removeUserById(int id) {
        daoHib.removeUserById(id);

    }

    @Override
    public List<User> getAllUsers() {

        return daoHib.getAllUsers();
    }

    @Override
    public User getUserById(int id) {

        return daoHib.getUserById(id);
    }
}
