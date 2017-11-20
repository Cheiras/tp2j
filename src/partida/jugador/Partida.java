package partida.jugador;

import java.util.ArrayList;
import java.util.Collections;

import movimiento.Dado;
import partida.Jugador;
import partida.tablero.Tablero;

public class Partida {

	private Jugador jugadorActual;
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador jugador3;
	private Tablero tablero;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private int turno = 0;

	public Partida() {

		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);
		jugador1  = new Jugador("J1", 100000, null); 
		jugador2  = new Jugador("J1", 100000, null); 
		jugador3  = new Jugador("J1", 100000, null); 
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		Collections.shuffle(jugadores);
		jugadorActual = jugadores.get(turno % 3);

		tablero = new Tablero();

	}

	public Jugador jugadorActual() {
		return jugadorActual;
	}

}
