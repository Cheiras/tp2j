package testIntegracionSegundaEntrega;

import org.junit.Test;

import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import junit.framework.Assert;
import partida.jugador.Jugador;
public class JugadorPoseeBsAsSurYNorteConLaMaximaCantidadDeCasasYConstruyeUnHotelSuEfectivoSeReduceEn8000Test {

	@Test
	public void test() {
		Jugador carlos=new Jugador("Carlos",100000,null);
		BarrioNormal bairesSur = new BuenosAiresSur();
		BarrioNormal bairesNorte = new BuenosAiresNorte();
		
		bairesSur.comprar(carlos);
		bairesNorte.comprar(carlos);
		
		carlos.construirEn(bairesNorte);
		carlos.construirEn(bairesSur);
		carlos.construirEn(bairesNorte);
		carlos.construirEn(bairesSur);
		int dineroDeCarlosTrasConstruir=carlos.getEfectivo();
		carlos.construirEn(bairesSur);
		
		Assert.assertEquals(dineroDeCarlosTrasConstruir-8000,carlos.getEfectivo());
	}
}
