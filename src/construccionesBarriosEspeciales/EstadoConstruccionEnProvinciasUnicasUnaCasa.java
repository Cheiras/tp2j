package construccionesBarriosEspeciales;
import caible.propiedades.barrios.BarrioEspecial;
import excepciones.ConstruccionException;
import partida.jugador.Jugador;

public class EstadoConstruccionEnProvinciasUnicasUnaCasa extends EstadoConstruccionEnProvinciasUnicas{

	public EstadoConstruccionEnProvinciasUnicasUnaCasa( int precioAlquilerConUnicoEdificio) {
		this.costoRenta = precioAlquilerConUnicoEdificio;
	}

	@Override
	public void construir(Jugador duenio, BarrioEspecial unBarrio) {
		throw new ConstruccionException("No hay nada mas que puedas construir para este barrio.");
	}
	
}
