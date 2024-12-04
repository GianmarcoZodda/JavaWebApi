package ar.com.educacionit.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class AppWsRestApplication extends ResourceConfig{
	
	public AppWsRestApplication() {
		register(JacksonFeature.class);
		System.out.println("Se ha creado la configuracion");
	}
	
}
