package testPropiedades;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioNormal;
import partida.Jugador;

public class PropiedadTest {

	Jugador unJugador = new Jugador(100000, null);
	
	Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2, 2000, 3000, 3500, 5000, 5000,
			8000);

	@Test
	public void propiedadDevuelveElPrecioDeCompraCuandoSeLePregunta() {
		Jugador noJugador = new Jugador(0, null);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, noJugador, 2, 2000, 3000, 3500, 5000, 5000,
				8000);
		Assert.assertEquals(20000, BuenosAiresSur.getPrecioDeCompra(), 0.1);
	}

	@Test
	public void jugadorCompraUnaPropiedadLaPropiedadLoReconoceComoDuenio() {
		Jugador unJugador = new Jugador(100000, null);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2, 2000, 3000, 3500, 5000, 5000,
				8000);

		BuenosAiresSur.accionar(unJugador);

		Assert.assertEquals(unJugador, BuenosAiresSur.obtenerDuenio());
	}

	@Test
	public void jugadorQueCaeEnPropiedadQueNoLePertenecePagaAlquiler() {
		Jugador unJugador = new Jugador(100000, null);
		Jugador otroJugador = new Jugador(100000, null);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2, 2000, 3000, 3500, 5000, 5000,
				8000);

		BuenosAiresSur.accionar(unJugador);
		BuenosAiresSur.accionar(otroJugador);

		Assert.assertEquals(98000, otroJugador.getEfectivo(), 0.1);
	}

	@Test
	public void jugadorQueCaeEnPropiedadQueNoLePertenceAumentaElDineroDelDuenio() {
		Jugador unJugador = new Jugador(100000, null);
		Jugador otroJugador = new Jugador(100000, null);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2, 2000, 3000, 3500, 5000, 5000,
				8000);

		BuenosAiresSur.accionar(unJugador);
		BuenosAiresSur.accionar(otroJugador);

		Assert.assertEquals(82000, unJugador.getEfectivo(), 0.1);
	}
}
