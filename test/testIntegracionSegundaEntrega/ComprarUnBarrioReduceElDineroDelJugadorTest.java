package testIntegracionSegundaEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BuenosAiresSur;
import partida.jugador.Jugador;

public class ComprarUnBarrioReduceElDineroDelJugadorTest {

	Jugador unJugador = new Jugador("", 100000, null);
	Barrio BuenosAiresSur = new BuenosAiresSur();

	@Test
	public void test() {
		
		BuenosAiresSur.accionar(unJugador);

		Assert.assertEquals(80000, unJugador.getEfectivo(), 0.1);
	}

}
