package testIntegracionSegundaEntrega;

import org.junit.Test;

import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.SaltaNorte;
import caible.propiedades.barrios.SaltaSur;
import junit.framework.Assert;
import partida.jugador.Jugador;

public class MismosCasosDeBsAsParaSalta {

	@Test
	public void JugadorCuentaConSaltaSurYNorteConDosCasasEnAmbasUnContrincanteQueCaeEnCualquieraDeEllasVeSuEfectivoReducidoEn3500() {
		Jugador pedro = new Jugador("Pedro", 100000, null);
		Jugador juan = new Jugador("Juan", 100000, null);
		Jugador carlos = new Jugador("Carlos", 100000, null);
		BarrioNormal SaltaSur = new SaltaSur();
		BarrioNormal SaltaNorte = new SaltaNorte();

		SaltaSur.accionar(carlos);
		SaltaNorte.accionar(carlos);

		carlos.construirEn(SaltaNorte);
		carlos.construirEn(SaltaSur);
		carlos.construirEn(SaltaNorte);
		carlos.construirEn(SaltaSur);

		SaltaSur.accionar(pedro);
		SaltaNorte.accionar(juan);

		Assert.assertEquals(96150, pedro.getEfectivo());
		Assert.assertEquals(96150, juan.getEfectivo());
	}

	@Test
	public void JugadorCuentaConSaltaSurYNorteAlCaerUnContrincanteEnCualquieraDeLasDosSuEfectivoSeReduceEn3000() {
		Jugador pedro = new Jugador("Pedro", 100000, null);
		Jugador juan = new Jugador("Juan", 100000, null);
		Jugador carlos = new Jugador("Carlos", 100000, null);
		BarrioNormal SaltaSur = new SaltaSur();
		BarrioNormal SaltaNorte = new SaltaNorte();

		SaltaSur.accionar(carlos);
		SaltaNorte.accionar(carlos);

		carlos.construirEn(SaltaNorte);
		carlos.construirEn(SaltaSur);

		SaltaSur.accionar(pedro);
		SaltaNorte.accionar(juan);
		Assert.assertEquals(96750, pedro.getEfectivo());
		Assert.assertEquals(96750, juan.getEfectivo());
	}

	@Test
	public void JugadorPoseeSaltaSurYNorteConLaMaximaCantidadDeCasasYConstruyeUnHotelSuEfectivoSeReduceEn8000() {
		Jugador carlos = new Jugador("Carlos", 100000, null);
		BarrioNormal SaltaSur = new SaltaSur();
		BarrioNormal SaltaNorte = new SaltaNorte();

		SaltaSur.accionar(carlos);
		SaltaNorte.accionar(carlos);

		carlos.construirEn(SaltaNorte);
		carlos.construirEn(SaltaSur);
		carlos.construirEn(SaltaNorte);
		carlos.construirEn(SaltaSur);
		int dineroDeCarlosTrasConstruir = carlos.getEfectivo();
		carlos.construirEn(SaltaSur);

		Assert.assertEquals(dineroDeCarlosTrasConstruir - 7500, carlos.getEfectivo());
	}

	@Test
	public void JugadorTieneSaltaSurYNorteYConstruyeUnHotelSiUnJugadorContrarioCaeEnLaCasillaSuEfectivoSeReduceEn5000Test() {
		Jugador carlos = new Jugador("Carlos", 100000, null);
		Jugador pedro = new Jugador("Pedro", 100000, null);
		BarrioNormal SaltaSur = new SaltaSur();
		BarrioNormal SaltaNorte = new SaltaNorte();

		SaltaSur.accionar(carlos);
		SaltaNorte.accionar(carlos);

		carlos.construirEn(SaltaNorte);
		carlos.construirEn(SaltaSur);
		carlos.construirEn(SaltaNorte);
		carlos.construirEn(SaltaSur);
		carlos.construirEn(SaltaSur);

		SaltaSur.accionar(pedro);

		Assert.assertEquals(94500, pedro.getEfectivo());
	}

}
