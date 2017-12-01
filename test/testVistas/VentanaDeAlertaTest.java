package testVistas;
import javafx.application.Application;
import javafx.stage.Stage;
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
