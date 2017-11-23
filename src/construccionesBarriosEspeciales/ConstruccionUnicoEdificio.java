package construccionesBarriosEspeciales;
import caible.propiedades.barrios.BarrioEspecial;
public class ConstruccionUnicoEdificio extends ConstruccionEnProvinciasUnicas{

	public ConstruccionUnicoEdificio(BarrioEspecial unBarrio) {
		this.costoRenta=unBarrio.getprecioAlquilerConUnicoEdificio();
	}
	
	public void construir() {
		/*No hace nada porque no se puede construir mas*/
	}
}
