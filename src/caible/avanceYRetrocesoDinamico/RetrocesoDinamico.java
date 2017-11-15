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

		if (unJugador.numeroTotalSacadoEnDados() <= 6) {
			cantidadDeCasillerosQueDeberaRetroceder = unJugador.numeroTotalSacadoEnDados()
					- unJugador.cantidadDePropiedadesASuNombre();
			retrocederJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaRetroceder);
		} else if (unJugador.numeroTotalSacadoEnDados() <= 6) {
			cantidadDeCasillerosQueDeberaRetroceder = unJugador.getEfectivo() * unJugador.numeroTotalSacadoEnDados()
					% 100;
			retrocederJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaRetroceder);
		} else {
			cantidadDeCasillerosQueDeberaRetroceder = unJugador.numeroTotalSacadoEnDados() - 2;
			retrocederJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaRetroceder);
		}
	}

}