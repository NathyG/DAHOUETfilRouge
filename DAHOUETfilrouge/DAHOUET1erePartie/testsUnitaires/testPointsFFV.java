package testsUnitaires;

import static org.junit.Assert.assertEquals;
import model.Licencie;

import org.junit.Test;

public class testPointsFFV {

	@Test
	public void test() {

		assertEquals(true, Licencie.pointsFFV(1985, 2));
		assertEquals(false, Licencie.pointsFFV(1987, 1));

	}

}
