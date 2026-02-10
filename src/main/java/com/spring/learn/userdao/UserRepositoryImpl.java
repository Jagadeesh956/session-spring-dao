package com.spring.learn.userdao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{

    EntityManager entityManager;

    @Autowired
    public UserRepositoryImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Transactional
    @Override
    public long saveUser(long Id) {

        String sql = "INSERT INTO users (id) VALUES (:id)";
        entityManager.createNativeQuery(sql).setParameter("id",Id).executeUpdate();
       return Id;
    }

    public User getUserById(long Id){
        return new User(Id);
    }
}
