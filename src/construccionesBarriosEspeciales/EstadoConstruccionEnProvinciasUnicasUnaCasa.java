package construccionesBarriosEspeciales;
import caible.propiedades.barrios.BarrioEspecial;
import excepciones.ConstruccionException;
import partida.jugador.Jugador;

public class EstadoConstruccionEnProvinciasUnicasUnaCasa extends EstadoConstruccionEnProvinciasUnicas{

	public EstadoConstruccionEnProvinciasUnicasUnaCasa(BarrioEspecial unBarrio) {
		this.costoRenta=unBarrio.getprecioAlquilerConUnicoEdificio();
	}

	@Override
	public EstadoConstruccionEnProvinciasUnicas construir(Jugador duenio, BarrioEspecial unBarrio) {
		throw new ConstruccionException("No hay nada mas que puedas construir para este barrio.");
	}
	
}
