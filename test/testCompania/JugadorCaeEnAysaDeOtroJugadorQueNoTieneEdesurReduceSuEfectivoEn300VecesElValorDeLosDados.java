package testCompania;
import caible.propiedades.compania.Aysa;
import caible.propiedades.compania.Edesur;

import partida.jugador.Jugador;
import org.junit.Assert;
import org.junit.Test;
public class JugadorCaeEnAysaDeOtroJugadorQueNoTieneEdesurReduceSuEfectivoEn300VecesElValorDeLosDados {
	Jugador jugadorUno=new Jugador("Bob",100000,null);
	Jugador jugadorDos=new Jugador("El constructor",100000,null);
	Aysa unAysa=new Aysa();
	Edesur unEdesur=new Edesur();
	int valorDados=5;
	
	@Test
	public void test() {
		unAysa.setPar(unEdesur);
		unEdesur.setPar(unAysa);
		jugadorDos.setNumeroTotalSacadoEnDados(valorDados);
		unAysa.accionar(jugadorUno);
		unAysa.accionar(jugadorDos);
		
		Assert.assertEquals(100000-valorDados*300, jugadorDos.getEfectivo());
	}
}
