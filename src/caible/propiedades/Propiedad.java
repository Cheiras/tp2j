package caible.propiedades;

import casilleros.Caible;
import estadoDuenio.ConDuenio;
import estadoDuenio.EstadoDuenio;
import estadoDuenio.SinDuenio;
import partida.Jugador;

public abstract class Propiedad extends Caible {

	protected String nombre;
	protected int precio;
	protected Jugador duenio;
	private EstadoDuenio estadoDuenio;

	public Propiedad(String nombre, int precio, Jugador duenio, int posicion) {
		this.nombre = nombre;
		this.precio = precio;
		this.duenio = duenio;
		this.estadoDuenio = new SinDuenio();
		this.posicion = posicion;
	}

	public int getPrecioDeCompra() {
		return precio;
	};

	public void cambiarDuenio(Jugador nuevoDuenio) {
		this.duenio = nuevoDuenio;
	}

	public void comprar(Jugador jugadorQueCompra) {
		jugadorQueCompra.reducirEfectivo(this.getPrecioDeCompra());
		this.cambiarDuenio(jugadorQueCompra);

		jugadorQueCompra.agregarPropiedad(this);
	}

	public Jugador obtenerDuenio() {
		return this.duenio;
	}

	public void cobrarAlquiler(Jugador unJugador) {

	}

	public void cayoJugador(Jugador jugadorQueCayo) {
		this.estadoDuenio.jugadorCayo(jugadorQueCayo, this);
	}

	public void asignarDuenio() {
		this.estadoDuenio = new ConDuenio();
	}
}
