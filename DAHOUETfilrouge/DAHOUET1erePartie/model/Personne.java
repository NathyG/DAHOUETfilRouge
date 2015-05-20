package model;

public class Personne {

	protected String nom;
	protected String mail;
	protected String prenom;

	// constructeur d'initialisation ( instantation avec parametres)

	public Personne(String nom, String mail, String prenom) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.prenom = prenom;
	}

	// On définit les getters & setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	// Affiche

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", mail=" + mail + ", prenom=" + prenom
				+ "]";
	}

	public static void affiche(Personne p) {
		System.out.println("Personne: " + p.toString());
	}

	// test de l'email
	public static Boolean ctlMail(String email) {

		boolean okmail;

		if (email
				.matches("^[a-zA-Z0-9._-]{2,}+@[a-zA-Z0-9._-]{2,}\\.[a-z]{2,4}$"))
			okmail = true;

		else

			okmail = false;

		return okmail;

	}

}
