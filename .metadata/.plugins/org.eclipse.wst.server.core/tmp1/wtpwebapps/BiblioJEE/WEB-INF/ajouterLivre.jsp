<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout livre</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/inc/style.css" />" />
</head>
<body>
	<c:import url="/WEB-INF/menu.jsp" />

	<div class="form">
		<form method="post" action="<c:url value="/ajouterLivre" />">
		
			<fieldset>
				<legend>Créer un livre</legend>
				
				
            	<label for="auteur">Choisir auteur </label>							
				<select name= "idAuteur" id="idAuteur">
						<option value="idAuteur">-- Choisir auteur --</option>
							<c:forEach items="${ auteurs }" var="auteur">
			                	<option value="<c:out value="${ auteur.id }"/>"><c:out value="${ auteur.prenom }"/> <c:out value="${ auteur.nom }"/></option>
		                	</c:forEach>
	            </select>
            	<br />
		
				<label for="nbPagesLivre">Nombre de Pages</label>
				<input type="number" id="nbPagesLivre" name="nbPagesLivre" size="10" />
				<br/>
				
				<label for="titreLivre">Titre</label>
				<input type="text" id="titreLivre" name="titreLivre" size="50" />
				<br/>
				
				<label for="categorieLivre">Catégorie</label>
				<input type="text" id="categorieLivre" name="categorieLivre" size="20" />
				<br/>
			
			</fieldset>
		
			<input type="submit" value="Valider" />
			<input type="reset" value="Remettre à zéro" />
		</form>
	</div>
</body>
</html>