package vista;



import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import movimiento.Dado;
import movimiento.Tirador;
import partida.Partida;
import vista.eventos.BotonComprarCasilleroActualEventHandler;
import vista.eventos.BotonConstruirHandler;
import vista.eventos.BotonEntrarEventHandler;
//import vista.eventos.BotonTerminarTurnoEventHandler;
import vista.eventos.BotonTirarDadosEventHandler;

public class ContenedorPrincipal extends BorderPane {

    private BarraDeMenu menuBar;
    private Canvas canvasCentral;
    private VBox contenedorCentral;
    private Partida partida;
    private VBox panelDerecha;
	private VistaJugadores vistaJugadores;

    public ContenedorPrincipal(Stage stage) {
    	
    	this.partida = new Partida();   	
        this.setMenu(stage);
        this.setCentro();
        this.setConsola();
        this.setBotonera(stage);
        this.setPanelDerecha();
    }

    public void setPanelDerecha() {
		panelDerecha= new VBox();
		Text text = new Text("Turno: "+ (partida.getTurno()));
		panelDerecha.getChildren().add(text);
		panelDerecha.setAlignment(Pos.TOP_RIGHT);
		panelDerecha.setPadding(new Insets(95));
		this.setRight(panelDerecha);
		
		
	}

	private void setBotonera(Stage stage) {

        Button botonTirar = new Button();
        botonTirar.setText("Tirar Dados");
        BotonTirarDadosEventHandler throwButtonHandler = new BotonTirarDadosEventHandler(stage, this.partida);
        botonTirar.setOnAction(throwButtonHandler);
        
        Button botonConstruir = new Button();
        botonConstruir.setText("Construir");
        BotonConstruirHandler construirButtonHandler = new BotonConstruirHandler(stage, partida);
        botonConstruir.setOnAction(construirButtonHandler);
        
        Button botonComprar = new Button();
        botonComprar.setText("Comprar casillero actual");
        BotonComprarCasilleroActualEventHandler comprarButtonHandler = new BotonComprarCasilleroActualEventHandler(stage, partida);
        botonConstruir.setOnAction(comprarButtonHandler);
        
        Button botonTerminarTurno = new Button();
        botonTerminarTurno.setText("Terminar turno");
        //BotonTerminarTurnoEventHandler terminarButtonHandler = new BotonTerminarTurnoEventHandler(stage, partida,this);
       // botonTerminarTurno.setOnAction(terminarButtonHandler);
        
        VBox contenedorVertical = new VBox(botonTirar, botonConstruir, botonComprar,botonTerminarTurno);
        contenedorVertical.setSpacing(20);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);

    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }

    private void setCentro() {

        canvasCentral = new Canvas(460, 220);
        this.vistaJugadores = new VistaJugadores(this.partida, this.canvasCentral);
        contenedorCentral = new VBox(canvasCentral);
        contenedorCentral.setAlignment(Pos.CENTER);
        contenedorCentral.setSpacing(20);
        contenedorCentral.setPadding(new Insets(95));
        contenedorCentral.setMaxWidth(800);
        contenedorCentral.setMinHeight(450);
        Image imagen = new Image("file:src/vista/imagenes/tablero.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        contenedorCentral.setBackground(new Background(imagenDeFondo));

        this.setCenter(contenedorCentral);
    }

    
    private void setConsola() {

        // TODO cambiar por el modelo de Consola...
        Label etiqueta = new Label();
        etiqueta.setText("consola...");
        etiqueta.setFont(Font.font("courier new", FontWeight.SEMI_BOLD, 14));
        etiqueta.setTextFill(Color.WHITE);

        VBox contenedorConsola = new VBox(etiqueta);
        contenedorConsola.setSpacing(10);
        contenedorConsola.setPadding(new Insets(20));
        contenedorConsola.setStyle("-fx-background-color: black;");

        this.setBottom(contenedorConsola);
    }

    public BarraDeMenu getBarraDeMenu() {
        return menuBar;
    }
    
    public void update() {
    	this.vistaJugadores.update();
    }

}
