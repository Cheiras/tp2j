package casilleros;

import partida.jugador.Jugador;

public abstract class Caible {

	protected int posicion;
	protected String nombre;
	
	public Caible(String nombre) {
		this.nombre=nombre;
	}

	public abstract void accionar(Jugador unJugador);
	
	public int getPosicion() {
		return this.posicion;
	}
	public String getNombre() {
		return nombre;
	}
	
}
