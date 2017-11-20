package caible.propiedades.barrios;

import partida.jugador.Jugador;

public class BarrioNormal extends Barrio {

	private int precioAlquilerConUnaCasa;
	private int precioAlquilerConDosCasas;
	private int precioAlquilerConHotel;
	private int precioConstruirCasa;
	private int precioConstruirHotel;
	
	private Construccion construcciones = new ConstruccionNula(this);

	public BarrioNormal(String nombre, int precio, Jugador duenio, int posicion, int precioAlquiler,
			int precioAlquilerConUnaCasa, int precioAlquilerConDosCasas, int precioAlquilerConHotel,
			int precioConstruirCasa, int precioConstruirHotel) {
		
		super(nombre, precio, duenio, posicion, precioAlquiler);
		this.precioAlquilerConUnaCasa = precioAlquilerConUnaCasa;
		this.precioAlquilerConDosCasas = precioAlquilerConDosCasas;
		this.precioAlquilerConHotel = precioAlquilerConHotel;
		this.precioConstruirCasa = precioConstruirCasa;
		this.precioConstruirHotel = precioConstruirHotel;
	}

	public String getNombre() {
		return nombre;
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

	public void cobrarAlquiler(Jugador unJugador) {
		/*
		 * Pora ahora para probar los comportamientos del juego pedidos por la
		 * entrega
		 */
		int costoAlquiler = this.getPrecioAlquiler();
		unJugador.reducirEfectivo(costoAlquiler);
		/* Habria que evaluar si tiene efectivo suficiente */
		this.duenio.aumentarEfectivo(costoAlquiler);
	}

	public void construirCasa() {
		this.construcciones = this.construcciones.construir(this.duenio);
	}

	public void construirHotel() {
			
	}

}
