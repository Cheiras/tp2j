package caible.propiedades.barrios;

import caible.propiedades.Propiedad;

public abstract class Barrio  extends Propiedad{
	
	protected int precioAlquiler;

	public Barrio(String nombre, int precio, int posicion,int precioAlquiler){
		super(nombre, precio, posicion);
		this.precioAlquiler = precioAlquiler;
	}
	
	public int getPrecioRentaActual(){
		return -1;/**Es solo para debuggear**/
	}

	public void construir() {
		
	}
	
}
