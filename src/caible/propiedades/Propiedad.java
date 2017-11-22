package caible.propiedades;

import casilleros.Caible;
import estadoDuenio.ConDuenio;
import estadoDuenio.EstadoDuenio;
import estadoDuenio.SinDuenio;
import partida.jugador.Jugador;
import partida.jugador.NoJugador;

public abstract class Propiedad extends Caible {

	protected String nombre;
	protected int precio;
	protected Jugador duenio;
	private EstadoDuenio estadoDuenio;

	public Propiedad(String nombre, int precio, int posicion) {
		this.nombre = nombre;
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
	public String getNombre() {
		return nombre;
	}
	public void comprar(Jugador jugadorQueCompra) {
		jugadorQueCompra.reducirEfectivo(this.getPrecioDeCompra());
		this.setDuenio(jugadorQueCompra);
		jugadorQueCompra.agregarPropiedad(this);
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
}
