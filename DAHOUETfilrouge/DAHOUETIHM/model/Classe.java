package model;

public class Classe extends Serie {

	protected String Nom_classe;
	protected int Num_serie;
	protected float Coefficient;

	public Classe(int num_serie, String nom_serie, String nom_classe,
			int num_serie2, float coefficient) {
		super(num_serie, nom_serie);
		Nom_classe = nom_classe;
		Num_serie = num_serie;
		Coefficient = coefficient;
	}

	public String getNom_classe() {
		return Nom_classe;
	}

	public void setNom_classe(String nom_classe) {
		Nom_classe = nom_classe;
	}

	public int getNum_serie() {
		return Num_serie;
	}

	public void setNum_serie(int num_serie) {
		Num_serie = num_serie;
	}

	public float getCoefficient() {
		return Coefficient;
	}

	public void setCoefficient(float coefficient) {
		Coefficient = coefficient;
	}

}
