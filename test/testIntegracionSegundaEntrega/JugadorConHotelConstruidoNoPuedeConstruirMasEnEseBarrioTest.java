package testIntegracionSegundaEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import partida.jugador.Jugador;

public class JugadorConHotelConstruidoNoPuedeConstruirMasEnEseBarrioTest {

	@Test
	public void test() {
		
		boolean result = false;
		BuenosAiresNorte bsasNorte = new BuenosAiresNorte();
		BuenosAiresSur bsasSur = new BuenosAiresSur();
		Jugador unDuenio = new Jugador("Carlos", 100000, null);
		
		bsasNorte.comprar(unDuenio);
		bsasSur.comprar(unDuenio);
		
		bsasNorte.construir();
		bsasNorte.construir();
		bsasSur.construir();
		bsasSur.construir();
		bsasSur.construir();

		
		try {
			
			bsasSur.construir();

			
		}catch(RuntimeException e) {
			
			result = true;
		}
		
		Assert.assertTrue(result);
		
	}

}
