package ar.com.educacionit.javawebapi.controllers;

import java.io.IOException;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.ProductoServiceImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/producto")
public class ProductoController extends HttpServlet{

	private ProductoService productoService;
	
	public ProductoController() {
		this.productoService = new ProductoServiceImp();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Long idL = Long.parseLong(req.getParameter("id"));
		System.out.println("el id es: "+idL);
		
		ProductoDTO productoDTO = productoService.getById(idL);
		
		//propio de los Servlet, para escribir en el reponse
				//resp.getWriter().print(productoDto.toString());
				
				//guarda en la sesion el objeto de la DB
				//se guarda con Object
				req.getSession().setAttribute("PRODUCTO", productoDTO);
				
				//redirect
				getServletContext().getRequestDispatcher("/datos.jsp").forward(req, res);
	}
	
}
