package caible.propiedades.barrios;

import java.util.ArrayList;

import construccionesBarriosEspeciales.EstadoConstruccionEnProvinciasUnicas;
import construccionesBarriosEspeciales.EstadoConstruccionEnProvinciasUnicasUnaCasa;
import construccionesBarriosEspeciales.EstadoSinConstruccionEnProvinciasUnicas;
import excepciones.RequisitosInsuficientesException;
import partida.jugador.Jugador;

public class BarrioEspecial extends Barrio {

	private ArrayList<EstadoConstruccionEnProvinciasUnicas> construcciones = new ArrayList<EstadoConstruccionEnProvinciasUnicas>();
	private int indiceConstruccionActual;

	public BarrioEspecial(String nombre, int precio, int posicion, int precioAlquiler,
			int precioAlquilerConUnicoEdificio, int precioConstruirEdificioHistorico) {
		super(nombre, precio, posicion, precioAlquiler);
		indiceConstruccionActual = 0;
		this.construcciones
				.add(new EstadoSinConstruccionEnProvinciasUnicas(precioAlquiler, precioConstruirEdificioHistorico));
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

	public int getNumeroConstrucciones() {
		return this.indiceConstruccionActual;
	}

	public void venderConstruccion() {
		int dineroACobrar = (this.construcciones.get(this.indiceConstruccionActual).getCostoConstruccion() * 85) / 100;
		this.duenio.aumentarEfectivo(dineroACobrar);
		this.indiceConstruccionActual -= 1;
	}

	public void vendete() throws RequisitosInsuficientesException {
		int numConstrucciones = this.getNumeroConstrucciones();
		for (int i = 0; i < numConstrucciones; i++) {
			this.venderConstruccion();
		}
		int EfectivoACobrar = (this.getPrecioDeCompra() * 85) / 100;
		this.duenio.aumentarEfectivo(EfectivoACobrar);
		this.duenio.removerPropiedad(this);
		this.removeDuenio();
	}

}
