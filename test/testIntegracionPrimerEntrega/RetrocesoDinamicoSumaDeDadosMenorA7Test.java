package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.RetrocesoDinamico;
import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioNormal;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.jugador.Jugador;


public class RetrocesoDinamicoSumaDeDadosMenorA7Test {
	
	MeMuevo movNormal = new MovimientoNormal();
	Jugador jugador = new Jugador("", 100000, movNormal);
	
	RetrocesoDinamico retrocesoDinamico = new RetrocesoDinamico();
	
	@Test
	public void NumeroMenorASeis() {
		int numeroSacadoEnDados = 3;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial= jugador.getIndice();
		retrocesoDinamico.accionar(jugador);
		int posicionFinal= jugador.getIndice();
		Assert.assertEquals(posicionFinal, posicionInicial-(numeroSacadoEnDados - jugador.cantidadDePropiedadesASuNombre()));
	}
	@Test
	public void NumeroIgualASeis() {
		int numeroSacadoEnDados = 6;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial= jugador.getIndice();
		retrocesoDinamico.accionar(jugador);
		int posicionFinal= jugador.getIndice();
		Assert.assertEquals(posicionFinal, posicionInicial- (numeroSacadoEnDados - jugador.cantidadDePropiedadesASuNombre()));
	}
	@Test
	public void DependeDeLaCantidadDePropiedades() {
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, 2, 2000, 3000, 3500, 5000, 5000,
				8000);
		

		Barrio OtroBarrio = new BarrioNormal("Buenos Aires Sur", 20000, 2, 2000, 3000, 3500, 5000, 5000,
				8000);
		int numeroSacadoEnDados = 6;

		
		BuenosAiresSur.setDuenio(jugador);
		BuenosAiresSur.accionar(jugador);
		OtroBarrio.setDuenio(jugador);
		OtroBarrio.accionar(jugador);
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial= jugador.getIndice();
		retrocesoDinamico.accionar(jugador);
		int posicionFinal= jugador.getIndice();
		
		
		Assert.assertEquals(2, jugador.cantidadDePropiedadesASuNombre()); //hacer un test aparte
		Assert.assertEquals(posicionFinal, posicionInicial- (numeroSacadoEnDados - jugador.cantidadDePropiedadesASuNombre()));
	}
}