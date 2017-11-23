package caible.propiedades.barrios;

import excepciones.JugadorEnBancarrotaException;
import partida.jugador.Jugador;
import estadoConstruccion.EstadoConstruccion;
import estadoConstruccion.EstadoSinConstruccion;
public class BarrioNormal extends Barrio {

	private int precioAlquiler;
	private int precioAlquilerConUnaCasa;
	private int precioAlquilerConDosCasas;
	private int precioAlquilerConHotel;
	private int precioConstruirCasa;
	private int precioConstruirHotel;
	protected String duplaBarrioNormal; //lo asigno en la subclase propia
	private EstadoConstruccion construcciones;

	public BarrioNormal(String nombre, int precio, int posicion, int precioAlquiler,
			int precioAlquilerConUnaCasa, int precioAlquilerConDosCasas, int precioAlquilerConHotel,
			int precioConstruirCasa, int precioConstruirHotel) {
		
		super(nombre, precio, posicion, precioAlquiler);
		this.precioAlquilerConUnaCasa = precioAlquilerConUnaCasa;
		this.precioAlquilerConDosCasas = precioAlquilerConDosCasas;
		this.precioAlquilerConHotel = precioAlquilerConHotel;
		this.precioConstruirCasa = precioConstruirCasa;
		this.precioConstruirHotel = precioConstruirHotel;
		this.precioAlquiler=precioAlquiler;
		this.construcciones=new EstadoSinConstruccion(this);
	}



	public int getPrecio() {
		return precio;
	}

	public Jugador getDuenio() {
		return duenio;
	}

	public int getAlquiler() {
		return precioAlquiler;
	}

	public int getPrecioAlquiler() {
		return precioAlquiler;
	}

	public int getPrecioAlquilerConUnaCasa() {
		return precioAlquilerConUnaCasa;
	}

	public int getPrecioAlquilerConDosCasas() {
		return precioAlquilerConDosCasas;
	}

	public int getPrecioAlquilerConHotel() {
		return precioAlquilerConHotel;
	}

	public int getPrecioConstruirCasa() {
		return precioConstruirCasa;
	}

	public int getPrecioConstruirHotel() {
		return precioConstruirHotel;
	}

	public void comprar() {

	}

	public void cobrarAlquiler(Jugador unJugador) throws RuntimeException{
		
		int costoAlquiler = this.construcciones.getCostoRenta();
		if(unJugador.montoMenorA(costoAlquiler)) {
			throw new JugadorEnBancarrotaException("Has entrado en Bancarrota, lo siento.");
		
		}
		unJugador.reducirEfectivo(costoAlquiler);
		this.duenio.aumentarEfectivo(costoAlquiler);
	}

	public void construir() {
		//***this.construcciones = this.construcciones.construir(this.duenio,this);**/
	}


	public String getNombreBarrioDupla() {
		return this.duplaBarrioNormal;
	}
	@Override
	public void eliminarConstrucciones() {
		this.construcciones = new EstadoSinConstruccion(this);
	}

	public EstadoConstruccion getConstrucciones(){
		return this.construcciones;
	}
	@Override
	public int getPrecioRentaActual() {
		return this.construcciones.getCostoRenta();
	}
}
