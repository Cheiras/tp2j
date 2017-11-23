package testIntegracionSegundaEntrega;
import partida.jugador.Jugador;
import caible.propiedades.Propiedad;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import casilleros.Caible;

import org.junit.Assert;
import org.junit.Test;

public class JugadorIntercambiaPropiedadPorOtraDeOtroJugadorUnTercerJugadorCaeEnLaPropiedadYElAlquilerSeAcreditaAlNuevoDuenioTest {

	Propiedad buenosAiresSur = new BuenosAiresSur("Buenos Aires Sur", 20000, 2, 2000, 3000, 3500, 5000, 5000,
			8000);

	Propiedad buenosAiresNorte = new BuenosAiresNorte("Buenos Aires Norte", 25000, 4, 2500, 3500, 4000, 6000,
			5500, 9000);
	Jugador juancito=new Jugador("juancito",100000,null);
	Jugador carlitos=new Jugador("carlitos",100000,null);	
	Jugador pepito=new Jugador("pepito",100000,null);
	@Test
	public void test() {
		buenosAiresNorte.accionar(carlitos);
		buenosAiresSur.accionar(juancito);
		int carlitosPlataTrasComprar=carlitos.getEfectivo();
		carlitos.intercambiarPropiedades(juancito,buenosAiresNorte,buenosAiresSur);
		System.out.print(carlitosPlataTrasComprar);
		buenosAiresSur.accionar(pepito);
		String newline=System.lineSeparator();
		carlitosPlataTrasComprar=pepito.getEfectivo();
		System.out.println(newline);
		System.out.print(carlitosPlataTrasComprar);
		
	}
}
