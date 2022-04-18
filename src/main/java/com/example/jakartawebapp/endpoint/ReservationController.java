package com.example.jakartawebapp.endpoint;

import com.example.jakartawebapp.model.Reservation;
import com.example.jakartawebapp.services.ReservationService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;


@Path("/reservation")
public class ReservationController {

    @Inject
    ReservationService reservationService;

    @GET
    @Path("/findall")
    public Response findAll() {
        List<Reservation> reservationsList = reservationService.findAll();
        return Response.ok(reservationsList).build();

    }




}
