package testPropiedades;
import org.junit.Assert;
import org.junit.Test;

import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import propiedades.Propiedad;
import propiedades.barrios.Barrio;
import propiedades.barrios.BarrioNormal;
import partida.Jugador;
public class PropiedadTest {
	@Test
	public void propiedadDevuelveElPrecioDeCompraCuandoSeLePregunta() {
		Jugador noJugador= new Jugador(0, null);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, noJugador, 2000, 3000, 3500, 5000, 5000, 8000);
		
		Assert.assertEquals(20000, BuenosAiresSur.getPrecioDeCompra(),0.1);
	}
	

	
	@Test
	public void jugadorCompraUnaPropiedadLaPropiedadLoReconoceComoDuenio() {
		Jugador unJugador=new Jugador(100000,null);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2000, 3000, 3500, 5000, 5000, 8000);
		
		BuenosAiresSur.cayoJugador(unJugador);
		
		Assert.assertEquals(unJugador,BuenosAiresSur.obtenerDuenio());
	}
	
	@Test
	public void jugadorQueCaeEnPropiedadQueNoLePertenecePagaAlquiler() {
		Jugador unJugador=new Jugador(100000, null);
		Jugador otroJugador=new Jugador(100000, null);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2000, 3000, 3500, 5000, 5000, 8000);
		
		BuenosAiresSur.cayoJugador(unJugador);
		BuenosAiresSur.cayoJugador(otroJugador);
		
		Assert.assertEquals(98000, otroJugador.getEfectivo(),0.1);
	}
	
	@Test 
	public void jugadorQueCaeEnPropiedadQueNoLePertenceAumentaElDineroDelDuenio() {
		Jugador unJugador=new Jugador(100000, null);
		Jugador otroJugador=new Jugador(100000, null);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, unJugador, 2000, 3000, 3500, 5000, 5000, 8000);
		
		BuenosAiresSur.cayoJugador(unJugador);
		BuenosAiresSur.cayoJugador(otroJugador);
		
		Assert.assertEquals(82000,unJugador.getEfectivo(),0.1);
	}
}
