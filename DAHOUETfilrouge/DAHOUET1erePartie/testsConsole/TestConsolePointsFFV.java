package testsConsole;

import model.Licencie;
import model.Lire;

public class TestConsolePointsFFV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciation de l'objet

		System.out.println("Entrer une ann�e de licence :");
		int anneeLicence = Lire.i();

		System.out.println("Entrer un nombre de points FFV a ajouter");
		int nbPointsFFV = Lire.i();

		boolean okPointsFFV = Licencie.pointsFFV(anneeLicence, nbPointsFFV);

		if (okPointsFFV == false)
			System.out
					.println("MAJ annul�e, la date entr�e ne correspond pas � la date de licence.");

	}
}
