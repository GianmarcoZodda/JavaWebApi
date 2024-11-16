package ar.com.educacionit.config;

import org.glassfish.jersey.server.ResourceConfig;

public class AppWsRestApplication extends ResourceConfig{
	
	public AppWsRestApplication() {
		System.out.println("Se ha creado la configuracion");
	}
	
}
