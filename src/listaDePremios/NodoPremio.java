package listaDePremios;

public class NodoPremio {
	int premioACobrar;
	NodoPremio proximo;
	
	public NodoPremio(int premioEnEfectivo) {
		this.premioACobrar=premioEnEfectivo;
		this.proximo=null;
	}
	
	public int obtenerPremio() {
		return premioACobrar;
	}
}
