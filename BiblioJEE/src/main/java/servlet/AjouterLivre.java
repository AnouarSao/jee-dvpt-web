package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LivreDao;
import dao.AuteurDao;
import dao.DaoException;
import dao.DaoFactory;
import model.Auteur;
import model.Livre;

/**
 * Servlet implementation class ajouterLivre
 */
@WebServlet("/ajouterLivre")
public class AjouterLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AuteurDao auteurDao;
	private LivreDao livreDao;
  
	
    public AjouterLivre() {
        super();
        
        auteurDao = DaoFactory.getInstance().getAuteurDao();
        livreDao = DaoFactory.getInstance().getLivreDao();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			request.setAttribute("auteurs",auteurDao.lister());
			
		
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/ajouterLivre.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		long id = Long.parseLong(request.getParameter("idAuteur"));
		
		try {
			Auteur auteur = auteurDao.trouver(id);
			
			String titre = request.getParameter("titreLivre");
			int nbPages = Integer.parseInt(request.getParameter("nbPagesLivre"));
			String categorie = request.getParameter("categorieLivre");
			
			Livre livre = new Livre();
			
			livre.setAuteur(auteur);
			livre.setTitre(titre);
			livre.setNbPages(nbPages);
			livre.setCategorie(categorie);
			
			livreDao.creer(livre);
			
			request.getSession().setAttribute("confirmMessage", "Le livre a bien été ajouté !");
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		response.sendRedirect( request.getContextPath() + "/listeLivres" );
	}

}
