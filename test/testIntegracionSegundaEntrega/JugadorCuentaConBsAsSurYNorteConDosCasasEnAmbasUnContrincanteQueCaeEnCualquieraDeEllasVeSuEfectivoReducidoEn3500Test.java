package testIntegracionSegundaEntrega;
import org.junit.Test;

import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import junit.framework.Assert;
import partida.jugador.Jugador;

public class JugadorCuentaConBsAsSurYNorteConDosCasasEnAmbasUnContrincanteQueCaeEnCualquieraDeEllasVeSuEfectivoReducidoEn3500Test {

	@Test
	public void test() {
		Jugador pedro=new Jugador("Pedro",100000,null);
		Jugador juan=new Jugador("Juan",100000,null);
		Jugador carlos = new Jugador("Carlos", 100000, null);
		BarrioNormal bairesSur = new BuenosAiresSur();
		BarrioNormal bairesNorte = new BuenosAiresNorte();
		
		bairesSur.comprar(carlos);
		bairesNorte.comprar(carlos);
		
		carlos.construirEn(bairesNorte);
		carlos.construirEn(bairesSur);
		carlos.construirEn(bairesNorte);
		carlos.construirEn(bairesSur);
		
		bairesSur.accionar(pedro);
		bairesNorte.accionar(juan);
		
		
		Assert.assertEquals(96500, pedro.getEfectivo());
		Assert.assertEquals(96000,juan.getEfectivo());
		}
	
}
