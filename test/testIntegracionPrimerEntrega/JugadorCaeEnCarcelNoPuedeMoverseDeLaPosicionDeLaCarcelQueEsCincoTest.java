package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.Carcel;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.jugador.Jugador;

public class JugadorCaeEnCarcelNoPuedeMoverseDeLaPosicionDeLaCarcelQueEsCincoTest {

	@Test
	public void test() {

		Carcel carcel = new Carcel();
		MeMuevo movNormal = new MovimientoNormal();
		Jugador Pedro = new Jugador("", 10000, movNormal);
		
		carcel.accionar(Pedro);
		Pedro.avanzar(1);
		Pedro.avanzar(1);
		
		Assert.assertTrue(Pedro.getPosicion() == 5);
		
	}
}