package testIntegracionSegundaEntrega;

import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import junit.framework.Assert;
import partida.jugador.Jugador;
import org.junit.Test;
public class JugadorTieneBsAsSurYNorteYConstruyeUnHotelSiUnJugadorContrarioCaeEnLaCasillaSuEfectivoSeReduceEn5000Test {

	@Test
	public void test() {
		Jugador carlos=new Jugador("Carlos",100000,null);
		Jugador pedro=new Jugador("Pedro",100000,null);
		BarrioNormal bairesSur = new BuenosAiresSur("Buenos Aires Sur", 0, 2, 2000, 3000, 3500, 5000, 5000, 8000);
		BarrioNormal bairesNorte = new BuenosAiresNorte("Buenos Aires Norte", 0, 2, 2000, 3000, 3500, 5000, 5000, 8000);
		
		bairesSur.accionar(carlos);
		bairesNorte.accionar(carlos);
		
		carlos.construirEn(bairesNorte);
		carlos.construirEn(bairesSur);
		carlos.construirEn(bairesNorte);
		carlos.construirEn(bairesSur);
		carlos.construirEn(bairesSur);
		
		bairesSur.accionar(pedro);
		
		Assert.assertEquals(95000, pedro.getEfectivo());
	}
}
