package quini6;
import partida.Jugador;
public class Quini6 {

	public void jugadorCayo(Jugador unJugador) {
		this.unJugadorGanoElQuini(unJugador);
	}
	public void unJugadorGanoElQuini(Jugador unJugadorConSuerte) {
		unJugadorConSuerte.cobrarPremioDelQuini();
	}
}
