package testVistas;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import vista.eventos.BotonCerrarVentanaEventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import vista.VentanaDeAlerta;

public class VentanaDeAlertaTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    

    
    @Override
    public void start(final Stage stage) throws Exception{
        VentanaDeAlerta ventana=new VentanaDeAlerta("Titulo ventana","mensaje de alerta");
        ventana.display();
    	
    }
}
