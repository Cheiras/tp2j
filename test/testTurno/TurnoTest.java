package testTurno;
import org.junit.Assert;
import org.junit.Test;
import sistemaTurnos.Turno;
import partida.Jugador;
public class TurnoTest {
	
	@Test
	public void el_turno_devuelve_el_jugador_actual() {
		Jugador unJugador=new Jugador();
		boolean saco_dobles=false;
		Turno unTurno=new Turno(unJugador,saco_dobles);
		
		Assert.assertEquals(unJugador,unTurno.obtener_jugador_actual());
	}
}
