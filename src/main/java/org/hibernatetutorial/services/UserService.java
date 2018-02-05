package org.hibernatetutorial.services;

import org.hibernatetutorial.model.User;

public interface UserService {

    void create(int count);

    User get(long id);

    void update(User user);

}
