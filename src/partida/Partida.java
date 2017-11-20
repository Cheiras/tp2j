package partida;

import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import movimiento.Dado;
import movimiento.Tirador;
import partida.jugador.Jugador;
import partida.tablero.Tablero;
import partida.turno.Turno;

public class Partida{

	private Jugador jugadorActual;
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador jugador3;
	private Tablero tablero;
	private Tirador tirador;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private int turnos = 0;

	public Partida() {

		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);
		tirador = new Tirador(dado1, dado2);
		jugador1 = new Jugador("J1", 100000, null);
		jugador2 = new Jugador("J1", 100000, null);
		jugador3 = new Jugador("J1", 100000, null);
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		Collections.shuffle(jugadores);
		jugadorActual = jugadores.get(turnos % 3);

		tablero = new Tablero();

	}

	public Jugador jugadorActual() {
		return jugadorActual;
	}

	public int getTurno() {
		return this.turnos;
	}

}
