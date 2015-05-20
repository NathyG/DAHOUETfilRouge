package testsUnitaires;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Licencie;

import org.junit.Test;

public class testAge {

	@Test
	public void test() throws ParseException {

		String s = "1970-06-14";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(s);
		assertEquals(44, Licencie.calculAge(date));

		s = "1998-12-12";
		date = format.parse(s);
		assertEquals(16, Licencie.calculAge(date));

		s = "2000-01-12";
		date = format.parse(s);
		assertEquals(15, Licencie.calculAge(date));

	}

}
