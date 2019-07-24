package rest;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RestClientConfig {
	
	
	
	public RestClientConfig () {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(getBaseUri());
	}
	
	private static URI getBaseUri() {
		return UriBuilder.fromUri("http://localhost:8080/").build(); 
	}
}
