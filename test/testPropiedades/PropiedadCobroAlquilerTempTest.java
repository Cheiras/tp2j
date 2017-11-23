package testPropiedades;
import org.junit.Test;
import caible.propiedades.barrios.Barrio;
import caible.propiedades.barrios.BarrioNormal;
import partida.jugador.Jugador;
public class PropiedadCobroAlquilerTempTest {

	@Test
	public void test() {
		Jugador unJugador = new Jugador("TESTER", 100000, null);
		Jugador oponente=new Jugador("OPONENTE",100000,null);
		Barrio BuenosAiresSur = new BarrioNormal("Buenos Aires Sur", 20000, 2, 2000, 3000, 3500, 5000, 5000,
				8000);

		BuenosAiresSur.accionar(unJugador);
		BuenosAiresSur.accionar(oponente);
		System.out.print(unJugador.getEfectivo());
	}
}
