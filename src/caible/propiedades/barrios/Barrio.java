package caible.propiedades.barrios;

import java.util.ArrayList;

import caible.propiedades.Propiedad;

public abstract class Barrio  extends Propiedad{
	
	protected ArrayList<Construccion> construcciones = new ArrayList<Construccion>();
	protected int indiceConstruccionActual;

	public Barrio(String nombre, int precio, int posicion,int precioAlquiler){
		super(nombre, precio, posicion);
	}
	
	public int getPrecioRentaActual(){
		return -1;/**Es solo para debuggear**/
	}

	public void construir() {
		
	}
	
}
