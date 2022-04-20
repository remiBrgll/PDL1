package model;

public class Organisateur {
	

	private Integer IdOrga;
	private String Nom;
	private String Prenom;

	
	public Organisateur(Integer IdOrga, String Nom, String Prenom) {
		

	this.IdOrga = IdOrga;   
	this.Prenom = Prenom;
	this.Nom = Nom;
	}

	public Integer getIdOrga() {
	return IdOrga;
	}
	public void setIdOrga(Integer IdOrga) {
	this.IdOrga = IdOrga;
	}
	public String getPrenom() {
	return Prenom;
	}
	public void setAddress(String Prenom) {
	this.Prenom = Prenom;
	}
	public String getNom() {
	return Nom;
	}
	public void setEmail(String Nom) {
	this.Nom = Nom;
	}
	@Override
	public String toString() {
	return "Fournisseur [ref : " + IdOrga
	+ ", " + Prenom + ", " + Nom + "]";
	}



 }

