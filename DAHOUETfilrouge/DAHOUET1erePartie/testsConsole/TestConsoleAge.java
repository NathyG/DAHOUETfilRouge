package testsConsole;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Licencie;
import model.Lire;

public class TestConsoleAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// entree et calcul age

		System.out.println("Entrer une date sous la forme aaaa-mm-jj");
		String strDateNaiss = Lire.S();

		SimpleDateFormat naiss = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = naiss.parse(strDateNaiss);

			int okAge = Licencie.calculAge(d);

			System.out.println(okAge);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
