package testMovimiento;
import partida.Jugador;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
class MovimientoNormalAumentaEnUnoLaPosicionDelJugadorTest {

	@Test
	void test() {
		
		MeMuevo movNormal = new MovimientoNormal();
		Jugador Pedro = new Jugador(1000, movNormal);
		
		Pedro.avanzarCasillero();
		Pedro.avanzarCasillero();
		boolean result = Pedro.esTuPosicion(2);

		assert.assertTrue(result);
	}

}
