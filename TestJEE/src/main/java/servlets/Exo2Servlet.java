package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exo2Servlet
 */

public class Exo2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exo2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * String parameter = request.getParameter("isGood");
		 * 
		 * int value;
		 * 
		 * if(parameter == null) { value = 0; }else { try { value =
		 * Integer.valueOf(parameter); } catch (Exception e) { value = 0; } }
		 * 
		 * 
		 * if(value == 0) { request.setAttribute("isGood", "Ce n'est pas bon !"); }else
		 * if(value ==1) { request.setAttribute("isGood", "C'est bon !"); }else {
		 * request.setAttribute("isGood", "Erreur 404 (valeur = 0 ou 1) !"); }
		 */
		
		if(request.getParameter("isGood") != null) {
			String result = null;
			if(request.getParameter("isGood").equals("0")) {
				result = "Ce n'est pas bon !";
			}else {
				result = "C'est bon !";
			}
			request.setAttribute("isGood", result);	
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Exo2.jsp").forward(request, response);
	}



}
