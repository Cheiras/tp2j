package vista;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import vista.eventos.BotonCerrarVentanaEventHandler;
import javafx.scene.layout.VBox;

public class VentanaDeAlerta extends Stage {
	String titulo;
	String mensajeDeAlerta;
	
	public VentanaDeAlerta(String titulo,String mensajeDeAlerta) {
		this.titulo=titulo;
		this.mensajeDeAlerta=mensajeDeAlerta;
	}
	
	public void display () {
		Stage ventana=new Stage();
		ventana.initModality(Modality.APPLICATION_MODAL);
		ventana.setTitle(this.titulo);
		ventana.setMinWidth(500);
		
		Label mensajeMostrado=new Label();
		mensajeMostrado.setText(this.mensajeDeAlerta);
		Button botonCierreDeVentana= new Button();
		botonCierreDeVentana.setText("Aceptar");
		BotonCerrarVentanaEventHandler botonCerrarHandler=new BotonCerrarVentanaEventHandler(ventana);
		botonCierreDeVentana.setOnAction(botonCerrarHandler);
		
		VBox vbox=new VBox(10);
		vbox.getChildren().addAll(mensajeMostrado,botonCierreDeVentana);
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene=new Scene(vbox);
		ventana.setScene(scene);
		ventana.showAndWait();
	}
}
