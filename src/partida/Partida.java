package partida;

import caible.especiales.AvanceDinamico;
import caible.especiales.Carcel;
import caible.especiales.Quini6;
import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import caible.propiedades.barrios.CordobaSur;
import caible.propiedades.compania.Compania;
import casilleros.Caible;
import movimiento.Dado;

public class Partida {

	Jugador jugadorActual;

	public Partida() {
		
		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);

		Jugador jugador1 = new Jugador(100000, null);
		Jugador jugador2 = new Jugador(100000, null);
		Jugador jugador3 = new Jugador(100000, null);
		Jugador noJugador = new Jugador(0, null);

		//TODO ESTO IRIA AL TABLERO.
		Caible quini6 = new Quini6();
		
		Caible buenosAiresSur = new BuenosAiresSur("Buenos Aires Sur", 20000, noJugador, 2, 2000, 3000, 3500, 5000, 5000,
				8000);
		
		Caible edesur = new Compania("Edesur", 35000, noJugador, 3, 500);
		
		Caible buenosAiresNorte = new BuenosAiresNorte("Buenos Aires Norte", 25000, noJugador, 4, 2500, 3500, 4000, 6000, 5500,
				9000);
		
		Caible carcel = new Carcel();
		
		Caible cordobaSur = new CordobaSur("Cordoba Sur", 18000, noJugador, 6, 1000, 1500, 2500, 3000, 2000,
				3000);
		
		Caible avanzeDinamico = new AvanceDinamico();
		
		Caible subte = new Compania("Subte", 40000, noJugador, 8, 600);
		
		Caible cordobaNorte = new BarrioNormal("Cordoba Norte", 20000, noJugador, 9, 1300, 1800, 2900, 3500, 2200,
				3500);
		

	}

	public Jugador jugadorActual() {
		return jugadorActual;
	}
}
