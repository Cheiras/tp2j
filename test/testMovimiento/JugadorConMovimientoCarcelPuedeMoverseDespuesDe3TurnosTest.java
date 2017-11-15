package testMovimiento;

import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoCarcel;
import partida.Jugador;

class JugadorConMovimientoCarcelPuedeMoverseDespuesDe3TurnosTest {

	@Test
	void test() {
		MeMuevo movCarcel = new MovimientoCarcel();
		Jugador Pepe = new Jugador(10000, movCarcel);
		
		for(int i = 0; i < 4; i++) {
			Pepe.avanzarCasillero();
		}
	
		boolean result = Pepe.esTuPosicion(1);
		
		assert.assertTrue(result);
		
	}

}
