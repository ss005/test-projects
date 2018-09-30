package com.test.restwithspring.dao;

import com.test.restwithspring.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    String status = "";

    @Autowired
    //HibernateTemplate hibernateTemplate;
    private SessionFactory sessionFactory;

    @Override
    public List<User> listAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaQuery<User> criteriaQuery = session.getCriteriaBuilder().createQuery(User.class);
        criteriaQuery.from(User.class);
        Query<User> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }

    @Override
    public User findById(int id) {
        User user = sessionFactory.getCurrentSession().get(User.class, id);
        return user;
    }

    @Override
    public int saveUser(User user) {
        sessionFactory.getCurrentSession().save(user);
        return user.getId();
    }

    @Override
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public void deleteUserById(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.load(User.class, id);
        session.delete(user);
    }

    @Override
    public void deleteAllUsers() {
        Session session = sessionFactory.getCurrentSession();
    }
}
