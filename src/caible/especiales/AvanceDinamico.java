package caible.especiales;

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
		int valorDados = unJugador.getNumeroTotalSacadoEnDados();
		
		if (unJugador.getNumeroTotalSacadoEnDados() <= 6) {
			cantidadDeCasillerosQueDeberaAvanzar = valorDados - 2;
		} else if (unJugador.getNumeroTotalSacadoEnDados() <= 10) {
			cantidadDeCasillerosQueDeberaAvanzar = unJugador.getEfectivo() * valorDados % 100;
		} else {
			cantidadDeCasillerosQueDeberaAvanzar = valorDados - unJugador.cantidadDePropiedadesASuNombre();
		}
		avanzarJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaAvanzar);
	}

}