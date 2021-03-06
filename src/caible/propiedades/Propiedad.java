package caible.propiedades;

import casilleros.Caible;
import estadoDuenio.ConDuenio;
import estadoDuenio.EstadoDuenio;
import estadoDuenio.SinDuenio;
import excepciones.AccionInvalida;
import excepciones.MontoInsuficienteException;
import partida.jugador.Jugador;
import partida.jugador.NoJugador;

public abstract class Propiedad extends Caible {

	protected String nombre;
	protected int precio;
	protected Jugador duenio;
	private EstadoDuenio estadoDuenio;

	public Propiedad(String nombre, int precio, int posicion) {
		super(nombre);
		this.precio = precio;
		this.duenio = new NoJugador(0,null);
		this.estadoDuenio = new SinDuenio();
		this.posicion = posicion;
	}

	public void accionar(Jugador unJugador) {

		this.estadoDuenio.jugadorCayo(unJugador, this);

	}
	
	public int getPrecioDeCompra() {
		return precio;
	}

	public void setDuenio(Jugador nuevoDuenio) {
		this.duenio = nuevoDuenio;
		this.asignarDuenio();
		nuevoDuenio.agregarPropiedad(this);
	}
	public void comprar(Jugador jugadorQueCompra) {
		if(this.tieneDuenio()) {
			throw new AccionInvalida("Esta propiedad ya tiene duenio");
			
		}
		if (this.getPrecioDeCompra()>jugadorQueCompra.getEfectivo()) {
			throw new MontoInsuficienteException("No posees el efectivo suficiente");
		}
		jugadorQueCompra.reducirEfectivo(this.getPrecioDeCompra());
		this.setDuenio(jugadorQueCompra);	
	}

	private boolean tieneDuenio() {
		return this.estadoDuenio.tieneDuenio();
	}

	public Jugador obtenerDuenio() {
		return this.duenio;
	}

	public void cobrarAlquiler(Jugador unJugador) {

	}

	public void asignarDuenio() {
		this.estadoDuenio = new ConDuenio();
	}
	
	public String toString(){
		return String.format("%s", this.nombre);
	}
	
	public void eliminarConstrucciones() {
		
	}
	
	public void removeDuenio() {
		this.duenio=new NoJugador(0,null);
		this.estadoDuenio=new SinDuenio();
	}
	
	public void vendete() {
		
	}
	public void venderConstruccion() {
		
	}
}
