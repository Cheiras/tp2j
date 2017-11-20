package partida.turno;

import movimiento.Tirador;
import partida.jugador.Jugador;
import partida.tablero.Tablero;

public class Turno {

	private int valorTirada;
	
	public Turno(Jugador unJugador, Tirador tirador, Tablero tablero){
		valorTirada = tirador.tirar();
		unJugador.avanzar(valorTirada);
		
	}
}
