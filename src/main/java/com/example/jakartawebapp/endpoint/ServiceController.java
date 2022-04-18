package com.example.jakartawebapp.endpoint;

import com.example.jakartawebapp.model.Service;
import com.example.jakartawebapp.services.ServiceService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/service")
public class ServiceController {

    @Inject
    ServiceService serviceService;

    @GET
    @Path("/findall")
    public Response findAll() {
        List<Service> serviceList = serviceService.findAll();
        return Response.ok(serviceList).build();
    }

}
