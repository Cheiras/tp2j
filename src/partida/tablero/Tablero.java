package partida.tablero;

import java.util.ArrayList;

import caible.especiales.AvanceDinamico;
import caible.especiales.Carcel;
import caible.especiales.ImpuestoDeLujo;
import caible.especiales.Policia;
import caible.especiales.Quini6;
import caible.especiales.RetrocesoDinamico;
import caible.especiales.Salida;
import caible.propiedades.barrios.BarrioNormal;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import caible.propiedades.barrios.CordobaSur;
import caible.propiedades.barrios.Neuquen;
import caible.propiedades.barrios.SaltaNorte;
import caible.propiedades.barrios.SaltaSur;
import caible.propiedades.barrios.SantaFe;
import caible.propiedades.barrios.Tucuman;
import caible.propiedades.compania.Aysa;
import caible.propiedades.compania.Edesur;
import caible.propiedades.compania.Subte;
import caible.propiedades.compania.Trenes;
import casilleros.Caible;
import partida.NoJugador;

public class Tablero {

	NoJugador noJugador = new NoJugador(0, null);

	Caible salida = new Salida();

	Caible quini6 = new Quini6();

	Caible buenosAiresSur = new BuenosAiresSur("Buenos Aires Sur", 20000, noJugador, 2, 2000, 3000, 3500, 5000, 5000,
			8000);

	Caible edesur = new Edesur();

	Caible buenosAiresNorte = new BuenosAiresNorte("Buenos Aires Norte", 25000, noJugador, 4, 2500, 3500, 4000, 6000,
			5500, 9000);

	Caible carcel = new Carcel();

	Caible cordobaSur = new CordobaSur("Cordoba Sur", 18000, noJugador, 6, 1000, 1500, 2500, 3000, 2000, 3000);

	Caible avanzeDinamico = new AvanceDinamico();

	Caible subte = new Subte();

	Caible cordobaNorte = new BarrioNormal("Cordoba Norte", 20000, noJugador, 9, 1300, 1800, 2900, 3500, 2200, 3500);

	Caible impuestoDeLujo = new ImpuestoDeLujo();

	Caible santaFe = new SantaFe("Santa Fe", 15000, noJugador, 11, 1500, 3500, 4000);

	Caible aysa = new Aysa("Aysa", 30000, noJugador, 12, 300, 500);

	Caible saltaNorte = new SaltaNorte("Salta Norte", 23000, noJugador, 13, 2000, 3250, 3850, 5500, 4500, 7500);

	Caible saltaSur = new SaltaSur("Salta Sur", 23000, noJugador, 14, 2000, 3250, 3850, 5500, 4500, 7500);

	Caible policia = new Policia(carcel);

	Caible trenes = new Trenes("Trenes", 3800, noJugador, 16, 450, 800);

	Caible neuquen = new Neuquen("Neuquen", 17000, noJugador, 17, 1800, 3800, 4800);

	Caible retrocesoDinamico = new RetrocesoDinamico();

	Caible tucuman = new Tucuman("Tucuman", 25000, noJugador, 19, 2500, 4500, 7000);

	ArrayList<Caible> tablero = new ArrayList<Caible>();
	
	public Tablero(){
		tablero.add(salida);
		tablero.add(quini6);
		tablero.add(buenosAiresSur);
		tablero.add(edesur);
		tablero.add(buenosAiresNorte);
		tablero.add(carcel);
		tablero.add(cordobaSur);
		tablero.add(avanzeDinamico);
		tablero.add(subte);
		tablero.add(cordobaNorte);
		tablero.add(impuestoDeLujo);
		tablero.add(santaFe);
		tablero.add(aysa);
		tablero.add(saltaNorte);
		tablero.add(saltaSur);
		tablero.add(policia);
		tablero.add(trenes);
		tablero.add(neuquen);
		tablero.add(retrocesoDinamico);
		tablero.add(tucuman);
	}
	
	public Caible getCaible(int posicion){
		return tablero.get(posicion);
	}
}
