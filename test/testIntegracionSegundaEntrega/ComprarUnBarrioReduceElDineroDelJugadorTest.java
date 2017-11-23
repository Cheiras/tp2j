package testIntegracionSegundaEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.*;
import partida.jugador.Jugador;

public class ComprarUnBarrioReduceElDineroDelJugadorTest {

	Jugador unJugador = new Jugador("", 100000, null);
	Barrio BuenosAiresSur = new BuenosAiresSur();
	Barrio BuenosAiresNorte = new BuenosAiresNorte();
	Barrio SantaFe = new SantaFe();
	Barrio Tucuman = new Tucuman();
	Barrio Neuquen = new Neuquen();
	Barrio CordobaSur = new CordobaSur();
	Barrio CordobaNorte = new CordobaNorte();
	Barrio SaltaSur = new SaltaSur();
	Barrio SaltaNorte = new SaltaNorte();

	@Test
	public void testBsAsSur() {

		BuenosAiresSur.accionar(unJugador);

		Assert.assertEquals(80000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testBsAsNorte() {

		BuenosAiresNorte.accionar(unJugador);

		Assert.assertEquals(100000 - 25000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testSantaFe() {

		SantaFe.accionar(unJugador);

		Assert.assertEquals(100000 - 15000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testTucuman() {

		Tucuman.accionar(unJugador);

		Assert.assertEquals(100000 - 25000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testNeuquen() {

		Neuquen.accionar(unJugador);

		Assert.assertEquals(100000 - 17000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testCordobaNorte() {

		CordobaNorte.accionar(unJugador);

		Assert.assertEquals(100000 - 20000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testCordobaSur() {

		CordobaSur.accionar(unJugador);

		Assert.assertEquals(100000 - 18000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testSaltaNorte() {

		SaltaNorte.accionar(unJugador);

		Assert.assertEquals(100000 - 23000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testSaltaSur() {

		SaltaSur.accionar(unJugador);

		Assert.assertEquals(100000 - 23000, unJugador.getEfectivo(), 0.1);
	}

}
