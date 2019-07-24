package rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/articals")
public class ArticalResource {
	
	@GET
	@Produces("application/json")
	public String getArticals(){
		return null;		
	}
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public String getSingleArtical(@PathParam("id") String id) {
		return null;		
	}
	
	
	@POST
	@Produces("application/json")
	public String createArtical() {
		return null;
		
	}
	
	@DELETE
	@Produces("application/json")
	public String deleteArtical() {
		return null;	
	}
	
	
}
