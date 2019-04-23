package com.eureka.helloworld.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/demoResource")
public class DemoResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDemoResource() {
		return Response.ok().entity(new DemoResourceTO("resource1", 1)).build();
	}
}
