package ar.com.educacionit.repository.dtos;

public class ProductoDTO {
	
	private Long id;
	private String titulo;
	private String codigo;
	private Double precio;

	public ProductoDTO() {
		
	}
	
	public ProductoDTO(Long id, String titulo, Double precio) {
		this.setId(id);
		this.setTitulo(titulo);
		this.setPrecio(precio);
	}
	
	
	public void setId(Long id) {
		if(id == null || id < 0) {
			throw new IllegalArgumentException("Id no puede ser nulo ni < 0");//runtime
		}
		//al final todo ok 
		this.id = id;
	}
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	private void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Long getId() {
		return id;
	}


	public String getTitulo() {
		return titulo;
	}
	
	public String getCodigo() {
		return this.codigo;
	}


	public Double getPrecio() {
		return precio;
	}


	@Override
	public String toString() {
		return "ProductoDTO [id=" + id + ", titulo=" + titulo + ", precio=" + precio + "]";
	}
	
	
	

	
	
}
