package testMovimiento;

import org.junit.Assert;
import org.junit.Test;

import movimiento.Dado;
import movimiento.Tirador;

public class TiradorTest {

	Dado dado1 = new Dado(6);
	Dado dado2 = new Dado(6);
	Tirador tirador = new Tirador(dado1, dado2);

	@Test
	public void lanzaValoresCorrectosTest() {
		for (int i = 0; i < 100; i++) {
			int valor = tirador.tirar();
			Assert.assertTrue(1 <= valor && valor <= 12);
		}
	}

	@Test
	public void DadosSonIgualesTest() {
		for (int i = 0; i < 100; i++) {
			tirador.tirar();
			Assert.assertEquals(tirador.getValorDado1() == tirador.getValorDado2(), tirador.dadosMismoValor());

		}
	}
}
