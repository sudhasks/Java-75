package co.edureka;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ClientTest {
 public static void main(String[] args) {
	 String baseURL = "http://localhost:65535/REST1/";
	 
	 // 1. Create on empty Client object
	 Client client = ClientBuilder.newClient();	
	 
	// 2. add url to Client, get WebTarget
    WebTarget webTarget = client.target(baseURL);
    
    //3. make a call to resource and get response
    String response = webTarget.path("rest/edureka").request().accept(MediaType.TEXT_HTML).get(String.class);
    System.out.println(response);
 }
}
