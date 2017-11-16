package caible.avanceYRetrocesoDinamico;

import casilleros.Caible;
import partida.Jugador;

public class AvanceDinamico extends Caible {

	public AvanceDinamico() {
		this.posicion = 7;
	}

	private void avanzarJugadorUnaCantidadDeCasilleros(Jugador unJugador, int unaCantidad) {
		for (int i = 0; i < unaCantidad; i++) {
			unJugador.avanzarCasillero();
		}
	}

	public void accionar(Jugador unJugador) {

		int cantidadDeCasillerosQueDeberaAvanzar;

		if (unJugador.getNumeroTotalSacadoEnDados() <= 6) {
			cantidadDeCasillerosQueDeberaAvanzar = unJugador.getNumeroTotalSacadoEnDados() - 2;
			avanzarJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaAvanzar);
		} else if (unJugador.getNumeroTotalSacadoEnDados() <= 10) {
			cantidadDeCasillerosQueDeberaAvanzar = unJugador.getEfectivo() * unJugador.getNumeroTotalSacadoEnDados() % 100;
			avanzarJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaAvanzar);
		} else {
			cantidadDeCasillerosQueDeberaAvanzar = unJugador.getNumeroTotalSacadoEnDados()
					- unJugador.cantidadDePropiedadesASuNombre();
			avanzarJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaAvanzar);
		}
	}

}