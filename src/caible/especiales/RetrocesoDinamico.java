package caible.especiales;

import casilleros.Caible;
import partida.jugador.Jugador;

public class RetrocesoDinamico extends Caible {

	public RetrocesoDinamico() {
		this.posicion = 18;
	}

	private void retrocederJugadorUnaCantidadDeCasilleros(Jugador unJugador, int unaCantidad) {
		for (int i = 0; i < unaCantidad; i++) {
			unJugador.retrocederCasillero();
		}
	}

	public void accionar(Jugador unJugador) {

		int cantidadDeCasillerosQueDeberaRetroceder;
		int valorDados = unJugador.getNumeroTotalSacadoEnDados();

		if (unJugador.getNumeroTotalSacadoEnDados() <= 6) {
			cantidadDeCasillerosQueDeberaRetroceder = valorDados - unJugador.cantidadDePropiedadesASuNombre();
		} else if (unJugador.getNumeroTotalSacadoEnDados() <= 10) {
			cantidadDeCasillerosQueDeberaRetroceder = unJugador.getEfectivo() * valorDados % 100;
		} else {
			cantidadDeCasillerosQueDeberaRetroceder = valorDados - 2;
		}
		retrocederJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaRetroceder);
	}

}