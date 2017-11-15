package testMovimiento;

import org.junit.Assert;
import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoCarcel;
import partida.Jugador;

public class JugadorPuedePagarFianzaEnSegundoYTercerTurnoTest {

	@Test
	public void test() {
		MeMuevo movCarcel = new MovimientoCarcel();
		Jugador Pedro = new Jugador(10000, movCarcel);

		Pedro.avanzarCasillero();// no avanza
		Pedro.avanzarCasillero();// aca deberia poder pagar la fianza
		Pedro.avanzarCasillero();// aca verificar que avanzo despues de haber
									// pagado

		
		Assert.assertTrue(Pedro.getPosicion() == 1);
	}
}
