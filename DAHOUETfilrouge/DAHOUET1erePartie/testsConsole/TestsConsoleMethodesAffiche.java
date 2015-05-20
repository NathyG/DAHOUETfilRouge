package testsConsole;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Commissaire;
import model.Licencie;
import model.Personne;
import model.Proprietaires;

public class TestsConsoleMethodesAffiche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// affichage commissaire

		// instanciation objet
		Commissaire com = new Commissaire("Moulin", "Moulin@free.fr", "Mr",
				"Bretagne");

		Commissaire.affiche(com);

		// affichage proprietaire

		// instanciation objet
		Proprietaires proprio = new Proprietaires("Moulin", "Moulin@free.fr",
				"Mr", "0615248601", "la belle étoile");

		Proprietaires.affiche(proprio);

		// affichage personne

		// instanciation objet
		Personne pers = new Personne("Moulin", "Moulin@free.fr", "Mr");
		Personne.affiche(pers);

		// affichage proprietaire

		// instanciation objet
		String datnais = "1970-06-14";
		SimpleDateFormat naiss = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dateNaissance = naiss.parse(datnais);
			System.out.println(dateNaissance);
			Licencie licenc = new Licencie("gabardos",
					"nathalie.gabardos@hotmail.com", "nathalie", 120, 50,
					dateNaissance, 2015);
			Licencie.affiche(licenc);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
