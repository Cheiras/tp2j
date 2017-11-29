package testIntegracionPrimerEntrega;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.AvanceDinamico;
import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioNormal;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.jugador.Jugador;

public class AvanceDinamicoSumaDeDadosMayorA10Test {
	
	MeMuevo movNormal = new MovimientoNormal();
	Jugador jugador = new Jugador("", 200000, movNormal);
	
	AvanceDinamico avanceDinamico = new AvanceDinamico();
	
	@Test
	public void NumeroMayorA10() {
		int numeroSacadoEnDados = 11;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial= jugador.getIndice();
		avanceDinamico.accionar(jugador);
		int posicionFinal= jugador.getIndice();
		Assert.assertEquals(posicionFinal, 
				posicionInicial+numeroSacadoEnDados - jugador.cantidadDePropiedadesASuNombre());
	}
	
	@Test
	public void DependeDeLaCantidadDePropiedades() {
		
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, 2, 2000, 3000, 3500, 5000, 5000,
				8000);
		Barrio OtroBarrio = new BarrioNormal("Buenos Aires Sur", 20000, 2, 2000, 3000, 3500, 5000, 5000,
				8000);
		int numeroSacadoEnDados = 11;

		
		BuenosAiresSur.setDuenio(jugador);
		BuenosAiresSur.accionar(jugador);
		OtroBarrio.setDuenio(jugador);
		OtroBarrio.accionar(jugador);
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial= jugador.getIndice();
		avanceDinamico.accionar(jugador);
		int posicionFinal= jugador.getIndice();
		
		
		Assert.assertEquals(posicionFinal, 
				posicionInicial+ numeroSacadoEnDados- jugador.cantidadDePropiedadesASuNombre());
	}
	
}