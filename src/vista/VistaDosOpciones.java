package vista;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import partida.Partida;

public class VistaDosOpciones {

	String mensajeAMostrar;
	Partida partida;
	Stage stage;
	ContenedorPrincipal contenedor;
	Button opcionUno;
	Button opcionDos;
	
	public VistaDosOpciones(Stage unStage,ContenedorPrincipal contenedor,Partida unaPartida,String mensaje,Button opcion1,Button opcion2) {
		this.mensajeAMostrar=mensaje;
		this.stage=unStage;
		this.contenedor=contenedor;
		this.partida=unaPartida;
		this.opcionUno=opcion1;
		this.opcionDos=opcion2;
		
	}
	
	public void display() {
		Stage ventana=new Stage();
		ventana.initModality(Modality.NONE);
		ventana.setMinWidth(100);
		VBox layout=new VBox(10);
		Label label=new Label();
		label.setText(this.mensajeAMostrar);
		layout.getChildren().addAll(label,this.opcionUno,this.opcionDos);
		layout.setAlignment(Pos.CENTER);
		Scene scene=new Scene(layout);
		ventana.setScene(scene);

		ventana.showAndWait();
		
	}
	

	
	
	
}
