package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.jugador.Jugador;

public class MovimientoNormalAumentaEnUnoLaPosicionTest {

	@Test
	public void test() {
		MeMuevo movNormal = new MovimientoNormal();
		Jugador Pedro = new Jugador("", 1000, movNormal);
		
		Pedro.avanzar(1);
		
		Pedro.avanzar(1);
		

		Assert.assertTrue(Pedro.getIndice() == 2);
	}
}
