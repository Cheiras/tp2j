package sistemaTurnos;
import partida.Jugador;
public class NodoJugador {
	Jugador jugador;
	NodoJugador proximo;
	NodoJugador anterior;
	
	public NodoJugador(Jugador jugador) {
		this.jugador=jugador;
		this.proximo=null;
		this.anterior=null;
	}
	public Jugador obtenerJugador() {
		return this.jugador;
	}
}
