package testMovimiento;

import org.junit.Assert;
import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoCarcel;
import partida.Jugador;

public class MovimientoCarcelNoModificaLaPosicionTest {

	@Test
	public void test() {
		MeMuevo movCarcel = new MovimientoCarcel();
		Jugador Pepe = new Jugador(1000, movCarcel);

		
		Pepe.avanzarCasillero();
		

		Assert.assertTrue(Pepe.getPosicion() == 0);
	}

}