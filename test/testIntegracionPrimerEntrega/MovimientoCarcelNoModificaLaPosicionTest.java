package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoCarcelDiaUno;
import partida.jugador.Jugador;

public class MovimientoCarcelNoModificaLaPosicionTest {

	@Test
	public void test() {
		
		MeMuevo movCarcel = new MovimientoCarcelDiaUno();
		Jugador Pepe = new Jugador("", 1000, movCarcel);

		
		Pepe.avanzar(1);
		

		Assert.assertTrue(Pepe.getIndice() == 0);
	}

}