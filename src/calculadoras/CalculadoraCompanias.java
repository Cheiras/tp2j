package calculadoras;

import caible.propiedades.compania.Subte;
import caible.propiedades.compania.Trenes;
import partida.Jugador;

public class CalculadoraCompanias {
	private Subte companiaSubte;
	private Trenes companiaTren;
	public CalculadoraCompanias(Subte subte, Trenes tren) {
		companiaSubte= subte;
		companiaTren = tren;
	}
	public int PrecioDeAlquiler(int valorDados, int multiplicadorComun, int multiplicadorEspecial) {
		if (companiaSubte.obtenerDuenio()==companiaTren.obtenerDuenio()) {
			return valorDados*multiplicadorEspecial;
		}
		return valorDados*multiplicadorComun;
	}
}
