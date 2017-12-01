package testEstadoConstruccion;
import org.junit.Assert;
import org.junit.Test;

import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.BuenosAiresSur;
import estadoConstruccion.EstadoConstruccionUnaCasa;
import estadoConstruccion.EstadoSinConstruccion;

public class EstadoConstruccionTest {
	BarrioNormal BairesSur=new BuenosAiresSur();
	EstadoSinConstruccion estado=new EstadoSinConstruccion(BairesSur,2000,4000);
	EstadoConstruccionUnaCasa estadoConCasa=new EstadoConstruccionUnaCasa(BairesSur,3000,4000);
	
	@Test
	public void unEstadoSinConstruccionDevuelveElAlquilerSinNingunaConstruccionDeLaPropiedad() {
		
		Assert.assertEquals(2000,BairesSur.getPrecioRentaActual(),0.1);
		//*Assert.assertEquals(2000,estado.getCostoRenta());*///
	}
	@Test
	public void unEstadoConUnaCasaDevuelveElAlquilerDeLaPropiedadConUnaCasa() {
		
		Assert.assertEquals(3000, estadoConCasa.getCostoRenta());
	}
	@Test
	public void unEstadoConDosCasasDevuelveElAlquilerDeLaPropiedadConDosCasasConstruidas() {
		
	}
}
