package testIntegracionSegundaEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import caible.propiedades.barrios.CordobaNorte;
import caible.propiedades.barrios.CordobaSur;
import caible.propiedades.barrios.Neuquen;
import caible.propiedades.barrios.SaltaNorte;
import caible.propiedades.barrios.SaltaSur;
import caible.propiedades.barrios.SantaFe;
import caible.propiedades.barrios.Tucuman;
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

		BuenosAiresSur.comprar(unJugador);

		Assert.assertEquals(80000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testBsAsNorte() {

		BuenosAiresNorte.comprar(unJugador);

		Assert.assertEquals(100000 - 25000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testSantaFe() {

		SantaFe.comprar(unJugador);

		Assert.assertEquals(100000 - 15000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testTucuman() {

		Tucuman.comprar(unJugador);

		Assert.assertEquals(100000 - 25000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testNeuquen() {

		Neuquen.comprar(unJugador);

		Assert.assertEquals(100000 - 17000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testCordobaNorte() {

		CordobaNorte.comprar(unJugador);

		Assert.assertEquals(100000 - 20000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testCordobaSur() {

		CordobaSur.comprar(unJugador);

		Assert.assertEquals(100000 - 18000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testSaltaNorte() {

		SaltaNorte.comprar(unJugador);

		Assert.assertEquals(100000 - 23000, unJugador.getEfectivo(), 0.1);
	}

	@Test
	public void testSaltaSur() {

		SaltaSur.comprar(unJugador);

		Assert.assertEquals(100000 - 23000, unJugador.getEfectivo(), 0.1);
	}

}
