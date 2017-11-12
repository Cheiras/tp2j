package propiedades.barrios;

import partida.Jugador;
import propiedades.Propiedad;

public abstract class Barrio  extends Propiedad{
	
	protected int precioAlquiler;

	public Barrio(String nombre, int precio, Jugador duenio, int precioAlquiler){
		super(nombre, precio, duenio);
		this.precioAlquiler = precioAlquiler;
	}
	
	public void comprar(){
		
	}
	
	public void cobrarAlquiler(){
		
	}
	
}
