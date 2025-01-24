package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User getOne(String id);
    void add(User user);
}
