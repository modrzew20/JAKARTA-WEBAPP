package com.example.jakartawebapp.ejb.facades;

import com.example.jakartawebapp.common.AbstractFacade;
import com.example.jakartawebapp.model.Reservation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ReservationFacade extends AbstractFacade<Reservation> {

    @PersistenceContext(unitName = "HerokuUser")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReservationFacade() {
        super(Reservation.class);
    }

    public List<Reservation> findAll() {
        TypedQuery<Reservation> typedQuery = em.createNamedQuery("Reservation.findAll", Reservation.class);
        return typedQuery.getResultList();
    }
}
