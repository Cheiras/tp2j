package testJugador;
import partida.Jugador;
import propiedades.Propiedad;
import propiedades.barrios.Barrio;
import propiedades.barrios.BarrioNormal;

import org.junit.Assert;
import org.junit.Test;
public class JugadorTest {

	@Test
	public void elJugadorRecienCreadoIniciaConUnaCantidadDeDineroDeterminadaArbitrariamente() {
		Jugador unJugador= new Jugador(100000);
		
		Assert.assertEquals(100000, unJugador.getEfectivo(),0.1);
	}
	@Test
	public void dineroBajaCuandoJugadorCaeEnUnaPropiedadYLaCompra() {
		Jugador unJugador=new Jugador(100000);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2000, 3000, 3500, 5000, 5000, 8000);
		
		BuenosAiresSur.cayoJugador(unJugador);
		
		Assert.assertEquals(80000,unJugador.getEfectivo(),0.1);
	}
	
	@Test
	public void elJugadorAlComprarUnaPropiedadEstaEsAgregadaCorrectamenteAlJugador() {
		Jugador unJugador=new Jugador(100000);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2000, 3000, 3500, 5000, 5000, 8000);
		
		BuenosAiresSur.cayoJugador(unJugador);
		
		Assert.assertTrue(unJugador.contienePropiedad(BuenosAiresSur));
	}
	
	@Test
	public void elJugadorQueNoCompraLaPropiedadNoLaTieneAgregada() {
		Jugador unJugador=new Jugador(100000);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2000, 3000, 3500, 5000, 5000, 8000);
		
		Assert.assertFalse(unJugador.contienePropiedad(BuenosAiresSur));
	}
}
