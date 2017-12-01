package testPropiedades;
import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.CordobaSur;
import partida.jugador.Jugador;
public class VenderUnBarrioNormalSinConstruccionesAumentaElEfectivoEnUn85PorCientoDelPrecioDeCompraTest {

	CordobaSur cordobaSur=new CordobaSur();
	Jugador tester=new Jugador("Tester",100000,null);
	
	@Test
	public void test() {
		cordobaSur.comprar(tester);
		tester.venderPropiedad(cordobaSur);
		
		Assert.assertEquals(97300,tester.getEfectivo());
	}
}
