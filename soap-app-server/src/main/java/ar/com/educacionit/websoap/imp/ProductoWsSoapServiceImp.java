package ar.com.educacionit.websoap.imp;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.ProductoServiceImp;
import ar.com.educacionit.websoap.ProductoWsSoapService;
import jakarta.jws.WebService;

@WebService(endpointInterface = "ar.com.educacionit.websoap.ProductoWsSoapService")
public class ProductoWsSoapServiceImp implements ProductoWsSoapService{

	private ProductoService productoService;
	
	public ProductoWsSoapServiceImp() {
		this.productoService = new ProductoServiceImp();
	}

	@Override
	public WSProductoDTO getProductoById(Long id) {
		ProductoDTO dto = productoService.getById(id);
		return new WSProductoDTO(dto.getId(), dto.getTitulo(), dto.getPrecio());
	}

}
