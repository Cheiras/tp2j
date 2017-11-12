package casilleros.barrios;

import partida.Jugador;

public class BarrioEspecial extends Barrio {

	private int precioAlquilerConEdificioHistorico;
	private int precioConstruirEdificioHistorico;
	
	public BarrioEspecial(String nombre, int precio, Jugador duenio, int precioAlquiler, int precioAlquilerConEdificioHistorico, int precioConstruirEdificioHistorico){
		super(nombre, precio, duenio, precioAlquiler);
		this.precioAlquilerConEdificioHistorico = precioAlquilerConEdificioHistorico;
		this.precioConstruirEdificioHistorico = precioConstruirEdificioHistorico;
	}

	public int getPrecioAlquilerConEdificioHistorico() {
		return precioAlquilerConEdificioHistorico;
	}

	public int getPrecioConstruirEdificioHistorico() {
		return precioConstruirEdificioHistorico;
	}
	
	public void comprar(){
		
	}
	
	public void cobrarAlquiler(){
		
	}
	
	public void construirEdificioHistorico(){
		
	}
}
