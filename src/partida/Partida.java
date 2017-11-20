package partida;

import java.util.ArrayList;
import java.util.Collections;

import movimiento.Dado;
import partida.tablero.Tablero;

public class Partida {

	private Jugador jugadorActual;
	private Jugador jugador1 = new Jugador("J1", 100000, null);
	private Jugador jugador2 = new Jugador("J2", 100000, null);
	private Jugador jugador3 = new Jugador("J3", 100000, null);
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private int turno = 0;

	public Partida() {

		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);

		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		Collections.shuffle(jugadores);
		jugadorActual = jugadores.get(turno % 3);

		Tablero tablero = new Tablero();

	}

	public Jugador jugadorActual() {
		return jugadorActual;
	}

}
