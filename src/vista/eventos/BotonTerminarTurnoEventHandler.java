package vista.eventos;

import excepciones.PartidaFinalizadaException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;
import vista.VentanaDeAlerta;

public class BotonTerminarTurnoEventHandler implements EventHandler<ActionEvent> {

    Stage stage;
    Partida partida;
    ContenedorPrincipal contenedor;
    
    public BotonTerminarTurnoEventHandler(Stage stage, Partida partida, ContenedorPrincipal contenedorPrincipal) { 
        this.stage = stage;
        this.partida = partida;
        this.contenedor = contenedorPrincipal;
               
    }

    @Override
    public void handle(ActionEvent actionEvent) {
    	try {
        	partida.terminarTurno();
    	}catch(PartidaFinalizadaException e) {
    		VentanaDeAlerta ventana = new VentanaDeAlerta("El juego ha terminado","El juego terminó, gano el jugador " + this.partida.jugadorActual().getNombre());
    		ventana.display();
    	}
        	contenedor.update();

    }
}
