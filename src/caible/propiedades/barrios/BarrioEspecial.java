package caible.propiedades.barrios;

import java.util.ArrayList;

import construccionesBarriosEspeciales.EstadoConstruccionEnProvinciasUnicas;
import construccionesBarriosEspeciales.EstadoConstruccionEnProvinciasUnicasUnaCasa;
import construccionesBarriosEspeciales.EstadoSinConstruccionEnProvinciasUnicas;
import excepciones.JugadorEnBancarrotaException;
import partida.jugador.Jugador;

public class BarrioEspecial extends Barrio {

	private ArrayList<EstadoConstruccionEnProvinciasUnicas> construccion = new ArrayList<EstadoConstruccionEnProvinciasUnicas>();
	private int indiceConstruccionActual;

	public BarrioEspecial(String nombre, int precio, int posicion, int precioAlquiler,
			int precioAlquilerConUnicoEdificio, int precioConstruirEdificioHistorico) {
		super(nombre, precio, posicion, precioAlquiler);
		indiceConstruccionActual = 0;
		construccion.add(
				new EstadoSinConstruccionEnProvinciasUnicas(this, precioAlquiler, precioConstruirEdificioHistorico));
		construccion.add(new EstadoConstruccionEnProvinciasUnicasUnaCasa(this, precioAlquilerConUnicoEdificio));

	}

	public void comprar() {

	}

	public void cobrarAlquiler(Jugador unJugador) {
		int costoAlquiler = this.construccion.get(indiceConstruccionActual).getCostoRenta();
		if (unJugador.montoMenorA(costoAlquiler)) {
			throw new JugadorEnBancarrotaException("Has entrado en Bancarrota, lo siento.");

		}
		unJugador.reducirEfectivo(costoAlquiler);
		this.duenio.aumentarEfectivo(costoAlquiler);
	}

	public void construir() {
		this.construccion.get(indiceConstruccionActual).construir(this.duenio, this);
	}

	public void cambiarEstadoConstruccion() {
		if ((indiceConstruccionActual + 1) < construccion.size()) {
			indiceConstruccionActual++;
		}
	}

}
