package com.alxndrestvs.travelorder;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8081/flight")
public interface FlightService {

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Flight> flights() {
//        return Flight.listAll();
//    }

    @GET
    @Path("findById")
    public Flight findById(@QueryParam("id") long id);

    @GET
    @Path("findByTravelOrderId")
    public Flight findByTravelOrderId(@QueryParam("travelOrderId") long travelOrderId);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Flight newFlight(Flight flight);
}
