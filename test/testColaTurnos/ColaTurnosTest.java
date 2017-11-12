package testColaTurnos;
import sistemaTurnos.ColaTurnos;
import sistemaTurnos.Turno;
import org.junit.Test;
import org.junit.Assert;

public class ColaTurnosTest {
	@Test
	public void colaRecienCreadaTieneCeroElementos() {
		ColaTurnos cola=new ColaTurnos();
		
		Assert.assertEquals(0,cola.obtenerCantidad(),0.1);
	}
	
	@Test
	public void colaRecienCreadaEstaVacia() {
		ColaTurnos cola=new ColaTurnos();
		
		Assert.assertTrue(cola.estaVacia());
	}
	
	
}
