package partida.jugador;

import java.util.ArrayList;

import caible.propiedades.Propiedad;
import caible.propiedades.barrios.BarrioNormal;
import excepciones.AccionInvalida;
import movimiento.MeMuevo;
import premio.Premio;
import premio.Premio50k;

public class Jugador {

	private MeMuevo movimiento;

	private int posicion;
	private String nombre;
	private int efectivoDisponible;
	private ArrayList<Propiedad> listaDePropiedades;
	private Premio premioQuini = new Premio50k();

	int numeroTotalSacadoEnDados; // (Auxiliar para los tests de esta entrega.)

	private boolean habilitadoAPagarFianza = false;

	public Jugador(String nombre, int efectivoInicial, MeMuevo movimientoNormal) {
		
		this.nombre = nombre;
		this.posicion = 0;
		this.movimiento = movimientoNormal;
		this.efectivoDisponible = efectivoInicial;
		this.listaDePropiedades = new ArrayList<Propiedad>();
	}

	public int getEfectivo() {
		return efectivoDisponible;
	}

	public void retrocederCasillero() {
		this.posicion -= 1;

	}

	public void avanzar(int cantidad) {
		this.movimiento.mover(this, cantidad);
	}

	public void nuevoMovimiento(MeMuevo nuevoMovimiento) {
		this.movimiento = nuevoMovimiento;

	}

	public void avanzarCasillero() {
		this.posicion += 1;
	}

	
	//Solo para pruebas, lo contiene el turno.
	public int getNumeroTotalSacadoEnDados() {
		return numeroTotalSacadoEnDados;
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

	public void setPosicion(int nuevaPosicion) {
		this.posicion = nuevaPosicion;
	}

	public int getPosicion() {
		return this.posicion;
	}

	public boolean montoMenorA(int monto) {
		return (this.efectivoDisponible < monto);
	}

	//Solo para pruebas, lo contiene el turno.
	public void setNumeroTotalSacadoEnDados(int numero) {
		numeroTotalSacadoEnDados = numero;
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
	
	public String toString(){
		return String.format("%s", this.nombre);
	}

	public boolean contienePropiedadString(String nombreBarrioDupla) {
		
		for(Propiedad propiedad : this.listaDePropiedades ) {
			if(propiedad.getNombre() == nombreBarrioDupla) {
				return true;
			}
		}
		return false;
	}
	public void removerPropiedad(Propiedad unaPropiedad) {
		this.listaDePropiedades.remove(unaPropiedad);
	}
	public void transferirPropiedad(Propiedad unaPropiedad,Jugador nuevoDuenio) {
		this.removerPropiedad(unaPropiedad);
		unaPropiedad.setDuenio(nuevoDuenio);
		unaPropiedad.eliminarConstrucciones();
		nuevoDuenio.agregarPropiedad(unaPropiedad);
	}
	public void intercambiarPropiedades(Jugador oponente,Propiedad propiedadDelJugador,Propiedad propiedadDelOponente) {
		this.transferirPropiedad(propiedadDelJugador, oponente);
		oponente.transferirPropiedad(propiedadDelOponente, this);
	}
	
	public void construirEn(BarrioNormal unBarrio)throws RuntimeException {
		
		if(! listaDePropiedades.contains(unBarrio)) {
			throw new AccionInvalida("No puedes construir en un barrio que no te pertenece");
		}
		
		unBarrio.construir();
	}
	
}
