package testMovimiento;

import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoCarcel;
import partida.Jugador;

class MovimientoCarcelNoModificaLaPosicionDelJugadorTest {

	@Test
	void test() {
		MeMuevo movCarcel = new MovimientoCarcel();
		Jugador Pepe = new Jugador(1000, movCarcel);
		
		Pepe.avanzarCasillero();
		boolean result = Pepe.esTuPosicion(0);
		
		assert.assertTrue(result);
	}

}
