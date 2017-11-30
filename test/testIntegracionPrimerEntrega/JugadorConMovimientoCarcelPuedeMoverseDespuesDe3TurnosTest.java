package testIntegracionPrimerEntrega;



import org.junit.Assert;
import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoCarcelDiaUno;
import partida.jugador.Jugador;

public class JugadorConMovimientoCarcelPuedeMoverseDespuesDe3TurnosTest {

	@Test
	public void test() {
		MeMuevo movCarcel = new MovimientoCarcelDiaUno();
		Jugador Pepe = new Jugador("", 1000, movCarcel);
		
		for(int i = 0; i < 3; i++) {
			Pepe.siguienteMovimiento();
		}
		Pepe.avanzar(1);
	
		Assert.assertEquals(Pepe.getIndice(), 1 );
		
	}

}
