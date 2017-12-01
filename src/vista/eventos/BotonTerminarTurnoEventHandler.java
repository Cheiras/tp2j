package vista.eventos;

import excepciones.JugadorEliminadoException;
import excepciones.JugadorEnBancarrotaException;
import excepciones.PartidaFinalizadaException;
import excepciones.TerminarTurnoAntesDeTirarDadosException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;
import vista.VentanaDeAlerta;
import javafx.scene.media.*;

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
        	contenedor.reproducirSonido("terminarTurno.wav");
    	}catch(TerminarTurnoAntesDeTirarDadosException e) {
    		VentanaDeAlerta ventana0 = new VentanaDeAlerta("Error","Tenes que tirar los dados antes de terminar turno");
    		ventana0.display();
    	}catch(PartidaFinalizadaException e) {
    		contenedor.reproducirSonido("finDelJuego.mp3");
    		VentanaDeAlerta ventana = new VentanaDeAlerta("El juego ha terminado","El juego terminó, gano el jugador " + this.partida.jugadorActual().getNombre());
    		ventana.display();
    	}catch(JugadorEnBancarrotaException er) {
    		VentanaDeAlerta ventana2 = new VentanaDeAlerta("Bancarrota","Tus propiedades han sido vendidas");
    		ventana2.display();
    	}catch(JugadorEliminadoException err) {
    		contenedor.reproducirSonido("jugadorEliminado.wav");
    		VentanaDeAlerta ventana3 = new VentanaDeAlerta("Bancarrota","Has sido eliminado");
    		contenedor.eliminarJugadorActual();
    		ventana3.display();
    	}
        contenedor.update();

    }
}
