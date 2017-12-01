package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.Carcel;
import caible.especiales.Policia;
import casilleros.Caible;
import movimiento.MovimientoNormal;
import partida.jugador.Jugador;



public class PoliciaTest {

	@Test
	public void test() {
		MovimientoNormal mov = new MovimientoNormal();
		Caible carcel = new Carcel();
		Caible policia = new Policia(carcel);
		Jugador jugador = new Jugador("", 0, mov);
		policia.accionar(jugador);
		
		Assert.assertEquals(jugador.getIndice(), carcel.getPosicion());
	}
	
}
