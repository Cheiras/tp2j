package testPropiedades;
import org.junit.Assert;
import org.junit.Test;
import partida.jugador.Jugador;
import caible.propiedades.barrios.Neuquen;
public class VenderUnEdificioHistoricoSinConstruccionesAumentaElEfectivoEn85PorCientoDelPrecioDeCompraTest {

	Neuquen neuquen=new Neuquen();
	Jugador dan=new Jugador("Dan",100000,null);
	
	@Test
	public void Test() {
		neuquen.accionar(dan);
		dan.venderPropiedad(neuquen);
		
		Assert.assertEquals(97450,dan.getEfectivo());
	}
}
