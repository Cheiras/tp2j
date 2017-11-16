package testIntegracionPrimerEntrega;



import org.junit.Assert;
import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoCarcel;
import partida.Jugador;

public class JugadorConMovimientoCarcelPuedeMoverseDespuesDe3TurnosTest {

	@Test
	public void test() {
		MeMuevo movCarcel = new MovimientoCarcel();
		Jugador Pepe = new Jugador(1000, movCarcel);
		
		for(int i = 0; i <= 4; i++) {
			Pepe.avanzar(1);			//avanza 1 casillero 5 veces
		}
	
		Assert.assertTrue(Pepe.getPosicion() == 1 );
		
	}

}
