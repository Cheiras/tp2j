package partida;

import java.util.ArrayList;
import java.util.Collections;

import movimiento.Dado;
import partida.tablero.Tablero;

public class Partida {

	Jugador jugadorActual;

	public Partida() {
		
		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);

		
		Jugador jugador1 = new Jugador("J1", 100000, null);
		Jugador jugador2 = new Jugador("J2", 100000, null);
		Jugador jugador3 = new Jugador("J3", 100000, null);
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		System.out.println(jugador1);
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		
		Collections.shuffle(jugadores);
		

		Tablero tablero = new Tablero();
		
		
		

	}

	public Jugador jugadorActual() {
		return jugadorActual;
	}
}
