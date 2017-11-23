package testIntegracionSegundaEntrega;
import org.junit.Test;
import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import junit.framework.Assert;
import partida.jugador.Jugador;

public class JugadorCuentaConBsAsSurYNorteConDosCasasEnAmbasUnContrincanteQueCaeEnCualquieraDeEllasVeSuEfectivoReducidoEn3500Test {

	@Test
	public void test() {
		Jugador pedro=new Jugador("Pedro",100000,null);
		Jugador juan=new Jugador("Juan",100000,null);
		Jugador carlos = new Jugador("Carlos", 100000, null);
		BarrioNormal bairesSur = new BuenosAiresSur("Buenos Aires Sur", 0, 2, 2000, 3000, 3500, 5000, 5000, 8000);
		BarrioNormal bairesNorte = new BuenosAiresNorte("Buenos Aires Norte", 0, 2, 2000, 3000, 3500, 5000, 5000, 8000);
		
		bairesSur.accionar(carlos);
		bairesNorte.accionar(carlos);
		
		carlos.construirEn(bairesNorte);
		carlos.construirEn(bairesSur);
		carlos.construirEn(bairesNorte);
		carlos.construirEn(bairesSur);
		
		bairesSur.accionar(pedro);
		bairesNorte.accionar(juan);
		
		
		Assert.assertEquals(96500, pedro.getEfectivo());
		Assert.assertEquals(96500,juan.getEfectivo());
		}
	
}
