package testIntegracionSegundaEntrega;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import partida.jugador.Jugador;

public class JugadorTieneAmbosBarriosPeroSoloConstruyeEnUnoNoPuedeConstruirHotelTest {

	@Test
	public void test() {
		
		boolean result = false;
		BuenosAiresNorte bsasNorte = new BuenosAiresNorte();
		BuenosAiresSur bsasSur = new BuenosAiresSur();
		Jugador unDuenio = new Jugador("Carlos", 100000, null);
		
		bsasNorte.accionar(unDuenio);
		bsasSur.accionar(unDuenio);
		
		bsasNorte.construir();
		bsasNorte.construir();
		
		try {
			
			bsasNorte.construir();

			
		}catch(RuntimeException e) {
			
			result = true;
		}
		
		Assert.assertTrue(result);
		
	}

}
