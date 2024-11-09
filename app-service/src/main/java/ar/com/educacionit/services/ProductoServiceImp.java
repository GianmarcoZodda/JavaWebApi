package ar.com.educacionit.services;

import ar.com.educacionit.repositories.ProductoRepository;
import ar.com.educacionit.repositories.implementations.ProductoRepositoryMysqlImp;
import ar.com.educacionit.repository.dtos.ProductoDTO;

public class ProductoServiceImp implements ProductoService{

	private ProductoRepository productoRepository;
	
	
	public ProductoServiceImp() {
		//la clase que implementa la interfaz, en este caso con mysql, pero puedo tener en oraclar, maria db, etc
		this.productoRepository = new ProductoRepositoryMysqlImp();
	}	
	
	
	
	@Override
	public ProductoDTO getById(Long id) {
		return productoRepository.getById(id);
	}

}
