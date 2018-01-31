package org.hibernatetutorial;

import org.hibernatetutorial.model.User;
import org.hibernatetutorial.services.UserService;
import org.hibernatetutorial.services.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        // userService.create(10);
        User user = userService.get(16);
        System.out.println(user.getUserDetail().getLogin() + " " + user.getUserDetail().getPassword());
    }

}
