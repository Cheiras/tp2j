package vista;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import partida.Partida;
import vista.ContenedorPrincipal;
import javafx.scene.Scene;

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
