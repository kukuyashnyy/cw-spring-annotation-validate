package org.itstep.domain.dao;

import org.itstep.domain.entity.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    User update(User user);
    User findById(int id);
    List<User> findAll();
    void delete(User user);
}
