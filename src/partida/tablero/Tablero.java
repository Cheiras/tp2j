package partida.tablero;

import java.util.ArrayList;

import caible.especiales.AvanceDinamico;
import caible.especiales.Carcel;
import caible.especiales.ImpuestoDeLujo;
import caible.especiales.Policia;
import caible.especiales.Quini6;
import caible.especiales.RetrocesoDinamico;
import caible.especiales.Salida;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import caible.propiedades.barrios.CordobaNorte;
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

public class Tablero {


	Caible salida = new Salida();

	Caible quini6 = new Quini6();

	Caible buenosAiresSur = new BuenosAiresSur();

	Caible edesur = new Edesur();

	Caible buenosAiresNorte = new BuenosAiresNorte();

	Caible carcel = new Carcel();

	Caible cordobaSur = new CordobaSur();

	Caible avanzeDinamico = new AvanceDinamico();

	Caible subte = new Subte();

	Caible cordobaNorte = new CordobaNorte();

	Caible impuestoDeLujo = new ImpuestoDeLujo();

	Caible santaFe = new SantaFe();

	Caible aysa = new Aysa();
	
	Caible saltaNorte = new SaltaNorte();

	Caible saltaSur = new SaltaSur();

	Caible policia = new Policia(carcel);

	Caible trenes = new Trenes();

	Caible neuquen = new Neuquen();

	Caible retrocesoDinamico = new RetrocesoDinamico();

	Caible tucuman = new Tucuman();

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
