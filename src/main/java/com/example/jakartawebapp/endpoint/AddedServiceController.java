package com.example.jakartawebapp.endpoint;

import com.example.jakartawebapp.model.AddedService;
import com.example.jakartawebapp.services.AddedServiceService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/addedservice")
public class AddedServiceController {

    @Inject
    AddedServiceService addedServiceService;

    @GET
    @Path("/findall")
    public Response findAll() {
        List<AddedService> addedServiceList = addedServiceService.findAll();
        return Response.ok(addedServiceList).build();
    }


}
