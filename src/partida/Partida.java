package partida;

import java.util.ArrayList;
import java.util.Collections;

import caible.propiedades.barrios.Barrio;
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
	private int indexJugadorActual;
	private int cantidadJugadoresActuales;
	private Turno turno;

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
		indexJugadorActual = 0;
		cantidadJugadoresActuales = jugadores.size();
		turno = new Turno(jugadorActual, tirador, tablero);
		
	}
	
	//Deberiamos meter un metodo por cada boton que hagamos
	
	public void terminarTurno() {
		if (turno.estaListoParaTerminar()){
			indexJugadorActual++;
			if (indexJugadorActual > cantidadJugadoresActuales)
				indexJugadorActual = 0;
			turno = new Turno(this.jugadorActual(), tirador, tablero);
		}
		
	}
	public Jugador jugadorActual() {
		return jugadores.get(indexJugadorActual);
	}
	public void comprarCasilleroActual() {
		if (turno.estaListoParaTerminar()){
			(this.tablero.getCaible(turno.getJugador().getPosicion())).comprar(turno.getJugador());
		}
	}
	
	public void construirEn(Barrio unBarrio) {
		unBarrio.construir();
	}
	
	public void tirarDados() {
		if (!turno.estaListoParaTerminar()){
			turno.tirarDados();
		}
	}
	
	
	public int getTurno() {
		return this.turnos;
	}

}
