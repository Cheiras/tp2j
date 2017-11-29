package partida;

import java.util.ArrayList;
import java.util.Collections;

import caible.propiedades.barrios.Barrio;
import casilleros.Caible;
import excepciones.CaibleNoComprableException;
import excepciones.CaibleNoConstruibleException;
import excepciones.JugadorEnBancarrotaException;
import javafx.application.Application;
import movimiento.Dado;
import movimiento.MeMuevo;
import movimiento.MovimientoNormal;
import movimiento.Tirador;
import partida.jugador.Jugador;
import partida.tablero.Tablero;
import partida.turno.Turno;
import caible.propiedades.Propiedad;

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

		this.jugadorActual = this.jugadorActual();

		tablero = new Tablero();
		indexJugadorActual = 0;
		cantidadJugadoresActuales = jugadores.size();
		turno = new Turno(jugadorActual, tirador, tablero);

	}

	// Deberiamos meter un metodo por cada boton que hagamos

	public void terminarTurno() {
		if (turno.estaListoParaTerminar()) {
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
		if (turno.estaListoParaTerminar()) {
			Caible caibleActual = this.getCaibleActual();
			try {
				((Propiedad) caibleActual).comprar(turno.getJugador());
			} catch (RuntimeException e) {
			}
		}
	}

	public void construirEn(Barrio unBarrio) {
		if (!turno.estaListoParaTerminar()) {
			try {
				if ((unBarrio.obtenerDuenio()) == this.jugadorActual()) {
					unBarrio.construir();
				}
			} catch (RuntimeException e) {

				throw new CaibleNoConstruibleException("No podes construir en este Caible");
			}
		}
	}

	public void tirarDados() {
		if (!turno.estaListoParaTerminar()) {
			turno.tirarDados();
		}
	}

	public int getTurno() {
		return this.turnos;
	}

	public Caible getCaibleActual() {
		return this.tablero.getCaible(turno.getJugador().getIndice());
	}

	public ArrayList<Jugador> getJugadores() {
		return this.jugadores;
	}

}
