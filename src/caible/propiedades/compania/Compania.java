package caible.propiedades.compania;

import caible.propiedades.Propiedad;
import calculadoras.CalculadoraCompanias;
import partida.jugador.Jugador;

public class Compania extends Propiedad{
	
	private int multiplicadorComun;
	private int multiplicadorEspecial; // <-Se usa cuando hay un jugador que posee trenes y subtes
	private CalculadoraCompanias calculadoraCompanias;
	private Compania CompaniaPar;

	public Compania(String nombre, int precio, int posicion, int multiplicadorComun, int multiplicadorEspecial) {
		super(nombre, precio, posicion);
		this.multiplicadorComun = multiplicadorComun;
		this.multiplicadorEspecial = multiplicadorEspecial;
	}

	public void cobrarAlquiler(Jugador unJugador) {
		int alquiler;
		int multiplicador;
		int valorDados=unJugador.getNumeroTotalSacadoEnDados();
		if(this.obtenerDuenio()==this.getPar().obtenerDuenio()) {
			multiplicador=this.getMultiplicadorEspecial();
		}
		else {
			multiplicador=this.getMultiplicadorComun();
		}
		alquiler=multiplicador*valorDados;
		unJugador.reducirEfectivo(alquiler);
		this.duenio.aumentarEfectivo(alquiler);
	}
	
	public void setPar(Compania unaCompania) {
		this.CompaniaPar=unaCompania;
	}
	
	public int getMultiplicadorComun() {
		return this.multiplicadorComun;
	}
	public int getMultiplicadorEspecial() {
		return this.multiplicadorEspecial;
	}
	public Compania getPar() {
		return this.CompaniaPar;
	}
}
