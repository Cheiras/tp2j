package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.Carcel;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.jugador.Jugador;

public class JugadorPuedePagarFianzaLuegoDelPrimerTurnoPresoTest {

	@Test
	public void test() {

		Carcel carcel = new Carcel();
		MeMuevo movInicial = new MovimientoNormal();
		Jugador pepe = new Jugador("", 100000, movInicial);

		carcel.accionar(pepe);
		pepe.avanzar(1);
		try {
			carcel.pagarFianza(pepe);
		}catch(RuntimeException e){
			
		}
		pepe.avanzar(1);

		Assert.assertEquals(pepe.getIndice(), 5);

	}

}
