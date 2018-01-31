package org.hibernatetutorial.dao;

public interface DAO<T> {

    void create(int count);

    T get(long id);

}
