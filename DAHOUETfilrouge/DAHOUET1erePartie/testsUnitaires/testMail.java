package testsUnitaires;

import static org.junit.Assert.*;
import model.Personne;

import org.junit.Test;

public class testMail {

	@Test
	public void test() {

		assertEquals(true, Personne.ctlMail("Nathalie.gabardos@hotmail.com"));
		assertEquals(false, Personne.ctlMail("toto.tiit"));

	}

}
