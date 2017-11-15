package caible.propiedades.barrios;

import partida.Jugador;

public class BarrioEspecial extends Barrio {

	private int precioAlquilerConEdificioHistorico;
	private int precioConstruirEdificioHistorico;
	
	public BarrioEspecial(String nombre, int precio, Jugador duenio, int posicion, int precioAlquiler, int precioAlquilerConEdificioHistorico, int precioConstruirEdificioHistorico){
		super(nombre, precio, duenio, posicion, precioAlquiler);
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
	public int getPrecioAlquiler() {
		return this.precioAlquiler;
	}
	
	public void cobrarAlquiler(Jugador unJugador){
/*Por ahora si algun jugador cae directamente cobra el alquiler sin edificio construido*/
		int precioAlquiler=this.getPrecioAlquiler();
		unJugador.reducirEfectivo(precioAlquiler);
		this.duenio.aumentarEfectivo(precioAlquiler);
	}
	
	public void construirEdificioHistorico(){
		
	}

	@Override
	public void accionar(Jugador unJugador) {
		// TODO Auto-generated method stub
		
	}
}
