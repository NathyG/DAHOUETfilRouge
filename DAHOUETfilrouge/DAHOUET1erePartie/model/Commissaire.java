package model;

public class Commissaire extends Personne {

	private String comite;

	public Commissaire(String nom, String mail, String prenom, String commite) {
		super(nom, mail, prenom);
		this.comite = commite;
	}

	public String getCommite() {
		return comite;
	}

	public void setCommite(String commite) {
		this.comite = commite;
	}

	@Override
	public String toString() {
		return "Commissaire [comite=" + comite + ", nom=" + nom + ", mail="
				+ mail + ", prenom=" + prenom + "]";
	}

	public void affiche() {
		System.out.println("Commissaire: " + super.toString());
	}

}
