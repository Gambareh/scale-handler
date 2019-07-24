package rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/users")
public class UserResource {
	
	@POST
	@Path("/checkUser")
	public String checkUser() {
		return null;
	}

}
