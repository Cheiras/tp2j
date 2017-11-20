package partida;

import caible.especiales.AvanceDinamico;
import caible.especiales.Carcel;
import caible.especiales.ImpuestoDeLujo;
import caible.especiales.Policia;
import caible.especiales.Quini6;
import caible.especiales.RetrocesoDinamico;
import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import caible.propiedades.barrios.CordobaSur;
import caible.propiedades.barrios.Neuquen;
import caible.propiedades.barrios.SaltaNorte;
import caible.propiedades.barrios.SaltaSur;
import caible.propiedades.barrios.SantaFe;
import caible.propiedades.barrios.Tucuman;
import caible.propiedades.compania.Aysa;
import caible.propiedades.compania.Edesur;
import caible.propiedades.compania.Subte;
import caible.propiedades.compania.Trenes;
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

		
		
		

	}

	public Jugador jugadorActual() {
		return jugadorActual;
	}
}
