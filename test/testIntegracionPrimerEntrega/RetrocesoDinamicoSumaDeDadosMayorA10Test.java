package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.RetrocesoDinamico;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.jugador.Jugador;

public class RetrocesoDinamicoSumaDeDadosMayorA10Test {
	
	MeMuevo movNormal = new MovimientoNormal();
	Jugador jugador = new Jugador("", 0, movNormal);
	
	RetrocesoDinamico retrocesoDinamico = new RetrocesoDinamico();
	
	@Test
	public void NumeroMayorA10() {
		int numeroSacadoEnDados = 11;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);

		retrocesoDinamico.accionar(jugador);
		int posicionFinal= jugador.getIndice();
		Assert.assertEquals(posicionFinal, 11);//Cuando el indice es 0 y retrocede 1 salta al 19
	}

}