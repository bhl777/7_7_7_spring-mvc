package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import web.config.DbConfig;
import web.model.User;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDaoImpl implements UserDao{

    @Override
    public List<User> getAll() {
        return List.of();
    }

    @Override
    public User getOne(String id) {
        return null;
    }

    @Override
    public void add(User user) {

    }
}
