package com.GameTrainingChallenge.domain.repository;

import com.GameTrainingChallenge.domain.LoginUsers;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class CreateUserLogin implements CreateUserLoginInterace {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void createUserLogin(LoginUsers user) {
        LoginUsers newUser = new LoginUsers(user);

        entityManager.persist(newUser);
    }
}
