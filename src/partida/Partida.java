package partida;

import movimiento.Dado;
import propiedades.barrios.Barrio;
import propiedades.barrios.BarrioNormal;

public class Partida {
	
	Jugador jugadorActual;

	public Partida(){
		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);
		
		Jugador jugador1 = new Jugador(100000, null);
		Jugador jugador2 = new Jugador(100000, null);
		Jugador jugador3 = new Jugador(100000, null);
		Jugador noJugador = new Jugador(0, null);
		
		
		
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, noJugador, 2000, 3000, 3500, 5000, 5000, 8000);

	}
	
	public Jugador jugadorActual(){
		return jugadorActual;
	}
}
