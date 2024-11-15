package ar.com.educacionit.client.imp;

import com.example.soap.client.ProductoWsSoapService;
import com.example.soap.client.ProductoWsSoapServiceImpService;
import com.example.soap.client.WsProductoDTO;

import ar.com.educacionit.client.SoapClient;
import ar.com.educacionit.repository.dtos.ProductoDTO;

public class SoapClientCXFImp implements SoapClient{

	@Override
	public ProductoDTO getById(Long id) {
		System.out.println("SoapClientCXFImp");
		
		//instanciamos el cliente
		ProductoWsSoapServiceImpService _service = new ProductoWsSoapServiceImpService();
		
		//accedemos al port
		ProductoWsSoapService service = _service.getProductoWsSoapServiceImpPort();
		
		//invocamos uno de los sercicios getProdctoBy
		WsProductoDTO wsDto = service.getProductoById(5L);
		
		//retornamos 
		return new ProductoDTO(wsDto.getId(), wsDto.getTitulo(), wsDto.getPrecio());
	}
	
}
