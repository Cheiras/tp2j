package testIntegracionSegundaEntrega;

import org.junit.Test;

import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.CordobaNorte;
import caible.propiedades.barrios.CordobaSur;
import junit.framework.Assert;
import partida.jugador.Jugador;

public class MismosCasosDeBsAsParaCordobaTest {

	@Test
	public void JugadorCuentaConCordobaSurYNorteConDosCasasEnAmbasUnContrincanteQueCaeEnCualquieraDeEllasVeSuEfectivoReducidoEn3500() {
		Jugador pedro = new Jugador("Pedro", 100000, null);
		Jugador juan = new Jugador("Juan", 100000, null);
		Jugador carlos = new Jugador("Carlos", 100000, null);
		BarrioNormal cordobaSur = new CordobaSur();
		BarrioNormal cordobaNorte = new CordobaNorte();

		cordobaSur.comprar(carlos);
		cordobaNorte.comprar(carlos);

		carlos.construirEn(cordobaNorte);
		carlos.construirEn(cordobaSur);
		carlos.construirEn(cordobaNorte);
		carlos.construirEn(cordobaSur);

		cordobaSur.accionar(pedro);
		cordobaNorte.accionar(juan);

		Assert.assertEquals(97500, pedro.getEfectivo());
		Assert.assertEquals(97100, juan.getEfectivo());
	}

	@Test
	public void JugadorCuentaConCordobaSurYNorteAlCaerUnContrincanteEnCualquieraDeLasDosSuEfectivoSeReduceEn3000() {
		Jugador pedro = new Jugador("Pedro", 100000, null);
		Jugador juan = new Jugador("Juan", 100000, null);
		Jugador carlos = new Jugador("Carlos", 100000, null);
		BarrioNormal cordobaSur = new CordobaSur();
		BarrioNormal cordobaNorte = new CordobaNorte();

		cordobaSur.comprar(carlos);
		cordobaNorte.comprar(carlos);

		carlos.construirEn(cordobaNorte);
		carlos.construirEn(cordobaSur);

		cordobaSur.accionar(pedro);
		cordobaNorte.accionar(juan);
		Assert.assertEquals(98500, pedro.getEfectivo());
		Assert.assertEquals(98200, juan.getEfectivo());
	}

	@Test
	public void JugadorPoseeCordobaSurYNorteConLaMaximaCantidadDeCasasYConstruyeUnHotelSuEfectivoSeReduceEn8000() {
		Jugador carlos = new Jugador("Carlos", 100000, null);
		BarrioNormal cordobaSur = new CordobaSur();
		BarrioNormal cordobaNorte = new CordobaNorte();

		cordobaSur.comprar(carlos);
		cordobaNorte.comprar(carlos);

		carlos.construirEn(cordobaNorte);
		carlos.construirEn(cordobaSur);
		carlos.construirEn(cordobaNorte);
		carlos.construirEn(cordobaSur);
		int dineroDeCarlosTrasConstruir = carlos.getEfectivo();
		carlos.construirEn(cordobaSur);

		Assert.assertEquals(dineroDeCarlosTrasConstruir - 3000, carlos.getEfectivo());
	}

	@Test
	public void JugadorTieneCordobaSurYNorteYConstruyeUnHotelSiUnJugadorContrarioCaeEnLaCasillaSuEfectivoSeReduceEn5000Test() {
		Jugador carlos = new Jugador("Carlos", 100000, null);
		Jugador pedro = new Jugador("Pedro", 100000, null);
		BarrioNormal cordobaSur = new CordobaSur();
		BarrioNormal cordobaNorte = new CordobaNorte();

		cordobaSur.comprar(carlos);
		cordobaNorte.comprar(carlos);

		carlos.construirEn(cordobaNorte);
		carlos.construirEn(cordobaSur);
		carlos.construirEn(cordobaNorte);
		carlos.construirEn(cordobaSur);
		carlos.construirEn(cordobaSur);

		cordobaSur.accionar(pedro);

		Assert.assertEquals(97000, pedro.getEfectivo());
	}
}
