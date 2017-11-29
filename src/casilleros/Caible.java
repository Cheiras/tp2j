package casilleros;

import partida.jugador.Jugador;

public abstract class Caible {

	protected int posicion;
	
	public abstract void accionar(Jugador unJugador);
	
	public int getPosicion() {
		return this.posicion;
	}

	public void comprar(Jugador jugador) {
		//Deberia tirar excepcion de casillero no comprable
		
	}
	
}
