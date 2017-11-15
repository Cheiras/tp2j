package partida;

import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioNormal;
import movimiento.Dado;

public class Partida {

	Jugador jugadorActual;

	public Partida() {
		
		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);

		Jugador jugador1 = new Jugador(100000, null);
		Jugador jugador2 = new Jugador(100000, null);
		Jugador jugador3 = new Jugador(100000, null);
		Jugador noJugador = new Jugador(0, null);

		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, noJugador, 2, 2000, 3000, 3500, 5000, 5000,
				8000);

	}

	public Jugador jugadorActual() {
		return jugadorActual;
	}
}
