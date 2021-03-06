package testIntegracionSegundaEntrega;
import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.Propiedad;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import partida.jugador.Jugador;

public class JugadorIntercambiaPropiedadPorOtraDeOtroJugadorUnTercerJugadorCaeEnLaPropiedadYElAlquilerSeAcreditaAlNuevoDuenioTest {

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


		Assert.assertEquals(77000,carlitos.getEfectivo());

		
	}
}
