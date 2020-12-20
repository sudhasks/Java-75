package co.edureka.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/edureka")
public class EdurekaService {
	@GET
	@Produces("text/html")
	public String localService() {
		return "<h2>Welcome to Edureka Customer Support @ INDIA </h2>";
	}

	@GET
	@Produces("text/html")
	@Path("/nri")
	public String internationalService() {
		return "<h2>Welcome to Edureka I18N Customer Support</h2>";
	}

	@GET
	@Path("{name}/{course}")
	@Produces("text/html")
	public String enquiry(@PathParam("name") String name, @PathParam("course") String course) {
		return "<h2>Customer Name - " + name + "<br>Course Name - " + course + "</h2>";
	}

	@GET
	@Path("/enquiry")
	//@Produces("text/html")
	@Produces(MediaType.TEXT_HTML)
	public String enquiry1(@QueryParam("name") String name, @QueryParam("course") String crs) {
		String output = "<h2>Customer Name : " + name + "<br><br> Course Name : " + crs + "</h2>";
		return output;
	}
	
}
