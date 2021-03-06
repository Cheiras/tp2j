package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.Carcel;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.jugador.Jugador;

public class JugadorPuedePagarFianzaEnSegundoYTercerTurnoTest {

	@Test
	public void test() {
		
		
		
		Carcel carcel = new Carcel();
		MeMuevo movNormal = new MovimientoNormal();
		Jugador Pedro = new Jugador("", 100000, movNormal);
		
		carcel.accionar(Pedro); //le asigno la posicion 5 de la carcel
		carcel.accionar(Pedro); //recien en el 2do y 3er turno puedo pagar fianza
		carcel.pagarFianza(Pedro);
		Pedro.avanzar(1);
		
		
		Assert.assertTrue(Pedro.getIndice() == 6);
	}
}
