package com.sdm.presentslk.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/home")
public class HomeController {
    @GET
    public Viewable index(){
        return new Viewable("/home");
    }
}
