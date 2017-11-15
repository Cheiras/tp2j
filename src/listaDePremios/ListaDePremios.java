package listaDePremios;

public class ListaDePremios {
	NodoPremio primero;
	NodoPremio ultimo;
	int cantidad;
	
	public ListaDePremios() {
		this.primero=null;
		this.ultimo=null;
		this.cantidad=0;
	}
	
	public boolean estaVacia() {
		return this.cantidad==0;
	}
	
	public void agregarNodoConPremio(int premioEnEfectivo) {
		NodoPremio nuevoNodo=new NodoPremio(premioEnEfectivo);
		if(this.estaVacia()) {
			this.primero=nuevoNodo;
		}
		else {
		this.ultimo.proximo=nuevoNodo;
		}
		this.ultimo=nuevoNodo;
		this.cantidad++;
	}
	
	public void cerrarLista() {
		this.ultimo.proximo=this.ultimo;
	}
	
	public int obtenerPrimerPremio() {
		return this.primero.obtenerPremio();
	}
}
