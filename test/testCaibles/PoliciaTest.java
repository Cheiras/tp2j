package testCaibles;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.Carcel;
import caible.especiales.Policia;
import casilleros.Caible;
import partida.Jugador;



public class PoliciaTest {

	@Test
	public void test() {
		Caible carcel = new Carcel();
		Caible policia = new Policia(carcel);
		Jugador jugador = new Jugador(0, null);
		policia.accionar(jugador);
		
		Assert.assertEquals(jugador.getPosicion(), carcel.getPosicion());
	}
	
}
