package vista;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import partida.Partida;
import partida.jugador.Jugador;

public class VistaJugador {

	private static final double RADIO = 50;
	Jugador jugador;
	private Color color;
	
	public VistaJugador(Jugador jugador, Partida partida) {
		this.jugador = jugador;
		this.color= partida.getColor(jugador.getNombre());
		
	}
	
	public void dibujar(Canvas canvas) {
		canvas.getGraphicsContext2D().setFill(this.color);
		canvas.getGraphicsContext2D().fillOval(jugador.getPosicion().getX() + 600, jugador.getPosicion().getY() + 480, VistaJugador.RADIO, VistaJugador.RADIO);
	
    }
	
}
