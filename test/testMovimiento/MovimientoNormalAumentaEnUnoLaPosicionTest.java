package testMovimiento;

import org.junit.Assert;
import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.Jugador;

public class MovimientoNormalAumentaEnUnoLaPosicionTest {

	@Test
	public void test() {
		MeMuevo movNormal = new MovimientoNormal();
		Jugador Pedro = new Jugador(1000, movNormal);
		
		Pedro.avanzarCasillero();
		
		Pedro.avanzarCasillero();
		

		Assert.assertTrue(Pedro.getPosicion() == 2);
	}
}
