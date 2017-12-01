package testPropiedades;
import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.compania.Aysa;
import partida.jugador.Jugador;
public class VenderUnaCompaniaAumentaElEfectivoEn85PorCientoDelPrecioDeCompraTest {

	Aysa unAysa=new Aysa();
	Jugador kevin=new Jugador("Kevin",100000,null);
	@Test
	public void test() {
		unAysa.comprar(kevin);
		kevin.venderPropiedad(unAysa);
		
		Assert.assertEquals(95500,kevin.getEfectivo());
	}
}
