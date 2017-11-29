package testIntegracionSegundaEntrega;

import org.junit.Test;

import caible.propiedades.Propiedad;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import junit.framework.Assert;
import partida.jugador.Jugador;

public class JugadorIntercambiaUnaPropiedadConOtroJugadorUnTercerJugadorCaeSobreLaPropiedadIntercambiadaElDineroDelActualDuenioSeIncrementaEnUnMontoIgualAlDelAlquilerSinConstruccionesTest {
	Propiedad buenosAiresSur = new BuenosAiresSur();

	Propiedad buenosAiresNorte = new BuenosAiresNorte();
	Jugador juancito=new Jugador("juancito",100000,null);
	Jugador carlitos=new Jugador("carlitos",100000,null);	
	Jugador pepito=new Jugador("pepito",100000,null);
	@Test
	public void test() {
		buenosAiresNorte.comprar(carlitos);
		buenosAiresSur.comprar(juancito);
		carlitos.intercambiarPropiedades(juancito,buenosAiresNorte,buenosAiresSur);
		buenosAiresSur.accionar(pepito);

		Assert.assertEquals(75000+2000,carlitos.getEfectivo());
	}
}
