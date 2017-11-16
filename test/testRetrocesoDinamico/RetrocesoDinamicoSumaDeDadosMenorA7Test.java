package testRetrocesoDinamico;

import org.junit.Assert;
import org.junit.Test;

import caible.especiales.RetrocesoDinamico;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.Jugador;


public class RetrocesoDinamicoSumaDeDadosMenorA7Test {
	
	MeMuevo movNormal = new MovimientoNormal();
	Jugador jugador = new Jugador(0, movNormal);
	
	RetrocesoDinamico retrocesoDinamico = new RetrocesoDinamico();
	
	@Test
	public void NumeroMenorASeis() {
		int numeroSacadoEnDados = 3;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial= jugador.getPosicion();
		retrocesoDinamico.accionar(jugador);
		int posicionFinal= jugador.getPosicion();
		Assert.assertEquals(posicionFinal, posicionInicial-(numeroSacadoEnDados + jugador.cantidadDePropiedadesASuNombre()));
	}
	@Test
	public void NumeroIgualASeis() {
		int numeroSacadoEnDados = 6;
		jugador.setNumeroTotalSacadoEnDados(numeroSacadoEnDados);
		int posicionInicial= jugador.getPosicion();
		retrocesoDinamico.accionar(jugador);
		int posicionFinal= jugador.getPosicion();
		Assert.assertEquals(posicionFinal, posicionInicial- (numeroSacadoEnDados + jugador.cantidadDePropiedadesASuNombre()));
	}
}