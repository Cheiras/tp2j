package testMovimiento;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.Carcel;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.Jugador;

public class JugadorPuedePagarFianzaLuegoDelPrimerTurnoPresoTest {

	@Test
	public void test() {
		
		Carcel carcel = new Carcel();
		MeMuevo movInicial = new MovimientoNormal();
		Jugador pepe = new Jugador(100000,movInicial);
		
		carcel.accionar(pepe);
		pepe.avanzar(1);
		carcel.pagarFianza(pepe);
		pepe.avanzar(1);
		
		Assert.assertEquals(pepe.getPosicion(), 6);
		
		
		
	}

}
