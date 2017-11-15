package testMovimiento;


import org.junit.Assert;
import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoCarcel;
import partida.Jugador;

public class JugadorNoPuedeDesplazarsePor3TurnosTest {

	@Test
	public void test() {
		MeMuevo movCarcel = new MovimientoCarcel();
		Jugador Pepe = new Jugador(10000, movCarcel);
		
		for(int i = 0; i < 4; i++) {
			Pepe.avanzarCasillero();
		}
		
		Assert.assertTrue(Pepe.getPosicion() == 1);
			
		}
	}
