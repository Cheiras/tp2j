package vista;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import partida.jugador.Jugador;

public class VistaJugador {

	private static final double RADIO = 100;
	Jugador jugador;
	
	public VistaJugador(Jugador jugador) {
		this.jugador = jugador;
		
	}
	
	public void dibujar(Canvas canvas) {
		this.clean(canvas);
		canvas.getGraphicsContext2D().setFill(Color.DARKBLUE);
		canvas.getGraphicsContext2D().fillOval(jugador.getPosicion().getX() + 230, jugador.getPosicion().getY() + 110, VistaJugador.RADIO, VistaJugador.RADIO);
	}

	public void clean(Canvas canvas) {
		canvas.getGraphicsContext2D().setFill(Color.LIGHTBLUE);
		canvas.getGraphicsContext2D().fillRect(0, 0, 460, 220);
    }
	
}
