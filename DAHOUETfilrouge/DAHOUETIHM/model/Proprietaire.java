package model;

import java.io.Serializable;

public class Proprietaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int num_proprietaire;
	int num_club;
	String nom_proprietaire;
	String coordonnees_proprietaire;
	String compte_participant;

	public Proprietaire(int num_proprietaire, int num_club,
			String nom_proprietaire, String coordonnees_proprietaire,
			String compte_participant) {
		super();
		this.num_proprietaire = num_proprietaire;
		this.num_club = num_club;
		this.nom_proprietaire = nom_proprietaire;
		this.coordonnees_proprietaire = coordonnees_proprietaire;
		this.compte_participant = compte_participant;
	}

	public int getNum_proprietaire() {
		return num_proprietaire;
	}

	public void setNum_proprietaire(int num_proprietaire) {
		this.num_proprietaire = num_proprietaire;
	}

	public int getNum_club() {
		return num_club;
	}

	public void setNum_club(int num_club) {
		this.num_club = num_club;
	}

	public String getNom_proprietaire() {
		return nom_proprietaire;
	}

	public void setNom_proprietaire(String nom_proprietaire) {
		this.nom_proprietaire = nom_proprietaire;
	}

	public String getCoordonnees_proprietaire() {
		return coordonnees_proprietaire;
	}

	public void setCoordonnees_proprietaire(String coordonnees_proprietaire) {
		this.coordonnees_proprietaire = coordonnees_proprietaire;
	}

	public String getCompte_participant() {
		return compte_participant;
	}

	public void setCompte_participant(String compte_participant) {
		this.compte_participant = compte_participant;
	}

	public static void affiche(Proprietaires proprio) {
		// TODO Auto-generated method stub
		
	}

}
