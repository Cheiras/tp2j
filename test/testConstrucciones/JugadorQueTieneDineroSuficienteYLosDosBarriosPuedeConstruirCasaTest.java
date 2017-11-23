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
		BarrioNormal bairesSur = new BuenosAiresSur("Buenos Aires Sur", 0, 2, 2000, 3000, 3500, 5000, 5000, 8000);
		BarrioNormal bairesNorte = new BuenosAiresNorte("Buenos Aires Norte", 0, 2, 2000, 3000, 3500, 5000, 5000, 8000);
		
		bairesSur.accionar(carlos);
		bairesNorte.accionar(carlos);
		
		carlos.construirEn(bairesNorte);		
		Assert.assertEquals(95000, carlos.getEfectivo());		
	}

}
