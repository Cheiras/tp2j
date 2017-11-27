package partida;

import java.util.ArrayList;
import java.util.Collections;

import excepciones.JugadorEnBancarrotaException;
import javafx.application.Application;
import movimiento.Dado;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import movimiento.Tirador;
import partida.jugador.Jugador;
import partida.tablero.Tablero;
import partida.turno.Turno;

public class Partida {

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
		MeMuevo movNormal = new MovimientoNormal();
		jugador1 = new Jugador("J1", 100000, movNormal);
		jugador2 = new Jugador("J1", 100000, movNormal);
		jugador3 = new Jugador("J1", 100000, movNormal);
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		Collections.shuffle(jugadores);

		tablero = new Tablero();

		int indexJugadorActual = 0;
		int cantidadJugadoresActuales = jugadores.size();
		while (cantidadJugadoresActuales > 1) {

			jugadorActual = jugadores.get(indexJugadorActual);

			try {
				
				Turno turno = new Turno(jugadorActual, tirador, tablero);

			} catch (JugadorEnBancarrotaException excepcion) {
				
				jugadores.remove(jugadorActual);
				cantidadJugadoresActuales -= 1;
				
			}
			
			indexJugadorActual++;
			if (indexJugadorActual > cantidadJugadoresActuales)
				indexJugadorActual = 0;
		}
		
		//El juego termina y gana el jugador que queda en la lista de jugadores
	}

	public Jugador jugadorActual() {
		return jugadorActual;
	}

	public int getTurno() {
		return this.turnos;
	}

}
