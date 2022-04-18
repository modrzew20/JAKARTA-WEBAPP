package com.example.jakartawebapp.services;

import com.example.jakartawebapp.ejb.facades.AddedServiceFacade;
import com.example.jakartawebapp.model.AddedService;
import jakarta.inject.Inject;

import java.util.List;

public class AddedServiceService {
    @Inject
    AddedServiceFacade addedServiceFacade;

    public List<AddedService> findAll() {
        return addedServiceFacade.findAll();
    }
}
