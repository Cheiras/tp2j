package vista;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import partida.jugador.Jugador;

public class VistaJugador {

	private static final double RADIO = 50;
	Jugador jugador;
	
	public VistaJugador(Jugador jugador) {
		this.jugador = jugador;
		
	}
	
	public void dibujar(Canvas canvas) {
		canvas.getGraphicsContext2D().setFill(Color.BLUE);
		canvas.getGraphicsContext2D().fillOval(jugador.getPosicion().getX() + 600, jugador.getPosicion().getY() + 480, VistaJugador.RADIO, VistaJugador.RADIO);
	
    }
	
}
