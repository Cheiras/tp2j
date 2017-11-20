package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.AvanceDinamico;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.jugador.Jugador;

public class AvanceDinamicoSumaDeDadosEntre7Y10Test {

	MeMuevo movNormal = new MovimientoNormal();
	Jugador jugador = new Jugador("", 0, movNormal);

	AvanceDinamico avanceDinamico = new AvanceDinamico();

	@Test
	public void NumeroIgualA7() {
		int numeroSacadoEnDados = 7;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial = jugador.getPosicion();
		avanceDinamico.accionar(jugador);
		int posicionFinal = jugador.getPosicion();
		Assert.assertEquals(posicionFinal, posicionInicial + jugador.getEfectivo() * numeroSacadoEnDados % 100);
	}

	@Test
	public void NumeroEntre7Y10() {
		int numeroSacadoEnDados = 9;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial = jugador.getPosicion();
		avanceDinamico.accionar(jugador);
		int posicionFinal = jugador.getPosicion();
		Assert.assertEquals(posicionFinal, posicionInicial + jugador.getEfectivo() * numeroSacadoEnDados % 100);
	}

	@Test
	public void NumeroIgualA10() {
		int numeroSacadoEnDados = 10;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial = jugador.getPosicion();
		avanceDinamico.accionar(jugador);
		int posicionFinal = jugador.getPosicion();
		Assert.assertEquals(posicionFinal, posicionInicial + jugador.getEfectivo() * numeroSacadoEnDados % 100);
	}

	@Test
	public void DependeDelEfectivoDelJugador() {
		int numeroSacadoEnDados = 10;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		jugador.aumentarEfectivo(10000);
		int posicionInicial = jugador.getPosicion();
		avanceDinamico.accionar(jugador);
		int posicionFinal = jugador.getPosicion();
		Assert.assertEquals(posicionFinal, posicionInicial + jugador.getEfectivo() * numeroSacadoEnDados % 100);
	}
}