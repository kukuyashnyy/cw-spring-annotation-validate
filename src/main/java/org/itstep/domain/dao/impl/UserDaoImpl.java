package org.itstep.domain.dao.impl;


import org.itstep.domain.entity.User;
import org.itstep.domain.dao.UserDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User update(User user) {
        return entityManager.merge(user);
    }

    @Override
    public User findById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> findAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Override
    public Boolean isExist(String login) {
        for (User user : findAll()) {
            if (user.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }
}
