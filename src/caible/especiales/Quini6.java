package caible.especiales;

import casilleros.Caible;
import partida.Jugador;

public class Quini6 extends Caible {

	public Quini6() {
		this.posicion = 1;
	}

	public void accionar(Jugador unJugadorConSuerte) {
		unJugadorConSuerte.cobrarPremioDelQuini();
	}
}