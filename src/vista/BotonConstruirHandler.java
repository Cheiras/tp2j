package vista;

import caible.propiedades.barrios.Barrio;
import casilleros.Caible;
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
    	//CHEQUEAR QUE NO ESTE CONSTRUYENDO ALGUIEN QUE NO ES DUEÑO
       	try {
    		((Barrio) barrioActual).construir();
    		
    	} catch(RuntimeException e){
    		
    		throw new RuntimeException("El Caible Actual no es contruible");    		
    	}

    }
}
