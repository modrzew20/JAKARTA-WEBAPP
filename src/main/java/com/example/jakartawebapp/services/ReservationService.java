package com.example.jakartawebapp.services;

import com.example.jakartawebapp.ejb.facades.ReservationFacade;
import com.example.jakartawebapp.model.Reservation;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;


@Transactional(Transactional.TxType.REQUIRED)
public class ReservationService {

    @Inject
    private ReservationFacade reservationFacade;

    public List<Reservation> findAll(){
        return reservationFacade.findAll();
    }
}
