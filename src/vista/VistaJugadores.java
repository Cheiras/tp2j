package vista;

import java.util.ArrayList;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import partida.Partida;
import partida.jugador.Jugador;

public class VistaJugadores {

	private ArrayList<VistaJugador> jugadores= new ArrayList<VistaJugador>();
	private Canvas canvas;
	private Partida partida;
	
	public VistaJugadores(Partida partida, Canvas canvas) {
		
		this.canvas = canvas;
		this.jugadores = new ArrayList<VistaJugador>();
		for(Jugador jugador : partida.getJugadores()) {
			VistaJugador nuevaVistaJugador = new VistaJugador(jugador,partida);
			jugadores.add(nuevaVistaJugador);
			nuevaVistaJugador.dibujar(canvas);
		}
		this.partida = partida;

		
		
	}
	public void clean() {
		this.canvas.getGraphicsContext2D().setFill(Color.TRANSPARENT);
		this.canvas.getGraphicsContext2D().fillRect(0, 0, 770, 700);
	}
	
	public void update() {
		
		this.clean();
		for(VistaJugador jugador : this.jugadores) {
			jugador.dibujar(this.canvas);
			
		}
	}
	public void eliminarJugadorActual()	{
		this.jugadores.remove(this.partida.getIndice());
	}
		

	
}
