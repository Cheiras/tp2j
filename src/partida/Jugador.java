package partida;
import java.util.LinkedList;
import listaDePremios.ListaDePremios;
import listaDePremios.IteradorListaPremios;
import propiedades.Propiedad;
public class Jugador {
	int efectivoDisponible;
	LinkedList<Propiedad> listaDePropiedades;
	ListaDePremios premiosQuini;
	IteradorListaPremios premioQuiniAGanar;
	
	public Jugador(int efectivoInicial) {
		this.efectivoDisponible=efectivoInicial;
		this.listaDePropiedades=new LinkedList<Propiedad>();
		this.premiosQuini=new ListaDePremios();
		this.premiosQuini.agregarNodoConPremio(50000);
		this.premiosQuini.agregarNodoConPremio(30000);
		this.premiosQuini.agregarNodoConPremio(0);
		this.premiosQuini.cerrarLista();
		this.premioQuiniAGanar=new IteradorListaPremios(premiosQuini);
	}
	
	public int getEfectivo() {
		// TODO Auto-generated method stub
		return efectivoDisponible;
	}
	
	public void retrocederCasillero() {
		// TODO Auto-generated method stub
		
	}

	public void avanzarCasillero() {
		// TODO Auto-generated method stub
		
	}

	public int numeroTotalSacadoEnDados() {
		// Tiene que devolver la suma de los dos numeros de dado que sacó en su turno
		return 0;
	}

	public int cantidadDePropiedadesASuNombre() {
		// Tanto los terrenos como las casas como los hoteles suman como propiedad. 
		return 0;
	}
	
	public void reducirEfectivo(int efectivoAReducir) {
		this.efectivoDisponible-=efectivoAReducir;
	}
	
	public void aumentarEfectivo(int efectivoAAumentar) {
		this.efectivoDisponible+=efectivoAAumentar;
	}

	public void agregarPropiedad(Propiedad propiedadComprada) {
		this.listaDePropiedades.add(propiedadComprada);
	}
	
	public boolean contienePropiedad(Propiedad propiedadABuscar) {
		int esta=this.listaDePropiedades.indexOf(propiedadABuscar);
		if(esta!=-1) {return true;}
		return false;
	}
	
	public void cobrarPremioDelQuini() {
		int premioACobrar=this.premioQuiniAGanar.obtenerPremio();
		this.aumentarEfectivo(premioACobrar);
		this.premioQuiniAGanar.avanzar();
	}
}
