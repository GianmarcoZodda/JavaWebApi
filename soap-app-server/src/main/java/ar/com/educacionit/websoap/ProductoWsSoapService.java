package ar.com.educacionit.websoap;


import ar.com.educacionit.websoap.imp.WSProductoDTO;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ProductoWsSoapService {

	@WebMethod
	public WSProductoDTO getProductoById(Long id);
	
}
