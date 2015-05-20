package testsConsole;

import model.Lire;
import model.Personne;

public class TestConsoleMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciation de l'objet

		System.out.println("Entrer une adresse mail");
		String email = Lire.S();

		Boolean okEmail = Personne.ctlMail(email);

		if (okEmail == false)
			System.out.println("Mail invalide");

	}
}
