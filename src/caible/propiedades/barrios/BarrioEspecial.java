package caible.propiedades.barrios;

import partida.jugador.Jugador;

public class BarrioEspecial extends Barrio {

	private int precioAlquilerConUnicoEdificio;
	private int precioConstruirEdificioHistorico;
	
	public BarrioEspecial(String nombre, int precio, int posicion, int precioAlquiler, int precioAlquilerConUnicoEdificio, int precioConstruirEdificioHistorico){
		super(nombre, precio, posicion, precioAlquiler);
		this.precioAlquilerConUnicoEdificio = precioAlquilerConUnicoEdificio;
		this.precioConstruirEdificioHistorico = precioConstruirEdificioHistorico;
	}

	public int getprecioAlquilerConUnicoEdificio() {
		return precioAlquilerConUnicoEdificio;
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
