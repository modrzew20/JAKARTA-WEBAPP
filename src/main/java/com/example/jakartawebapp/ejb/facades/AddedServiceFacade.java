package com.example.jakartawebapp.ejb.facades;

import com.example.jakartawebapp.common.AbstractFacade;
import com.example.jakartawebapp.model.AddedService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class AddedServiceFacade extends AbstractFacade<AddedService> {
    @PersistenceContext(unitName = "HerokuUser")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AddedServiceFacade() {
        super(AddedService.class);
    }

    public List<AddedService> findAll() {
        TypedQuery<AddedService> typedQuery = em.createNamedQuery("AddedService.findAll", AddedService.class);
        return typedQuery.getResultList();
    }

}
