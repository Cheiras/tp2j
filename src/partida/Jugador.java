package partida;

import java.util.ArrayList;

import caible.propiedades.Propiedad;
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
	
}
