package com.example.rest;

import com.example.exception.CustomException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class JerseyHelloWorldService {
    @GET
    @Path("/{message}")
    public Response getMsg(@PathParam("message") String msg) {
        String output = "Message requested : " + msg;

        if ("exception".equals(msg)) {
            throw new CustomException("Custom exception occurred...");

        }
        //Simply return the parameter passed as message
        return Response.status(200).entity(output).build();
    }
}