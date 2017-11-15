package testPropiedadesEspeciales;
import org.junit.Assert;
import org.junit.Test;

import caible.especiales.Quini6;
import partida.Jugador;
public class Quni6Test {

		@Test
		public void unJugadorCaeUnaVezEnElQuini6YAumentaSuEfectivoEnCincuentaMil() {
			Quini6 quini=new Quini6();
			Jugador unJugador=new Jugador(100000, null);
			
			quini.jugadorCayo(unJugador);
			
			Assert.assertEquals(150000,unJugador.getEfectivo(),0.1);
		}
		
		@Test
		public void unJuadorQueCaeDosVecesEnElQuini6AumentaSuEfectivoEnTreintaMil() {
			Quini6 quini=new Quini6();
			Jugador unJugador=new Jugador(100000, null);
			
			quini.jugadorCayo(unJugador);
			quini.jugadorCayo(unJugador);
			
			Assert.assertEquals(180000,unJugador.getEfectivo(),0.1);	
		}
		
		@Test
		public void unJugadorQueCaeMasDeDosVecesEnElQuini6YaNoAumentaSuEfectivoPorqueNadieTieneTantaSuerteLOL() {
			Quini6 quini=new Quini6();
			Jugador unJugador=new Jugador(100000, null);
			
			quini.jugadorCayo(unJugador);
			quini.jugadorCayo(unJugador);
			quini.jugadorCayo(unJugador);
			quini.jugadorCayo(unJugador);
			quini.jugadorCayo(unJugador);
			
			Assert.assertEquals(180000,unJugador.getEfectivo(),0.1);
		}
}
