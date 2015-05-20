package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Licencie extends Personne {

	private int numeroLicence;
	private static double pointsFFV;
	private Date dateNaissance;
	private static int anneeLicence;

	public Licencie(String nom, String mail, String prenom, int numeroLicence,
			double pointsFFV, Date dateNaissance, int annéeLicence) {
		super(nom, mail, prenom);
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.mail = mail;
		this.prenom = prenom;

	}

	public int getNumeroLicence() {
		return numeroLicence;
	}

	public void setNumeroLicence(int numeroLicence) {
		this.numeroLicence = numeroLicence;
	}

	public double getPointsFFV() {
		return pointsFFV;
	}

	public void setPointsFFV(double pointsFFV) {
		Licencie.pointsFFV = pointsFFV;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public static int getAnneeLicence() {
		return anneeLicence;
	}

	public void setAnneeLicence(int annéeLicence) {
		Licencie.anneeLicence = annéeLicence;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(dateNaissance + nom);
		return "Licencie [numeroLicence=" + numeroLicence + ", pointsFFV="
				+ pointsFFV + ", dateNaissance="
				+ dateFormat.format(dateNaissance) + ", anneeLicence="
				+ anneeLicence + ", nom=" + nom + ", mail=" + mail
				+ ", prenom=" + prenom + "]";
	}

	public void affiche() {

		int Age = Licencie.calculAge(dateNaissance);
		System.out.println(dateNaissance);
		System.out.println("Licencie: " + super.toString() + ", Age :" + Age);
	}

	public static int calculAge(Date dateNaiss) {

		Calendar currentDay = GregorianCalendar.getInstance();
		Calendar birthDay = GregorianCalendar.getInstance();
		birthDay.setTime(dateNaiss);

		int age = currentDay.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
		currentDay.add(Calendar.YEAR, -age);

		if (birthDay.after(currentDay)) {
			age = age - 1;
		}

		return age;

	}

	public static boolean pointsFFV(int annLicence, int nbPointsFFV) {

		boolean okFFV = false;

		 Licencie.pointsFFV=1;
		 Licencie.anneeLicence=1985;

		if (getAnneeLicence() != annLicence)
			;

		else {
			okFFV = true;
			Licencie.pointsFFV = Licencie.pointsFFV + nbPointsFFV;
		}

		return okFFV;
	}

}
