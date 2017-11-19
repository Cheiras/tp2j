package caible.propiedades.compania;

import caible.propiedades.Propiedad;
import partida.Jugador;

public class Compania extends Propiedad{
	
	private int multiplicador;

	public Compania(String nombre, int precio, Jugador duenio, int posicion, int multiplicador) {
		super(nombre, precio, duenio, posicion);
		this.multiplicador = multiplicador;
	}

	
	//HAY QUE AGREGAR LA LOGICA SI TIENE LAS DOS COMPANIAS PARA EL MULTIPLICADOR.
	public void cobrarAlquiler(){
		//int costoAlquiler =turno.valorDados()*this.multiplicador;
		//unJugador.reducirEfectivo(costoAlquiler);
		//this.duenio.aumentarEfectivo(costoAlquiler);
	}
}
