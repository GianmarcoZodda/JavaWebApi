package ar.com.educacionit.repositories;

import ar.com.educacionit.repository.dtos.ProductoDTO;

public interface ProductoRepository {
	
	
	public ProductoDTO getById(Long id);
	
	public void saveProductoDTO(ProductoDTO producto);
	
	public ProductoDTO updateProductoDTO(ProductoDTO productoDTO);
	
	public ProductoDTO deleteProductoDTO(Long id);

}
