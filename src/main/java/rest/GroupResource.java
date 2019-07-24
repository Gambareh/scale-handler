package rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/groups")
public class GroupResource {
	
	@GET
	public String getAllGroups() {
		return null;
	}
	
	@GET
	@Path("{id}")
	public String getSingleGroup(@PathParam("id") String id) {
		return null;
	}
	
	@POST
	@Produces("application/json")
	public String createGroup() {
		return null;
	}
	
	@PUT
	@Produces("application/json")
	public String updateGroup() {
		return null;
	}
	
	@DELETE
	public String deleteGroup() {
		return null;
	}
	
}
