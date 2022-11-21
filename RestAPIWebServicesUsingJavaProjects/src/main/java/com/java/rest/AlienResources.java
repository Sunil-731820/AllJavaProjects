package com.java.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResources {

	@GET
	@Path("/alien")
	@Produces(MediaType.APPLICATION_XML)
	public Alien  getAlien() {
		Alien a1 = new Alien();
		a1.setName("Navin");
		a1.setPoints(20);
		return a1;
	}
	
}
