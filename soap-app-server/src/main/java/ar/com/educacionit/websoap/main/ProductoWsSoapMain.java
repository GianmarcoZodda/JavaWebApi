package ar.com.educacionit.websoap.main;

import ar.com.educacionit.websoap.imp.ProductoWsSoapServiceImp;
import jakarta.xml.ws.Endpoint;

public class ProductoWsSoapMain {

	public static void main(String[] args) {
		System.out.println("Publicando Servicio Web de producto...");

		Endpoint.publish("http://localhost:8001/", new ProductoWsSoapServiceImp());
		
		System.out.println("Servicio Web de producto iniciado en http://localhost:8001/");
		
		System.out.println("La direccion del wsdl es: http://localhost:8001/?wsdl");
	}
	
}
