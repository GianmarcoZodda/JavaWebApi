package ar.com.educacionit.repositories.implementations;

import ar.com.educacionit.repositories.ProductoRepository;
import ar.com.educacionit.repository.dtos.ProductoDTO;

public class ProductoRepositoryMysqlImp implements ProductoRepository{

	@Override
	public ProductoDTO getById(Long id) {
		String sql = "SELECT * from Producto where id="+id;
		System.out.println(sql);
		
		//simulo el product
		Long _id = id;
		String titulo = "producto de la db";
		Double precio = 1500.75d;
		
		return new ProductoDTO(_id, titulo, precio);
	}

	@Override
	public void saveProductoDTO(ProductoDTO producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductoDTO updateProductoDTO(ProductoDTO productoDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO deleteProductoDTO(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



}
