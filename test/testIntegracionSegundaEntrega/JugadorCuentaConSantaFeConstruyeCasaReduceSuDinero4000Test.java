package testIntegracionSegundaEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.SantaFe;
import partida.jugador.Jugador;

public class JugadorCuentaConSantaFeConstruyeCasaReduceSuDinero4000Test {

	Jugador unJugador = new Jugador("", 100000, null);
	Barrio santaFe = new SantaFe();
	
	@Test
	public void test() {
		
		santaFe.setDuenio(unJugador);
		unJugador.construirEn(santaFe);

		Assert.assertEquals(100000-4000, unJugador.getEfectivo(), 0.1);
	}
}
