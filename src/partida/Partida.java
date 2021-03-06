package partida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import caible.propiedades.Propiedad;
import caible.propiedades.barrios.Barrio;
import casilleros.Caible;
import excepciones.CaibleNoComprableException;
import excepciones.ComprarAntesDeTirarDadosException;
import excepciones.JugadorEliminadoException;
import excepciones.JugadorEnBancarrotaException;
import excepciones.PartidaFinalizadaException;
import excepciones.TerminarTurnoAntesDeTirarDadosException;
import excepciones.TirarDadosYaHabiendoTiradoAntesException;
import javafx.scene.paint.Color;
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
	private HashMap<String, Color> colores = new HashMap<String, Color>();
	private int turnos = 1;
	private int indexJugadorActual;
	private Turno turno;

	public Partida() {

		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);
		tirador = new Tirador(dado1, dado2);
		MeMuevo movNormal = new MovimientoNormal();
		jugador1 = new Jugador("Azul", 100000, movNormal);
		jugador2 = new Jugador("Verde", 100000, movNormal);
		jugador3 = new Jugador("Rojo", 100000, movNormal);
		colores.put(jugador1.getNombre(), Color.BLUE);
		colores.put(jugador2.getNombre(), Color.GREEN);
		colores.put(jugador3.getNombre(), Color.RED);
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		Collections.shuffle(jugadores);

		this.jugadorActual = this.jugadorActual();

		tablero = new Tablero();
		indexJugadorActual = 0;
		turno = new Turno(jugadorActual, tirador, tablero);

	}

	public Tirador getTirador() {
		return this.tirador;
	}

	public void terminarTurno() {

		if (jugadores.size() == 1) {
			throw new PartidaFinalizadaException();
		}

		Jugador jugadorQueTermina = this.jugadorActual();
		if (turno.estaListoParaTerminar()) {

			indexJugadorActual++;
			if (indexJugadorActual == jugadores.size())
				indexJugadorActual = 0;

			turno = new Turno(this.jugadorActual(), tirador, tablero);
			turnos++;

			if (jugadorQueTermina.getEfectivo() < 0) {
				
				ArrayList<Propiedad> propiedades = jugadorQueTermina.getPropiedades();
				for (int i = 0; i < propiedades.size(); i++) {
					propiedades.get(i).vendete();
				}
				
				if (jugadorQueTermina.getEfectivo() < 0) {
					jugadores.remove(jugadorQueTermina);
					indexJugadorActual--;
					if (indexJugadorActual < 0)
						indexJugadorActual = 0;
					throw new JugadorEliminadoException();
				}
				throw new JugadorEnBancarrotaException("");
			}

		} else {
			throw new TerminarTurnoAntesDeTirarDadosException("");
		}

	}

	public Jugador jugadorActual() {
		return jugadores.get(indexJugadorActual);
	}

	public void comprarCasilleroActual() {
		if (turno.estaListoParaTerminar()) {
			Caible caibleActual = this.getCaibleActual();
			((Propiedad) caibleActual).comprar(turno.getJugador());
		} else
			throw new ComprarAntesDeTirarDadosException("No podes comprar antes de tirar dados");
	}

	public void construirEn(Barrio unBarrio) {
		if (!turno.estaListoParaTerminar()) {

			if ((unBarrio.obtenerDuenio()) == this.jugadorActual()) {
				unBarrio.construir();
			}
		}

	}

	public void tirarDados() {
		if (!turno.estaListoParaTerminar()) {
			turno.tirarDados(this);
		} else
			throw new TirarDadosYaHabiendoTiradoAntesException("");
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

	public int getNumeroJugadorActual() {
		return indexJugadorActual + 1;
	}

	public Color getColor(String nombre) {
		return colores.get(nombre);
	}

	public boolean yaSeTiraronDados() {
		return this.turno.estaListoParaTerminar();
	}

	public Object getIndice() {
		return this.indexJugadorActual;
	}

}
