package testAvanceDinamico;

import org.junit.Assert;
import org.junit.Test;

import caible.avanceYRetrocesoDinamico.AvanceDinamico;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import partida.Jugador;

public class AvanceDinamicoSumaDeDadosMayorA10 {
	
	MeMuevo movNormal = new MovimientoNormal();
	Jugador jugador = new Jugador(0, movNormal);
	
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

}