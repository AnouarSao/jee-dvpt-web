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
 * Servlet implementation class FruitsServlets
 */

public class Exo1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exo1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
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
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Exo1.jsp").forward(request, response);
	}

}
