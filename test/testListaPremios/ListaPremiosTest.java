package testListaPremios;
import org.junit.Assert;
import org.junit.Test;
import listaDePremios.ListaDePremios;
public class ListaPremiosTest {
	@Test
	
	public void primerValorDeUnaListaDePremiosEs50000() {
		ListaDePremios lista=new ListaDePremios();
		lista.agregarNodoConPremio(50000);
		lista.agregarNodoConPremio(0);
		
		Assert.assertEquals(50000,lista.obtenerPrimerPremio(),0.1);
	}
	
}
