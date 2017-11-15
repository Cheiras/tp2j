package testMovimiento;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoCarcel;
import partida.Jugador;

class JugadorConMovCarcelPagaLaFianzaEnEl2doTurnoTest {

	@Test
	void test() {
		MeMuevo movCarcel = new MovimientoCarcel();
		Jugador Pedro = new Jugador(10000,movCarcel);
		
		Pedro.avanzarCasillero();//no avanza
		Pedro.avanzarCasillero();//aca deberia poder pagar la fianza
		Pedro.avanzarCasillero();//aca verificar que avanzo despues de haber pagado
		boolean result = Pedro.esTuPosicion(1);
		
		assert.assertTrue(result);
		
	}

}
