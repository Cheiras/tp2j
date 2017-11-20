package testIntegracionSegundaEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioNormal;
import partida.Jugador;

public class ComprarUnBarrioReduceElDineroDelJugadorTest {

	Jugador unJugador = new Jugador("", 100000, null);
	Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2, 2000, 3000, 3500, 5000, 5000,
			8000);

	@Test
	public void test() {
		BuenosAiresSur.accionar(unJugador);

		Assert.assertEquals(80000, unJugador.getEfectivo(), 0.1);
	}

}
