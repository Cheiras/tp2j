package caible.propiedades.barrios;

import java.util.ArrayList;

import construccionesBarriosEspeciales.EstadoConstruccionEnProvinciasUnicas;
import construccionesBarriosEspeciales.EstadoConstruccionEnProvinciasUnicasUnaCasa;
import construccionesBarriosEspeciales.EstadoSinConstruccionEnProvinciasUnicas;
import partida.jugador.Jugador;

public class BarrioEspecial extends Barrio {

	private ArrayList<EstadoConstruccionEnProvinciasUnicas> construcciones = new ArrayList<EstadoConstruccionEnProvinciasUnicas>();
	private int indiceConstruccionActual;

	public BarrioEspecial(String nombre, int precio, int posicion, int precioAlquiler,
			int precioAlquilerConUnicoEdificio, int precioConstruirEdificioHistorico) {
		super(nombre, precio, posicion, precioAlquiler);
		indiceConstruccionActual = 0;
		this.construcciones.add(
				new EstadoSinConstruccionEnProvinciasUnicas( precioAlquiler, precioConstruirEdificioHistorico));
		this.construcciones.add(new EstadoConstruccionEnProvinciasUnicasUnaCasa(precioAlquilerConUnicoEdificio));

	}

	public void comprar() {

	}

	public void cobrarAlquiler(Jugador unJugador) {
		this.construcciones.get(indiceConstruccionActual).cobrarRenta(unJugador, this.duenio);
	}

	public void construir() {
		this.construcciones.get(indiceConstruccionActual).construir(this.duenio, this);
	}

	public void cambiarEstadoConstruccion() {
		if ((indiceConstruccionActual + 1) < this.construcciones.size()) {
			indiceConstruccionActual++;
		}
	}

}
