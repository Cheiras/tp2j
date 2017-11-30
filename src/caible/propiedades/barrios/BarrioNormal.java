package caible.propiedades.barrios;

import partida.jugador.Jugador;

import java.util.ArrayList;

import estadoConstruccion.EstadoConstruccion;
import estadoConstruccion.EstadoConstruccionHotel;
import estadoConstruccion.EstadoConstruccionSegundaCasa;
import estadoConstruccion.EstadoConstruccionUnaCasa;
import estadoConstruccion.EstadoSinConstruccion;
import excepciones.RequisitosInsuficientesException;

public class BarrioNormal extends Barrio {

	protected String duplaBarrioNormal;
	private ArrayList<EstadoConstruccion> construcciones = new ArrayList<EstadoConstruccion>();
	private int indiceConstruccionActual;

	public BarrioNormal(String nombre, int precio, int posicion, int precioAlquiler, int precioAlquilerConUnaCasa,
			int precioAlquilerConDosCasas, int precioAlquilerConHotel, int precioConstruirCasa,
			int precioConstruirHotel) {

		super(nombre, precio, posicion, precioAlquiler);
		indiceConstruccionActual = 0;
		construcciones.add(new EstadoSinConstruccion(this, precioAlquiler, precioConstruirCasa));
		construcciones.add(new EstadoConstruccionUnaCasa(this, precioAlquilerConUnaCasa, precioConstruirCasa));
		construcciones.add(new EstadoConstruccionSegundaCasa(this, precioAlquilerConDosCasas, precioConstruirHotel));
		construcciones.add(new EstadoConstruccionHotel(this, precioAlquilerConHotel,precioConstruirHotel));
	}

	public int getPrecio() {
		return precio;
	}

	public Jugador getDuenio() {
		return duenio;
	}

	public void comprar() {

	}

	public void cobrarAlquiler(Jugador unJugador) throws RuntimeException {
		this.construcciones.get(this.indiceConstruccionActual).cobrarAlquiler(unJugador, this.duenio);

	}

	public void construir() {
		(this.construcciones.get(this.indiceConstruccionActual)).construir(this.duenio, this);
	}

	public boolean barrioHabilitadoParaConstruirHotel() {
		return this.construcciones.get(this.indiceConstruccionActual).habilitadoParaConstruirHotel();
	}
	
	public String getNombreBarrioDupla() {
		return this.duplaBarrioNormal;
	}

	@Override
	public void eliminarConstrucciones() {
		indiceConstruccionActual=0;
	}

	public EstadoConstruccion getConstrucciones() {
		return (this.construcciones.get(indiceConstruccionActual));
	}

	@Override
	public int getPrecioRentaActual() {
		return (this.construcciones.get(indiceConstruccionActual)).getCostoRenta();
	}

	public void cambiarEstadoConstruccion() {
		if ((indiceConstruccionActual + 1) < construcciones.size()) {
			indiceConstruccionActual++;
		}

	}
	
	public int getNumeroConstrucciones() {
		return this.indiceConstruccionActual;
	}
	
	public void venderConstruccion() throws RequisitosInsuficientesException {
		int numeroConstrucciones = this.getNumeroConstrucciones();
		if(numeroConstrucciones==0) {
			throw new RequisitosInsuficientesException("No hay construcciones para vender");
		}
		int dineroACobrarPorVenta=(this.construcciones.get(numeroConstrucciones).getCostoConstruccion()*85)/100;
		this.duenio.aumentarEfectivo(dineroACobrarPorVenta);
		this.indiceConstruccionActual=numeroConstrucciones-1;
	}
	
	public void ventaSinDupla() {
		/**Asumo que el jugador no tiene la dupla de propiedades y por lo tanto no tiene construcciones**/
		int dineroACobrarPorVenta=(this.getPrecio()*85)/100;
		this.duenio.aumentarEfectivo(dineroACobrarPorVenta);
		this.duenio.removerPropiedad(this);
		this.removeDuenio();
	}
	
	public void ventaConDupla() throws RequisitosInsuficientesException {
		/**Asumo que el jugador tiene la dupla de propiedades y puede tener construcciones**/
		int numeroConstruccionesActuales=this.getNumeroConstrucciones();
		BarrioNormal barrioPar=this.duenio.obtenerPropiedadString(this.duplaBarrioNormal);
		int numeroConstruccionesBarrioPar=barrioPar.getNumeroConstrucciones();
		for (int i = 0; i < numeroConstruccionesActuales; i++) {
			this.venderConstruccion();
		}
		for (int i = 0; i < numeroConstruccionesBarrioPar; i++) {
			barrioPar.venderConstruccion();
		}
		int dineroACobrarPorVenta=(this.getPrecio()*85)/100;
		this.duenio.aumentarEfectivo(dineroACobrarPorVenta);
		this.duenio.removerPropiedad(this);
		this.removeDuenio();
	}
	
	public void vendete() {
		Boolean contienePar=this.duenio.contienePropiedadString(this.duplaBarrioNormal);
		if(contienePar) {
			this.ventaConDupla();
		}
		else {
			this.ventaSinDupla();
		}
	}
	

}
