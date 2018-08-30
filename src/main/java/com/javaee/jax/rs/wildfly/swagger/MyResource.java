package com.javaee.jax.rs.wildfly.swagger;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "customers")
@Path("/fruit")
public class MyResource {

    @GET
    @ApiOperation(value = "Get all", notes = "A super note")
    public String get() {
        System.out.println("GET");
        return Database.getAll();
    }

    @GET
    @Path("{name}")
    @ApiOperation(value = "Get a specific fruit", notes = "A super note")
    public String get(@PathParam("name") String payload) {
        System.out.println("GET");
        return Database.get(payload);
    }

    @POST
    @ApiOperation(value = "Create a fruit", notes = "A super note")
    public void post(String payload) {
        System.out.println("POST");
        Database.add(payload);
    }

    @PUT
    @ApiOperation(value = "Create a fruit", notes = "A super note")
    public void put(String payload) {
        System.out.println("PUT");
        Database.add(payload);
    }

    @DELETE
    @Path("{name}")
    @ApiOperation(value = "Delete a fruit", notes = "A super note")
    public void delete(@PathParam("name") String payload) {
        System.out.println("DELETE");
        Database.delete(payload);
    }
}