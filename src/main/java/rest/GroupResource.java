package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

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
	
	public String createGroup() {
		return null;
	}
	
	public String updateGroup() {
		return null;
	}
	
	public String deleteGroup() {
		return null;
	}
	
}
