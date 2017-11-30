package vista;
import partida.jugador.Jugador;
import caible.propiedades.Propiedad;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import vista.ContenedorPrincipal;

public class VistaPropiedadesJugador {
	Stage ventana=new Stage();
	ArrayList<Button> botonesPropiedad=new ArrayList<Button>();
	ArrayList<Propiedad> propiedadesDelJugador;
	ContenedorPrincipal contenedorPrincipal;
	
	public VistaPropiedadesJugador(Jugador jugadorActual,ContenedorPrincipal contenedor) {
		this.contenedorPrincipal=contenedor;
		propiedadesDelJugador=jugadorActual.getPropiedades();
		int numPropiedades=propiedadesDelJugador.size();
		for(int contador=0;contador<numPropiedades;contador++) {
			String nombrePropiedad=propiedadesDelJugador.get(contador).getNombre();
			Button unBotonPropiedad=new Button(nombrePropiedad);
			unBotonPropiedad.setMaxWidth(175);
			botonesPropiedad.add(unBotonPropiedad);
		}
	}
	
	public void display() {

		ventana.initModality(Modality.NONE);
		ventana.setTitle("Propiedades del jugador");
		ventana.setMinWidth(300);
		ventana.setMinHeight(600);
		VBox layout=new VBox(10);
		layout.getChildren().addAll(botonesPropiedad);
		layout.setAlignment(Pos.CENTER);
		Scene scene=new Scene(layout);
		ventana.setScene(scene);
		ventana.showAndWait();
		
		
	}
}
