package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exo3Servlet
 */

public class Exo3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exo3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * String parameter = request.getParameter("name");
		 * 
		 * if(parameter == null) { request.setAttribute("name",
		 * "Bonjour PAS DE NAME, je suis faché !"); }else { request.setAttribute("name",
		 * "Bonjour NAME, je suis dans la joie !"); }
		 */
		
		if(request.getParameter("name") != null) {
				
			  String result = request.getParameter("name");
			  String name = "Bonjour " + result.toUpperCase();
			  request.setAttribute("name", name);
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Exo3.jsp").forward(request, response);
	}
}