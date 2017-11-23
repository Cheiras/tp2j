package caible.propiedades.barrios;
import construccionesBarriosEspeciales.EstadoConstruccionEnProvinciasUnicas;
import construccionesBarriosEspeciales.EstadoSinConstruccionEnProvinciasUnicas;
import excepciones.JugadorEnBancarrotaException;
import partida.jugador.Jugador;

public class BarrioEspecial extends Barrio {

	private int precioAlquilerConUnicoEdificio;
	private int precioConstruirEdificioHistorico;
	private EstadoConstruccionEnProvinciasUnicas construccion;
	
	public BarrioEspecial(String nombre, int precio, int posicion, int precioAlquiler, int precioAlquilerConUnicoEdificio, int precioConstruirEdificioHistorico){
		super(nombre, precio, posicion, precioAlquiler);
		this.precioAlquilerConUnicoEdificio = precioAlquilerConUnicoEdificio;
		this.precioConstruirEdificioHistorico = precioConstruirEdificioHistorico;
		this.construccion=new EstadoSinConstruccionEnProvinciasUnicas(this); 
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
		int costoAlquiler = this.construccion.getCostoRenta();
		if(unJugador.montoMenorA(costoAlquiler)) {
			throw new JugadorEnBancarrotaException("Has entrado en Bancarrota, lo siento.");
		
		}
		unJugador.reducirEfectivo(costoAlquiler);
		this.duenio.aumentarEfectivo(costoAlquiler);
	}

	
	public void setConstruccion(EstadoConstruccionEnProvinciasUnicas unaConstruccion) {
		this.construccion=unaConstruccion;
	}
	public void construir() {
		this.construccion = this.construccion.construir(this.duenio,this);
	}
	
}
