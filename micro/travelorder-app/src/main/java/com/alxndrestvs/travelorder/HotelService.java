package com.alxndrestvs.travelorder;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient(baseUri = "http://localhost:8082/hotel")
public interface HotelService {

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Hotel> hotels();

    @GET
    @Path("findById")
    public Hotel findById(@QueryParam("id") long id);

    @GET
    @Path("findByTravelOrderId")
    public Hotel findByTravelOrderId(@QueryParam("travelOrderId") long travelOrderId);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Hotel newHotel(Hotel hotel);
}
