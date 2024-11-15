package ar.com.educacionit.client;

import com.example.soap.client.ProductoWsSoapService;
import com.example.soap.client.ProductoWsSoapServiceImpService;
import com.example.soap.client.WsProductoDTO;

public class WsSoapClientMain {
	
	public static void main(String[] args) {
		//instanciamos el cliente
		ProductoWsSoapServiceImpService _service = new ProductoWsSoapServiceImpService();
		//accedemos al port
		ProductoWsSoapService service = _service.getProductoWsSoapServiceImpPort();
		//invocamos uno de los sercicios getProdctoBy
		WsProductoDTO dto = service.getProductoById(5L);
		
		System.out.println(dto.getTitulo());
		System.out.println(dto.getId());
		System.out.println(dto.getPrecio());
	}

}
