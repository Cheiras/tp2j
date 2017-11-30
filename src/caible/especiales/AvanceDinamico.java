package caible.especiales;

import casilleros.Caible;
import partida.jugador.Jugador;

public class AvanceDinamico extends Caible {

	public AvanceDinamico() {
		super("Avance Dinamico");
		this.posicion = 7;
	}

	private void avanzarJugadorUnaCantidadDeCasilleros(Jugador unJugador, int unaCantidad) {
		unJugador.avanzar(unaCantidad);
	}
	public void accionar(Jugador unJugador) {
		int cantidadDeCasillerosQueDeberaAvanzar = 0;
		int valorDados = unJugador.getNumeroTotalSacadoEnDados();

		if (unJugador.getNumeroTotalSacadoEnDados() <= 6) {
			cantidadDeCasillerosQueDeberaAvanzar = valorDados - 2;
		} else if (unJugador.getNumeroTotalSacadoEnDados() <= 10) {
			cantidadDeCasillerosQueDeberaAvanzar = ((unJugador.getEfectivo() * valorDados));
		} else {
			cantidadDeCasillerosQueDeberaAvanzar = (valorDados - unJugador.cantidadDePropiedadesASuNombre());
		}
		avanzarJugadorUnaCantidadDeCasilleros(unJugador, cantidadDeCasillerosQueDeberaAvanzar);
	}

}