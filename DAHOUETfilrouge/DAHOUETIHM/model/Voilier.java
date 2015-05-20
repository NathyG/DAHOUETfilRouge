package model;

public class Voilier {

	public Voilier(int num_voile, int num_proprietaire, String nom_classe,
			String nom_voilier) {
		super();
		this.num_voile = num_voile;
		this.num_proprietaire = num_proprietaire;
		this.nom_classe = nom_classe;
		this.nom_voilier = nom_voilier;
	}

	public Voilier(int num_proprietaire, String nom_classe, String nom_voilier) {
		// TODO Auto-generated constructor stub
	}

	int num_voile;
	int num_proprietaire;
	String nom_classe;
	String nom_voilier;

	public int getNum_voile() {
		return num_voile;
	}

	public void setNum_voile(int num_voile) {
		this.num_voile = num_voile;
	}

	public int getNum_proprietaire() {
		return num_proprietaire;
	}

	public void setNum_proprietaire(int num_proprietaire) {
		this.num_proprietaire = num_proprietaire;
	}

	public String getNom_classe() {
		return nom_classe;
	}

	public void setNom_classe(String nom_classe) {
		this.nom_classe = nom_classe;
	}

	public String getNom_voilier() {
		return nom_voilier;
	}

	public void setNom_voilier(String nom_voilier) {
		this.nom_voilier = nom_voilier;
	}

}
