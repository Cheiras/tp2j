package testIntegracionSegundaEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.*;
import partida.jugador.Jugador;

public class JugadorCaeEnBarrioConDuenioYConstruccionesYSeReduceSuEfectivoCorrectamenteTest {

	Jugador jugadorDuenio = new Jugador("Bob", 100000, null);
	Jugador jugadorQueCae = new Jugador("El constructor", 100000, null);

	@Test
	public void testCaeEnBsAsUnaConstruccion() {
		BuenosAiresSur bsasSur = new BuenosAiresSur();
		BuenosAiresNorte bsasNorte = new BuenosAiresNorte();
		
		bsasSur.setDuenio(jugadorDuenio);
		bsasNorte.setDuenio(jugadorDuenio);
		jugadorDuenio.construirEn(bsasSur);
		bsasSur.accionar(jugadorQueCae);

		Assert.assertEquals(100000 - 3000 , jugadorQueCae.getEfectivo());
		jugadorDuenio.construirEn(bsasNorte);
		bsasNorte.accionar(jugadorQueCae);
		Assert.assertEquals(100000 - 3000 - 3500 , jugadorQueCae.getEfectivo());
	}
	
	@Test
	public void testCaeEnCordobaUnaConstruccion() {
		CordobaSur cordobaSur = new CordobaSur();
		CordobaNorte cordobaNorte = new CordobaNorte();
		
		cordobaSur.setDuenio(jugadorDuenio);
		cordobaNorte.setDuenio(jugadorDuenio);
		jugadorDuenio.construirEn(cordobaSur);
		cordobaSur.accionar(jugadorQueCae);

		Assert.assertEquals(100000 - 1500 , jugadorQueCae.getEfectivo());
		jugadorDuenio.construirEn(cordobaNorte);
		cordobaNorte.accionar(jugadorQueCae);
		Assert.assertEquals(100000 - 1500 - 1800 , jugadorQueCae.getEfectivo());
	}
	@Test
	public void testCaeEnSaltaUnaConstruccion() {
		SaltaSur saltaSur = new SaltaSur();
		SaltaNorte saltaNorte = new SaltaNorte();
		
		saltaSur.setDuenio(jugadorDuenio);
		saltaNorte.setDuenio(jugadorDuenio);
		jugadorDuenio.construirEn(saltaSur);
		saltaSur.accionar(jugadorQueCae);

		Assert.assertEquals(100000 - 3250 , jugadorQueCae.getEfectivo());
		jugadorDuenio.construirEn(saltaNorte);
		saltaNorte.accionar(jugadorQueCae);
		Assert.assertEquals(100000 - 3250 - 3250 , jugadorQueCae.getEfectivo());
	}
	@Test
	public void testCaeEnNeuquenUnaConstruccion() {
		Neuquen neuquen = new Neuquen();
		
		neuquen.setDuenio(jugadorDuenio);;
		jugadorDuenio.construirEn(neuquen);
		neuquen.accionar(jugadorQueCae);
		Assert.assertEquals(3800 , neuquen.getprecioAlquilerConUnicoEdificio());
		Assert.assertEquals(100000 - 3800 , jugadorQueCae.getEfectivo());
	}
	@Test
	public void testCaeEnTucumanUnaConstruccion() {
		Tucuman tucuman = new Tucuman();
		
		tucuman.setDuenio(jugadorDuenio);;
		jugadorDuenio.construirEn(tucuman);
		tucuman.accionar(jugadorQueCae);

		Assert.assertEquals(100000 - 4500 , jugadorQueCae.getEfectivo());
	}
	@Test
	public void testCaeEnSantaFeUnaConstruccion() {
		SantaFe santaFe = new SantaFe();
		
		santaFe.setDuenio(jugadorDuenio);;
		jugadorDuenio.construirEn(santaFe);
		santaFe.accionar(jugadorQueCae);

		Assert.assertEquals(100000 - 3500 , jugadorQueCae.getEfectivo());
	}
}
