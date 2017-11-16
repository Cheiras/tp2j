package caible.avanceYRetrocesoDinamico;

import casilleros.Caible;
import partida.Jugador;

public class RetrocesoDinamico extends Caible{

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

		if (unJugador.getNumeroTotalSacadoEnDados() <= 6) {
			cantidadDeCasillerosQueDeberaRetroceder = unJugador.getNumeroTotalSacadoEnDados()
					+ unJugador.cantidadDePropiedadesASuNombre();
			retrocederJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaRetroceder);
		} else if (unJugador.getNumeroTotalSacadoEnDados() <= 10) {
			cantidadDeCasillerosQueDeberaRetroceder = unJugador.getEfectivo() * unJugador.getNumeroTotalSacadoEnDados()
					% 100;
			retrocederJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaRetroceder);
		} else {
			cantidadDeCasillerosQueDeberaRetroceder = unJugador.getNumeroTotalSacadoEnDados() - 2;
			retrocederJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaRetroceder);
		}
	}
	
}