package com.example.jakartawebapp.services;

import com.example.jakartawebapp.ejb.facades.ServiceFacade;
import com.example.jakartawebapp.model.Service;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@Transactional(Transactional.TxType.REQUIRED)
public class ServiceService {

    @Inject
    ServiceFacade serviceFacade;

    public List<Service> findAll() {
        return serviceFacade.findAll();
    }
}
