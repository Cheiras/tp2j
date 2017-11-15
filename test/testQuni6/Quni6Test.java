package testQuni6;
import org.junit.Assert;
import org.junit.Test;
import partida.Jugador;
import quini6.Quini6;
public class Quni6Test {

		@Test
		public void unJugadorCaeUnaVezEnElQuini6YAumentaSuEfectivoEnCincuentaMil() {
			Quini6 quini=new Quini6();
			Jugador unJugador=new Jugador(100000);
			
			quini.jugadorCayo(unJugador);
			
			Assert.assertEquals(150000,unJugador.getEfectivo(),0.1);
		}
		
		@Test
		public void unJuadorQueCaeDosVecesEnElQuini6AumentaSuEfectivoEnTreintaMil() {
			Quini6 quini=new Quini6();
			Jugador unJugador=new Jugador(100000);
			
			quini.jugadorCayo(unJugador);
			quini.jugadorCayo(unJugador);
			
			Assert.assertEquals(180000,unJugador.getEfectivo(),0.1);	
		}
		
		@Test
		public void unJugadorQueCaeMasDeDosVecesEnElQuini6YaNoAumentaSuEfectivoPorqueNadieTieneTantaSuerteLOL() {
			Quini6 quini=new Quini6();
			Jugador unJugador=new Jugador(100000);
			
			quini.jugadorCayo(unJugador);
			quini.jugadorCayo(unJugador);
			quini.jugadorCayo(unJugador);
			quini.jugadorCayo(unJugador);
			quini.jugadorCayo(unJugador);
			
			Assert.assertEquals(180000,unJugador.getEfectivo(),0.1);
		}
}
