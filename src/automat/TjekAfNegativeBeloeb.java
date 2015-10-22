package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class TjekAfNegativeBeloeb {

	@Test
	public void testNegativeBeloeb() {
		Billetautomat automat = new Billetautomat();
		automat.indsætPenge(500);
		automat.indsætPenge(-150);
		int balance = automat.getBalance();
		assertEquals(500, balance);
		
	}

}
