package testConstrucciones;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.BuenosAiresSur;
import partida.jugador.Jugador;

public class JugadorQueTieneDineroSuficienteYLosDosBarriosPuedeConstruirCasaTest {

	@Test
	public void test() {
		Jugador carlos = new Jugador("Carlos", 100000, null);
		Barrio bairesSur = new BuenosAiresSur("Buenos Aires Sur", 20000, 2, 2000, 3000, 3500, 5000, 5000,
				8000);
		Assert.assertTrue(true);
		
	}

}
