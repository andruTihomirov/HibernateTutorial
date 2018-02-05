package org.hibernatetutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernatetutorial.model.User;
import org.hibernatetutorial.services.UserService;
import org.hibernatetutorial.services.UserServiceImpl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory;
        Session session;

        UserService userService = new UserServiceImpl();
        // userService.create(10);
//        User user = userService.get(16);
//        System.out.println("Before update: " + user.getUserDetail().getLogin() + " " + user.getUserDetail().getPassword());
//        user.getUserDetail().setLogin("new login");
//        user.getUserDetail().setPassword("new password");
//        userService.update(user);
//        System.out.println("After update: " +  user.getUserDetail().getLogin() + " " + user.getUserDetail().getPassword());

        sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();

//        Query query = session.getNamedQuery("User.byId");
//        Query query = session.getNamedQuery("User.byLogin");
//        query.setParameter(0, 10L);
//        List<User> users = (List<User>) query.list();

        // first level cache
//        User user0 = session.get(User.class, 10L);
//        user0.getUserDetail().setLogin("updated1");
//        User user1 = session.get(User.class, 10L);
//        System.out.println(user1.getUserDetail().getLogin());

//        session.getTransaction().commit();
//        session.close();
//
//        // using second level cache (no select query)
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        User user1 = session.get(User.class, 10L);
//
        List users = session.createQuery("from User where id = ?")
                .setCacheable(true)
                .setParameter(0, 10L)
                .setCacheRegion("user.cache").list();

        session.getTransaction().commit();
        session.close();

        sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();

        users = session.createQuery("from User where id = ?")
            .setCacheable(true)
            .setParameter(0, 10L)
            .setCacheRegion("user.cache").list();

        session.getTransaction().commit();
        session.close();

        System.exit(0);
    }

}
