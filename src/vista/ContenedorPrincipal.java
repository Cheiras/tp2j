package vista;

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
import javafx.stage.Stage;
import partida.Partida;
import vista.eventos.BotonComprarCasilleroActualEventHandler;
import vista.eventos.BotonConstruirHandler;
import vista.eventos.BotonTerminarTurnoEventHandler;
import vista.eventos.BotonTirarDadosEventHandler;
import vista.eventos.BotonOpcionVenderPropiedadEventHandler;
import vista.eventos.BotonVenderEventHandler;

public class ContenedorPrincipal extends BorderPane {

    private BarraDeMenu menuBar;
    private Canvas canvasCentral;
    private VBox contenedorCentral;
    private Partida partida;
    private VBox panelDerecha;
	private VistaJugadores vistaJugadores;
	private Stage stage;
	private VBox consola;

    public ContenedorPrincipal(Stage stage) {
    	
    	this.partida = new Partida();   	
        this.setMenu(stage);
        this.setCentro();
        this.setConsola();
        this.setBotonera(stage);
        this.setPanelDerecha();
        this.stage = stage;
    }



	public void setPanelDerecha() {
		panelDerecha = new VBox();
		
		Text turno = new Text("Turno: " + (partida.getTurno()));
		panelDerecha.getChildren().add(turno);
		
		Text jugador = new Text("Jugador: " + (partida.getNumeroJugadorActual()));
		panelDerecha.getChildren().add(jugador);

		Text efectivo = new Text("Efectivo: " + (partida.jugadorActual().getEfectivo()));
		panelDerecha.getChildren().add(efectivo);

		Text ubicacion = new Text("Estas parado en: " + (partida.getCaibleActual().getNombre()));
		panelDerecha.getChildren().add(ubicacion);
		
		
		
		panelDerecha.setAlignment(Pos.TOP_RIGHT);
		panelDerecha.setPadding(new Insets(95));
		this.setRight(panelDerecha);

	}

	public void update() {
		this.vistaJugadores.update();
    	this.setMenu(this.stage);
		this.setCentro();
		this.setConsola();
		this.setBotonera(this.stage);
		this.setPanelDerecha();
	}
	
	private void setBotonera(Stage stage) {

		Button botonTirar = new Button();
		botonTirar.setText("Tirar Dados");
		BotonTirarDadosEventHandler throwButtonHandler = new BotonTirarDadosEventHandler(stage, partida, this);
		botonTirar.setOnAction(throwButtonHandler);

		Button botonConstruir = new Button();
		botonConstruir.setText("Construir");
		BotonConstruirHandler construirButtonHandler = new BotonConstruirHandler(stage, partida, this);
		botonConstruir.setOnAction(construirButtonHandler);

		Button botonComprar = new Button();
		botonComprar.setText("Comprar casillero actual");
		BotonComprarCasilleroActualEventHandler comprarButtonHandler = new BotonComprarCasilleroActualEventHandler(
				stage, partida, this);
		botonComprar.setOnAction(comprarButtonHandler);
		
		Button botonVender=new Button();
		botonVender.setText("Vender");
		BotonVenderEventHandler botonVenderHandler=new BotonVenderEventHandler(stage,partida,this);
		botonVender.setOnAction(botonVenderHandler);
		

		Button botonTerminarTurno = new Button();
		botonTerminarTurno.setText("Terminar turno");
		BotonTerminarTurnoEventHandler terminarButtonHandler = new BotonTerminarTurnoEventHandler(stage, partida, this);
		botonTerminarTurno.setOnAction(terminarButtonHandler);

		
		
		VBox contenedorVertical = new VBox(botonTirar, botonConstruir, botonComprar, botonTerminarTurno, botonVender);
		contenedorVertical.setSpacing(20);
		contenedorVertical.setPadding(new Insets(15));

		this.setLeft(contenedorVertical);

	}

	private void setMenu(Stage stage) {
		this.menuBar = new BarraDeMenu(stage);
		this.setTop(menuBar);
	}

	private void setCentro() {

		canvasCentral = new Canvas(770,700);
		this.vistaJugadores = new VistaJugadores(this.partida, this.canvasCentral);
		contenedorCentral = new VBox(canvasCentral);
		contenedorCentral.setAlignment(Pos.CENTER);
		contenedorCentral.setSpacing(20);
		contenedorCentral.setPadding(new Insets(10));
		contenedorCentral.setMaxWidth(800);
		contenedorCentral.setMinHeight(450);
		Image imagen = new Image("file:src/vista/imagenes/tablero.jpg");
		BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
		contenedorCentral.setBackground(new Background(imagenDeFondo));

		this.setCenter(contenedorCentral);
	}

	private void setConsola() {

		Label etiqueta = new Label();
		etiqueta.setText("consola...");
		etiqueta.setFont(Font.font("courier new", FontWeight.SEMI_BOLD, 14));
		etiqueta.setTextFill(Color.WHITE);

		VBox contenedorConsola = new VBox(etiqueta);
		contenedorConsola.setSpacing(10);
		contenedorConsola.setPadding(new Insets(20));
		contenedorConsola.setStyle("-fx-background-color: black;");

		this.setBottom(contenedorConsola);
		this.consola=contenedorConsola;
	}

	public BarraDeMenu getBarraDeMenu() {
		return menuBar;
	}


}
