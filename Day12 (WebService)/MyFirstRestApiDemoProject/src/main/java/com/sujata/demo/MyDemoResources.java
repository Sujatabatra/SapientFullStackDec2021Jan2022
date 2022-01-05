package com.sujata.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sujata.service.GoodEvening;
import com.sujata.service.GoodMorning;
import com.sujata.service.Greet;

@Path("greetings")
public class MyDemoResources {

	private Greet greet;
	
	@Path("/mrng/{na}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String greetMorning(@PathParam("na") String name) {
		greet=new GoodMorning();
		return "<H1>"+greet.wish(name)+"</H1>";
	}
	
	@Path("/eve/{na}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String greetEvening(@PathParam("na") String name) {
		greet=new GoodEvening();
		return "<H1>"+greet.wish(name)+"</H1>";
	}
}
