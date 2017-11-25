package testMovimiento;

import org.junit.Assert;
import org.junit.Test;

import movimiento.Dado;

public class DadoTest {
	
	@Test
	public void test() {
		Dado dado = new Dado(6);
		int valor = dado.tirar();
		Assert.assertTrue(1 <= valor && valor <= 6);
		Assert.assertEquals(1,valor);
	}
}
