package com.GameTrainingChallenge.utils;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class PermissionsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void addPermissions(Permissions permissions){
        entityManager.persist(permissions);
    }
}
