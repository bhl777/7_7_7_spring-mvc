package web.dao;

import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    void add(User user);
    void deleteUser(int id);
    void updateUser(int id);
}
