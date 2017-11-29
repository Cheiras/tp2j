package testIntegracionSegundaEntrega;

import org.junit.Test;

import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import junit.framework.Assert;
import partida.jugador.Jugador;

public class JugadorCuentaConBsAsSurYNorteAlCaerUnContrincanteEnCualquieraDeLasDosSuEfectivoSeReduceEn3000Test {
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
		
		bairesSur.accionar(pedro);
		bairesNorte.accionar(juan);
		Assert.assertEquals(97000, pedro.getEfectivo());
		Assert.assertEquals(96500,juan.getEfectivo());
		}
}
