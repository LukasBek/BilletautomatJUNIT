package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class TjekAfIndtjening {

	@Test
	public void test() {
		Billetautomat automat = new Billetautomat();
		automat.montørLogin("1234");
		automat.setBilletpris(20);
		automat.udskrivBillet();
		
		automat.setBilletpris(50);
		automat.udskrivBillet();
		
		int indtjening = automat.getTotal();
		assertEquals(70, indtjening);
	}

}
