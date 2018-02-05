package org.hibernatetutorial.services;

import org.hibernatetutorial.dao.DAO;
import org.hibernatetutorial.dao.UserDAOImpl;
import org.hibernatetutorial.model.User;

public class UserServiceImpl implements UserService  {

    private DAO dao = new UserDAOImpl();

    @Override
    public void create(int count) {
        dao.create(count);
    }

    @Override
    public User get(long id) {
        return (User) dao.get(id);
    }

    @Override
    public void update(User user) {
        dao.update(user);
    }
}
