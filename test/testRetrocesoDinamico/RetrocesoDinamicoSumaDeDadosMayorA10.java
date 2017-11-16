package testRetrocesoDinamico;

import org.junit.Assert;
import org.junit.Test;

import caible.avanceYRetrocesoDinamico.RetrocesoDinamico;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.Jugador;

public class RetrocesoDinamicoSumaDeDadosMayorA10 {
	
	MeMuevo movNormal = new MovimientoNormal();
	Jugador jugador = new Jugador(0, movNormal);
	
	RetrocesoDinamico retrocesoDinamico = new RetrocesoDinamico();
	
	@Test
	public void NumeroMayorA10() {
		int numeroSacadoEnDados = 11;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial= jugador.getPosicion();
		retrocesoDinamico.accionar(jugador);
		int posicionFinal= jugador.getPosicion();
		Assert.assertEquals(posicionFinal, 
				posicionInicial-(jugador.getNumeroTotalSacadoEnDados() - 2));
	}

}