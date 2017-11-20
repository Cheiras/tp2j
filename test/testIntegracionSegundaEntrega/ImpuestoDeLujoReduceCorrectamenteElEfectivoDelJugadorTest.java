package testIntegracionSegundaEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.ImpuestoDeLujo;
import casilleros.Caible;
import partida.jugador.Jugador;

public class ImpuestoDeLujoReduceCorrectamenteElEfectivoDelJugadorTest {

	Caible impuestoDeLujo = new ImpuestoDeLujo();
	Jugador unJugador = new Jugador("", 100000, null);

	@Test
	public void test() {
		impuestoDeLujo.accionar(unJugador);
		Assert.assertEquals(90000, unJugador.getEfectivo(), 0.1);
	}
}
