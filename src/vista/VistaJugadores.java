package vista;

import java.util.ArrayList;

import javafx.scene.canvas.Canvas;
import partida.Partida;
import partida.jugador.Jugador;

public class VistaJugadores {

	private ArrayList<VistaJugador> jugadores;
	private int indiceVistaJugadorActual = 0;
	private VistaJugador vistaJugadorActual;
	private Canvas canvas;
	
	public VistaJugadores(Partida partida, Canvas canvas) {
		for(Jugador jugador : partida.getJugadores()) {
			VistaJugador nuevaVistaJugador = new VistaJugador(jugador);
			jugadores.add(nuevaVistaJugador);
		}
		this.vistaJugadorActual = this.jugadores.get(indiceVistaJugadorActual);
		
	}
	
	public void update() {
		this.vistaJugadorActual.dibujar(this.canvas);
		this.indiceVistaJugadorActual += 1;
		this.vistaJugadorActual = this.jugadores.get(indiceVistaJugadorActual);
		
	}
	
}
