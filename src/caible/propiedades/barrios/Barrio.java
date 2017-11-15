package caible.propiedades.barrios;

import caible.propiedades.Propiedad;
import partida.Jugador;

public abstract class Barrio  extends Propiedad{
	
	protected int precioAlquiler;

	public Barrio(String nombre, int precio, Jugador duenio, int posicion,int precioAlquiler){
		super(nombre, precio, duenio, posicion);
		this.precioAlquiler = precioAlquiler;
	}
	
	public void cobrarAlquiler(Jugador unJugador){
		
	}
	
}