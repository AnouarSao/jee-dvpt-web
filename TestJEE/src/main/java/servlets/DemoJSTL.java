package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoJSTL
 */
@WebServlet("/demoJSTL")
public class DemoJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoJSTL() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Exo1 avec JSTL
		  List<String> listeFruits = new ArrayList<>(); 
		  listeFruits.add("banane");
		  listeFruits.add("orange"); 
		  listeFruits.add("ananas");
		  listeFruits.add("fraise"); 
		  listeFruits.add("pomme");
		  listeFruits.add("banane"); 
		  listeFruits.add("orange");
		  listeFruits.add("ananas"); 
		  listeFruits.add("fraise");
		  listeFruits.add("pomme"); 
		  listeFruits.add("🍌");
		  
		  request.setAttribute("fruits", listeFruits);
		  
		  
		  // Exo2 avec JSTL
		  request.setAttribute("isGood", request.getParameter("isGood"));
		 
		
		  this.getServletContext().getRequestDispatcher("/WEB-INF/DemoJSTL.jsp").forward(request, response);
	
	}
}
