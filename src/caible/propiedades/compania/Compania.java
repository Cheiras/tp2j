package caible.propiedades.compania;

import caible.propiedades.Propiedad;
import calculadoras.CalculadoraCompanias;
import partida.jugador.Jugador;

public class Compania extends Propiedad{
	
	private int multiplicadorComun;
	private int multiplicadorEspecial; // <-Se usa cuando hay un jugador que posee trenes y subtes
	private CalculadoraCompanias calculadoraCompanias;

	public Compania(String nombre, int precio, Jugador duenio, int posicion, int multiplicadorComun, int multiplicadorEspecial) {
		super(nombre, precio, duenio, posicion);
		this.multiplicadorComun = multiplicadorComun;
		this.multiplicadorEspecial = multiplicadorEspecial;
	}

	public void cobrarAlquiler(Jugador unJugador){
		// Todavia no se me ocurre como hacer que Subte y Tren usen un metodo
		//y Aysa y Edesur el otro sin repetir codigo, y tambien 
		//necesito una referencia a la calculadora
		int costoAlquiler = calculadoraCompanias.PrecioDeAlquilerAysEde(
				unJugador.getNumeroTotalSacadoEnDados(),
				multiplicadorComun, multiplicadorEspecial);
		unJugador.reducirEfectivo(costoAlquiler);
		this.duenio.aumentarEfectivo(costoAlquiler);
	}
}
