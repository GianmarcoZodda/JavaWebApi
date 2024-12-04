package ar.com.educacionit.services;
import java.util.List;

import ar.com.educacionit.repository.dtos.ProductoDTO;

public interface ProductoService {

	public ProductoDTO getById(Long id);
	
	public List<ProductoDTO> findAll();
	
	public void delete(Long id);
	
	public ProductoDTO create(ProductoDTO request);

	public ProductoDTO getByCodigo(String codigo);

	public void update(ProductoDTO productoActualizar);
	
}
