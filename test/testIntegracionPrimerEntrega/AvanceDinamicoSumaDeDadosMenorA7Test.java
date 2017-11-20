package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.AvanceDinamico;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.Jugador;


public class AvanceDinamicoSumaDeDadosMenorA7Test {
	
	MeMuevo movNormal = new MovimientoNormal();
	Jugador jugador = new Jugador("", 0, movNormal);
	
	AvanceDinamico avanceDinamico = new AvanceDinamico();
	
	@Test
	public void NumeroMenorASeis() {
		int numeroSacadoEnDados = 3;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial= jugador.getPosicion();
		avanceDinamico.accionar(jugador);
		int posicionFinal= jugador.getPosicion();
		Assert.assertEquals(posicionFinal, posicionInicial+numeroSacadoEnDados-2);
	}
	@Test
	public void NumeroIgualASeis() {
		int numeroSacadoEnDados = 6;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial= jugador.getPosicion();
		avanceDinamico.accionar(jugador);
		int posicionFinal= jugador.getPosicion();
		Assert.assertEquals(posicionFinal, posicionInicial+numeroSacadoEnDados-2);
	}
}