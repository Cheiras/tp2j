package testPropiedades;
import caible.propiedades.barrios.CordobaNorte;
import junit.framework.Assert;
import partida.jugador.Jugador;
import org.junit.Test;
public class CalculoDeGananciaPorVentaTest {

	CordobaNorte cordoba=new CordobaNorte();
	Jugador kevin=new Jugador("Kevin",100000,null);
	
	@Test
	public void test() {
		int precioVenta=cordoba.calcularPrecioVenta();
		
		int precioCompra=cordoba.getPrecioDeCompra();
		String string = String.format("PrecioCompra %2d",precioCompra);
		System.out.println(string);
		int numeroConstrucciones=cordoba.getNumeroConstrucciones();
		String numeroC=String.format("NumeroConstrucciones %2d",numeroConstrucciones);
		System.out.println(numeroC);
		int resultado=20000*(85/100);
		System.out.println(resultado);
		
		Assert.assertEquals(17000,precioVenta );
	}
}
