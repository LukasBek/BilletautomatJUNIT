package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class TjekAfBilletsalg {

	@Test
	public void test() {
		Billetautomat automat = new Billetautomat();
		automat.udskrivBillet();
		int retur = automat.returpenge();
		assertEquals(0, retur);
	}

}
