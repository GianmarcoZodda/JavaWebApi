package ar.com.educacionit.repository.dtos;

public class ProductoDTO {
	
	private Long id;
	private String titulo;
	private Double precio;

	
	public ProductoDTO(Long id, String titulo, Double precio) {
		this.setId(id);
		this.setTitulo(titulo);
		this.setPrecio(precio);
	}
	
	
	private void setId(Long id) {
		this.id = id;
	}
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	private void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Long getId() {
		return id;
	}


	public String getTitulo() {
		return titulo;
	}


	public Double getPrecio() {
		return precio;
	}


	@Override
	public String toString() {
		return "ProductoDTO [id=" + id + ", titulo=" + titulo + ", precio=" + precio + "]";
	}
	
	
	

	
	
}
