package vista;

import caible.propiedades.barrios.Barrio;
import casilleros.Caible;
import excepciones.CaibleNoConstruibleException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;

public class BotonConstruirHandler implements EventHandler<ActionEvent> {
	

    Stage stage;//no se usa?
    Partida partida;
    
    public BotonConstruirHandler(Stage stage, Partida partida) { 
        this.stage = stage;
        this.partida = partida;
               
    }

    @Override
    public void handle(ActionEvent actionEvent) {
    	Caible barrioActual = partida.getCaibleActual();
    	partida.construirEn((Barrio) barrioActual);;

    }
}
