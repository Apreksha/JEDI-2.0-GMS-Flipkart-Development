package com.flipkart.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * 
 */
@Path("/employees")
public class HelloController {


  @GET
  public String getEmployees() {
    return "my Drop Wizard service";
  }
}