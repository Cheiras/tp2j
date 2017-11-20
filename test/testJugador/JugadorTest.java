package testJugador;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioNormal;
import partida.Jugador;

public class JugadorTest {

	Jugador unJugador = new Jugador("", 100000, null);
	Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2, 2000, 3000, 3500, 5000, 5000,
			8000);

	@Test
	public void elJugadorRecienCreadoIniciaConUnaCantidadDeDineroDeterminadaArbitrariamente() {
		Assert.assertEquals(100000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void dineroBajaCuandoJugadorCaeEnUnaPropiedadYLaCompra() {

		BuenosAiresSur.accionar(unJugador);

		Assert.assertEquals(80000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void elJugadorAlComprarUnaPropiedadEstaEsAgregadaCorrectamenteAlJugador() {

		BuenosAiresSur.accionar(unJugador);

		Assert.assertTrue(unJugador.contienePropiedad(BuenosAiresSur));
	}

	@Test
	public void elJugadorQueNoCompraLaPropiedadNoLaTieneAgregada() {

		Assert.assertFalse(unJugador.contienePropiedad(BuenosAiresSur));
	}
}
