package caible.especiales;

import casilleros.Caible;
import partida.jugador.Jugador;

public class Policia extends Caible{
	
	
	Caible casilleroADesplazar;
		
	public Policia(Caible casilleroADesplazar) {
		super("Policia");
		this.casilleroADesplazar = casilleroADesplazar;
		this.posicion = 15;
	}
	
	public void accionar(Jugador unJugador) {
		unJugador.setIndice(casilleroADesplazar.getPosicion());
		casilleroADesplazar.accionar(unJugador);
	}
}
