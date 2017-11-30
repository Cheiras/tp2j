package partida.jugador;

import java.util.ArrayList;

import caible.propiedades.Propiedad;
import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioNormal;
import excepciones.AccionInvalida;
import movimiento.MeMuevo;
import premio.Premio;
import premio.Premio50k;

public class Jugador {
	
	private TablaConversion tablaConversion;

	private MeMuevo movimiento;
	private int indice;
	private String nombre;
	private int efectivoDisponible;
	private ArrayList<Propiedad> listaDePropiedades;
	private Premio premioQuini = new Premio50k();

	int numeroTotalSacadoEnDados; 

	private boolean habilitadoAPagarFianza = false;

	public Jugador(String nombre, int efectivoInicial, MeMuevo movimientoNormal) {
		this.tablaConversion = new TablaConversion();
		this.nombre = nombre;
		this.indice = 0;
		this.movimiento = movimientoNormal;
		this.efectivoDisponible = efectivoInicial;
		this.listaDePropiedades = new ArrayList<Propiedad>();
	}

	public int getEfectivo() {
		return efectivoDisponible;
	}

	public void retrocederCasillero() {
		this.indice -= 1;
		if(this.indice == -1) {
			this.indice = 19;
		}

	}

	public void avanzar(int cantidad) {
		this.movimiento.mover(this, cantidad);
		
	}

	public void nuevoMovimiento(MeMuevo nuevoMovimiento) {
		this.movimiento = nuevoMovimiento;

	}

	public void avanzarCasillero() {
	
		this.indice += 1;
		if(this.indice == 20) {
			this.indice = 0;
		}
	}

	public int getNumeroTotalSacadoEnDados() {
		return this.numeroTotalSacadoEnDados;
	}

	public int cantidadDePropiedadesASuNombre() {
		return this.listaDePropiedades.size();
	}

	public void reducirEfectivo(int efectivoAReducir) {
		this.efectivoDisponible -= efectivoAReducir;
	}

	public void aumentarEfectivo(int efectivoAAumentar) {
		this.efectivoDisponible += efectivoAAumentar;
	}

	public void agregarPropiedad(Propiedad propiedadComprada) {
		this.listaDePropiedades.add(propiedadComprada);
	}

	public boolean contienePropiedad(Propiedad propiedadABuscar) {
		return listaDePropiedades.contains(propiedadABuscar);
	}

	public void cobrarPremioDelQuini() {
		this.premioQuini.cobrar(this);
	}

	public void setIndice(int nuevaindice) {
		this.indice = nuevaindice;
	}

	public int getIndice() {
		return this.indice;
	}

	public boolean montoMenorA(int monto) {
		return (this.efectivoDisponible < monto);
	}

	public void setNumeroTotalSacadoEnDados(int numero) {
		this.numeroTotalSacadoEnDados = numero;
	}

	public void setPremio(Premio unPremio) {
		this.premioQuini = unPremio;
	}

	public boolean estadoDeHabilitacion() {
		return this.habilitadoAPagarFianza;
	}

	public void deshabilitar() {
		this.habilitadoAPagarFianza = false;
	}

	public void habilitar() {
		this.habilitadoAPagarFianza = true;
	}

	public String toString() {
		return String.format("%s", this.nombre);
	}

	public boolean contienePropiedadString(String nombreBarrioDupla) {

		for (Propiedad propiedad : this.listaDePropiedades) {
			if (propiedad.getNombre() == nombreBarrioDupla) {
				return true;
			}
		}
		return false;
	}

	public void removerPropiedad(Propiedad unaPropiedad) {
		this.listaDePropiedades.remove(unaPropiedad);
	}

	public void transferirPropiedad(Propiedad unaPropiedad, Jugador nuevoDuenio) {
		this.removerPropiedad(unaPropiedad);
		unaPropiedad.setDuenio(nuevoDuenio);
		unaPropiedad.eliminarConstrucciones();
		nuevoDuenio.agregarPropiedad(unaPropiedad);
	}

	public void intercambiarPropiedades(Jugador oponente, Propiedad propiedadDelJugador,
			Propiedad propiedadDelOponente) {
		this.transferirPropiedad(propiedadDelJugador, oponente);
		oponente.transferirPropiedad(propiedadDelOponente, this);
	}

	public void construirEn(Barrio unBarrio) throws RuntimeException {

		if (!listaDePropiedades.contains(unBarrio)) {
			throw new AccionInvalida("No puedes construir en un barrio que no te pertenece");
		}

		unBarrio.construir();
	}

	public BarrioNormal obtenerPropiedadString(String nombreBarrioDupla) throws RuntimeException {
		
		for (Propiedad propiedad : this.listaDePropiedades) {
			if (propiedad.getNombre() == nombreBarrioDupla) {
				return (BarrioNormal) propiedad;
			}
		}
		throw new RuntimeException("Error, nunca deberia caer aca");
	}
	
	public void venderPropiedad(Propiedad unaPropiedad) {
		unaPropiedad.vendete();
	}

	
	public Posicion getPosicion() {
		return this.tablaConversion.getPosicion(this.indice);
	}
	
	public ArrayList<Propiedad> getPropiedades(){
		return this.listaDePropiedades;
	}

	public void siguienteMovimiento() {
		this.movimiento.siguienteMovimiento(this);
	}
	public String getNombre() {
		return this.nombre;
	}
}
