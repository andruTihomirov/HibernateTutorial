package org.hibernatetutorial.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernatetutorial.model.User;
import org.hibernatetutorial.model.embedded.UserDetail;

public class UserDAOImpl implements DAO<User> {

    @Override
    public void create(int count) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        User user;
        UserDetail userDetail;
        for (int i = 0; i < 10; i++) {
            user = new User();
            userDetail = new UserDetail();
            userDetail.setLogin("Login_" + i);
            userDetail.setPassword("Password_" + i);
            user.setUserDetail(userDetail);
            session.save(user);
        }

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public User get(long id) {
        User user;

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        user = session.get(User.class, id);

        session.getTransaction().commit();
        session.close();

        return user;
    }

    @Override
    public void update(User user) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(user);

        session.getTransaction().commit();
        session.close();

    }
}
