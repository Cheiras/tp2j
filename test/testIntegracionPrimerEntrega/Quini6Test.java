package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.Quini6;
import partida.Jugador;

public class Quini6Test {

	Quini6 quini = new Quini6();
	Jugador unJugador = new Jugador("", 100000, null);

	@Test
	public void unJugadorCaeUnaVezEnElQuini6YAumentaSuEfectivoEnCincuentaMil() {

		quini.accionar(unJugador);

		Assert.assertEquals(150000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void unJuadorQueCaeDosVecesEnElQuini6AumentaSuEfectivoEnTreintaMil() {

		quini.accionar(unJugador);
		quini.accionar(unJugador);

		Assert.assertEquals(180000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void unJugadorQueCaeMasDeDosVecesEnElQuini6YaNoAumentaSuEfectivoPorqueNadieTieneTantaSuerteLOL() {

		quini.accionar(unJugador);
		quini.accionar(unJugador);
		quini.accionar(unJugador);
		quini.accionar(unJugador);
		quini.accionar(unJugador);

		Assert.assertEquals(180000, unJugador.getEfectivo(), 0.1);
	}
}
