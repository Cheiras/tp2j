package propiedades;

import partida.Jugador;

public abstract class Propiedad {
	
	protected String nombre;
	protected int precio;
	protected Jugador duenio;
	
	public Propiedad(String nombre, int precio, Jugador duenio){
		this.nombre = nombre;
		this.precio = precio;
		this.duenio = duenio;
	}
	
}
