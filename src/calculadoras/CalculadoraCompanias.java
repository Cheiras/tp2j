package calculadoras;

import caible.propiedades.compania.Aysa;
import caible.propiedades.compania.Edesur;
import caible.propiedades.compania.Subte;
import caible.propiedades.compania.Trenes;
import partida.Jugador;

public class CalculadoraCompanias {
	private Subte companiaSubte;
	private Trenes companiaTren;
	private Aysa companiaAysa;
	private Edesur companiaEdesur;
	public CalculadoraCompanias(Subte subte, Trenes tren, Aysa aysa, Edesur edesur) {
		companiaSubte= subte;
		companiaTren = tren;
		companiaAysa= aysa;
		companiaEdesur = edesur;
	}
	public int PrecioDeAlquilerTrSubt(int valorDados, int multiplicadorComun, int multiplicadorEspecial) {
		if (companiaSubte.obtenerDuenio()==companiaTren.obtenerDuenio()) {
			return valorDados*multiplicadorEspecial;
		}
		return valorDados*multiplicadorComun;
	}
	public int PrecioDeAlquilerAysEde(int valorDados, int multiplicadorComun, int multiplicadorEspecial) {
		if (companiaAysa.obtenerDuenio()==companiaEdesur.obtenerDuenio()) {
			return valorDados*multiplicadorEspecial;
		}
		return valorDados*multiplicadorComun;
	}

}
