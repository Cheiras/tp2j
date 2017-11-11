package fiuba.algo3.tp2;

import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.tp2.Prueba;

public class PruebaTest {
	
	private static final double DELTA = 1e-15;
	
	@Test
	public void test() {
		Prueba prueba = new Prueba();
		
		 Assert.assertEquals(1, prueba.getResultado(), DELTA);
		
	}

}
