package testPropiedades;
import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.Neuquen;
import partida.jugador.Jugador;
public class VenderUnEdificioHistoricoSinConstruccionesAumentaElEfectivoEn85PorCientoDelPrecioDeCompraTest {

	Neuquen neuquen=new Neuquen();
	Jugador dan=new Jugador("Dan",100000,null);
	
	@Test
	public void Test() {
		neuquen.comprar(dan);
		dan.venderPropiedad(neuquen);
		
		Assert.assertEquals(97450,dan.getEfectivo());
	}
}
