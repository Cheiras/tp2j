package partida.turno;

import movimiento.Dado;
import movimiento.Tirador;
import partida.jugador.Jugador;

public class Turno {

	private int valorTirada;
	
	public Turno(Jugador unJugador, Tirador tirador, Tablero tablero){
		valorTirada = tirador.tirar();
		unJugador.avanzar(valorTirada);
		tablero.
	}
}
