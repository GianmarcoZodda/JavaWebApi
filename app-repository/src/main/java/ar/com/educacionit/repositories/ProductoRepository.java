package ar.com.educacionit.repositories;

import java.util.List;

import ar.com.educacionit.repository.dtos.ProductoDTO;

public interface ProductoRepository {
	
	
	public ProductoDTO getById(Long id);
	
	public ProductoDTO save(ProductoDTO producto);
	
	public void update(ProductoDTO productoDTO);
	
	public void delete(Long id);
	
	public List<ProductoDTO> findAll();

	public ProductoDTO getByCodigo(String codigo);

}
