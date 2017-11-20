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
		int posicionInicial= jugador.getPosicion();
		avanceDinamico.accionar(jugador);
		int posicionFinal= jugador.getPosicion();
		Assert.assertEquals(posicionFinal, 
				posicionInicial+numeroSacadoEnDados - jugador.cantidadDePropiedadesASuNombre());
	}
	
	@Test
	public void DependeDeLaCantidadDePropiedades() {
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, jugador, 2, 2000, 3000, 3500, 5000, 5000,
				8000);
		BuenosAiresSur.accionar(jugador);
		Barrio OtroBarrio = new BarrioNormal("Buenos Aires Sur", 20000, jugador, 2, 2000, 3000, 3500, 5000, 5000,
				8000);
		OtroBarrio.accionar(jugador);
		int numeroSacadoEnDados = 11;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial= jugador.getPosicion();
		avanceDinamico.accionar(jugador);
		int posicionFinal= jugador.getPosicion();
		Assert.assertEquals(posicionFinal, 
				posicionInicial+ numeroSacadoEnDados- jugador.cantidadDePropiedadesASuNombre());
	}
	
}