package partida;

import java.util.LinkedList;

import caible.propiedades.Propiedad;
import casilleros.Caible;
import movimiento.MeMuevo;
import premio.Premio;
import premio.Premio50k;

public class Jugador {

	private MeMuevo movimiento;

	private int posicion;

	private Caible casilleroActual;

	int efectivoDisponible;
	LinkedList<Propiedad> listaDePropiedades;
	Premio premioQuini = new Premio50k();

	int numeroTotalSacadoEnDados; // (Auxiliar para los tests de esta entrega.)

	public Jugador(int efectivoInicial, MeMuevo movimientoNormal) {

		this.posicion = 0;
		this.movimiento = movimientoNormal;
		this.efectivoDisponible = efectivoInicial;
		this.listaDePropiedades = new LinkedList<Propiedad>();
	}

	public int getEfectivo() {
		// TODO Auto-generated method stub
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
		// Tanto los terrenos como las casas como los hoteles suman como propiedad.
		return 0;
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
		int esta = this.listaDePropiedades.indexOf(propiedadABuscar);
		if (esta != -1) {
			return true;
		}
		return false;
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
}
