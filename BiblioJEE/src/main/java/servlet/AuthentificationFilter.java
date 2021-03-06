package servlet;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class TestFilter
 */
@WebFilter("/*") //Filtrer toutes les servlets
//@WebFilter(urlPatterns = {"/supprimerAuteur", "/supprimerLivre"}) //Filtrer une liste de servlets
public class AuthentificationFilter extends HttpFilter {

	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		if(!request.getRequestURI().contains("/erreur.jsp")) {
			if(request.getParameter("authentificated") == null || !request.getParameter("authentificated").equals("1")) {
				response.sendRedirect( request.getContextPath() + "/erreur.jsp" );
				return;
			}
		}
		
		chain.doFilter(request, response);	
	}


}