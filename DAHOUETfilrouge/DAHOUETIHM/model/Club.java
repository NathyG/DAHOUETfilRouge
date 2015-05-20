package model;

public class Club {

	int num_club;
	String nom_club;

	public Club(int num_club, String nom_club) {
		super();
		this.num_club = num_club;
		this.nom_club = nom_club;
	}

	public Club(String string) {
		// TODO Auto-generated constructor stub
	}

	public Club() {
		// TODO Auto-generated constructor stub
	}

	public int getNum_club() {
		return num_club;
	}

	public void setNum_club(int num_club) {
		this.num_club = num_club;
	}

	public String getNom_club() {
		return nom_club;
	}

	public void setNom_club(String nom_club) {
		this.nom_club = nom_club;
	}

}
