package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioNormal;
import partida.jugador.Jugador;

public class JugadorTest {
	
	Jugador unJugador = new Jugador("", 100000, null);
	Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, 2, 2000, 3000, 3500, 5000, 5000,
			8000);
	
	@Test
	public void elJugadorAlComprarUnaPropiedadEstaEsAgregadaCorrectamenteAlJugador() {

		BuenosAiresSur.setDuenio(unJugador);
		BuenosAiresSur.accionar(unJugador);

		Assert.assertTrue(unJugador.contienePropiedad(BuenosAiresSur));
	}
}
