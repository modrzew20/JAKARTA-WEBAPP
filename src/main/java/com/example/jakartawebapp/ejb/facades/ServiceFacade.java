package com.example.jakartawebapp.ejb.facades;

import com.example.jakartawebapp.common.AbstractFacade;
import com.example.jakartawebapp.model.Service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ServiceFacade extends AbstractFacade<Service> {

    @PersistenceContext(unitName = "HerokuUser")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServiceFacade() {
        super(Service.class);
    }

    public List<Service> findAll() {
        TypedQuery<Service> typedQuery = em.createNamedQuery("Service.findAll", Service.class);
        return typedQuery.getResultList();
    }
}
