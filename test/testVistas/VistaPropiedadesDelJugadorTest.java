package testVistas;
import partida.jugador.Jugador;
import vista.VistaPropiedadesAVenderJugador;
import caible.propiedades.Propiedad;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import vista.VentanaDeAlerta;
import vista.eventos.BotonCerrarVentanaEventHandler;
import javafx.scene.layout.VBox;
import org.junit.Assert;
import org.junit.Test;
import caible.propiedades.barrios.BuenosAiresNorte;
import caible.propiedades.barrios.BuenosAiresSur;
import javafx.application.Application;
import vista.VistaPropiedadesJugador;
public class VistaPropiedadesDelJugadorTest extends Application {
	
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(final Stage stage) throws Exception{
        Jugador kevin=new Jugador("kevin",100000,null);
        BuenosAiresSur bairesSur=new BuenosAiresSur();
        BuenosAiresNorte bairesNorte=new BuenosAiresNorte();
        
        bairesSur.comprar(kevin);
        bairesNorte.comprar(kevin);
        System.out.print(kevin.getEfectivo());

    	VistaPropiedadesAVenderJugador ventana=new VistaPropiedadesAVenderJugador(kevin);
    	ventana.display();
    	System.out.print(kevin.getEfectivo());
    }
    
	
	
}
