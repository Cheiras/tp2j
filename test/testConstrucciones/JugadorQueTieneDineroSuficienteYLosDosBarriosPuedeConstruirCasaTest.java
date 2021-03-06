package testConstrucciones;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import partida.jugador.Jugador;

public class JugadorQueTieneDineroSuficienteYLosDosBarriosPuedeConstruirCasaTest {

	@Test
	public void test() {
		
		Jugador carlos = new Jugador("Carlos", 100000, null);
		BarrioNormal bairesSur = new BuenosAiresSur();
		BarrioNormal bairesNorte = new BuenosAiresNorte();
		
		bairesSur.comprar(carlos);
		bairesNorte.comprar(carlos);
		
		carlos.construirEn(bairesNorte);		
		Assert.assertEquals(100000-20000-25000-5500, carlos.getEfectivo());
		
		carlos.venderPropiedad(bairesNorte);		
		Assert.assertEquals(100000-20000-25000-5500+((25000+5500)*0.85), carlos.getEfectivo(), 1);
		
		carlos.venderPropiedad(bairesSur);		
		Assert.assertEquals(100000-20000-25000-5500+((25000+5500+20000)*0.85), carlos.getEfectivo(), 1);
	}

}
