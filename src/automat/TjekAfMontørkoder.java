package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class TjekAfMontørkoder {

	@Test
	public void test() {
		Billetautomat automat = new Billetautomat();
		automat.setBilletpris(50);
		
		assertNotEquals(50, automat.getBilletpris());
		
	}

}
