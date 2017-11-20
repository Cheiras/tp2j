package partida;

import movimiento.Dado;
import partida.tablero.Tablero;

public class Partida {

	Jugador jugadorActual;

	public Partida() {
		
		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);

		Jugador jugador1 = new Jugador(100000, null);
		Jugador jugador2 = new Jugador(100000, null);
		Jugador jugador3 = new Jugador(100000, null);

		Tablero tablero = new Tablero();
		
		
		

	}

	public Jugador jugadorActual() {
		return jugadorActual;
	}
}
