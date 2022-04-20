
	package DAO;
	import java.sql.*;
	import java.util.ArrayList;
	import model.Organisateur;
	
	public class OrganisateurDAO extends ConnectionDAO {
	public OrganisateurDAO() {
	super();
	}
	public int add(Organisateur Organisateur) {
	Connection con = null;
	PreparedStatement ps = null;
	int returnValue = 0;
	
	
	
	// connexion a la base de donnees
	
	try {
	// tentative de connexion
		
		con = DriverManager.getConnection(URL, LOGIN, PASS);
	// preparation de l'instruction SQL, chaque ? represente une valeur
	// a communiquer dans l'insertion.
	// les getters permettent de recuperer les valeurs des attributs souhaites
	
	ps = con.prepareStatement("INSERT INTO organisateur (IdOrga, Nom, Prenom) VALUES (ORGANISATEUR_SEQ.nextVal, ?, ?)");
	ps.setString(2,  Organisateur.getNom());
	ps.setString(3, Organisateur.getPrenom());
	// Execution de la requete
	returnValue = ps.executeUpdate();
	} catch (Exception e) {
	e.printStackTrace();
	} finally {
	// fermeture du preparedStatement et de la connexion
	try {
	if (ps != null) {
	ps.close();
	}
	} catch (Exception ignore) {
	}
	try {
	if (con != null) {
	con.close();
	}
	} catch (Exception ignore) {
	}
	}
	return returnValue;

	}
	}
	
