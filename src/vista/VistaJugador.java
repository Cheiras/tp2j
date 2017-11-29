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
		this.clean(canvas);
		canvas.getGraphicsContext2D().setFill(Color.BLUE);
		canvas.getGraphicsContext2D().fillOval(jugador.getPosicion().getX() + 700, jugador.getPosicion().getY() + 660, VistaJugador.RADIO, VistaJugador.RADIO);
	}

	public void clean(Canvas canvas) {
		canvas.getGraphicsContext2D().setFill(Color.TRANSPARENT);
		canvas.getGraphicsContext2D().fillRect(0, 0, 460, 220);
    }
	
}
