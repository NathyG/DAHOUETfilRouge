package model;

public class Proprietaires extends Personne {

	private String telephone;
	private String adresse;

	// constructeur d'initialisation ( instantation avec parametres)
	public Proprietaires(String nom, String mail, String prenom,
			String telephone, String adresse) {
		super(nom, mail, prenom);
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.mail = mail;
		this.prenom = prenom;
		this.telephone = telephone;
		this.adresse = adresse;
	}

	// getters & setters
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Proprietaire [telephone=" + telephone + ", adresse=" + adresse
				+ ", nom=" + nom + ", mail=" + mail + ", prenom=" + prenom
				+ "]";
	}

	public void affiche() {
		System.out.println("Propriétaire: " + super.toString());

	}

}
