package movimiento;
import partida.jugador.Jugador;

public interface MeMuevo {
	
	public default void mover(Jugador jugador, int cantidad) {
		
	}
	public default void siguienteMovimiento(Jugador jugador) {
		
	}
}
