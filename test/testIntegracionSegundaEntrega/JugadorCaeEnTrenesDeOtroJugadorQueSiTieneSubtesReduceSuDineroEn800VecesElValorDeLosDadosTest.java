package testIntegracionSegundaEntrega;

import org.junit.Test;

import caible.propiedades.compania.Subte;
import caible.propiedades.compania.Trenes;
import junit.framework.Assert;
import partida.jugador.Jugador;

public class JugadorCaeEnTrenesDeOtroJugadorQueSiTieneSubtesReduceSuDineroEn800VecesElValorDeLosDadosTest {
	Jugador jugadorUno = new Jugador("Bob", 100000, null);
	Jugador jugadorDos = new Jugador("El constructor", 100000, null);
	Trenes unTren = new Trenes();
	Subte unSubte = new Subte();
	int valorDados = 5;

	@Test
	public void test() {
		unTren.setPar(unSubte);
		unSubte.setPar(unTren);
		jugadorDos.setNumeroTotalSacadoEnDados(valorDados);
		unTren.comprar(jugadorUno);
		unSubte.comprar(jugadorUno);
		unTren.accionar(jugadorDos);

		Assert.assertEquals(100000 - 800 * valorDados, jugadorDos.getEfectivo());
	}
}
