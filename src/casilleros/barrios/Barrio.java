package casilleros.barrios;

import partida.Jugador;

public abstract class Barrio {
	protected String nombre;
	protected int precio;
	protected Jugador duenio;
	protected int precioAlquiler;
	
	public Barrio(String nombre, int precio, Jugador duenio, int precioAlquiler){
		this.nombre = nombre;
		this.precio = precio;
		this.duenio = duenio;
		this.precioAlquiler = precioAlquiler;
	}
	
	public void comprar(){
		
	}
	
	public void cobrarAlquiler(){
		
	}
	
}
