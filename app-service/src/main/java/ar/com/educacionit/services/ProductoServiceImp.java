package ar.com.educacionit.services;

import java.util.List;

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



	@Override
	public List<ProductoDTO> findAll() {
		return productoRepository.findAll();
	}



	@Override
	public void delete(Long id) {
		this.productoRepository.delete(id);
	}



	@Override
	public ProductoDTO create(ProductoDTO request) {
		return this.productoRepository.save(request);
	}



	@Override
	public ProductoDTO getByCodigo(String codigo) {
		return this.productoRepository.getByCodigo(codigo);
	}



	@Override
	public void update(ProductoDTO productoActualizar) {
		this.productoRepository.update(productoActualizar);
	}




}
