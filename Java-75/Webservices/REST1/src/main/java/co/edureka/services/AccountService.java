package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/account")
public class AccountService {
 @POST
 @Produces("text/html")
 @Path("/newaccount")
 public String createNewAccount(@FormParam("acno") Long acno, @FormParam("name") String name,@FormParam("bal") Float bal) {
	 String response = "<h2>A/C No: "+acno+"<br><br>Name: "+name+"<br><br>Balance: "+bal+"</h2>";
	 return response;
 }
}
