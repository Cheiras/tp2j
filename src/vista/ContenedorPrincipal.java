package vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import partida.Partida;
import vista.eventos.BotonComprarCasilleroActualEventHandler;
import vista.eventos.BotonConstruirHandler;
import vista.eventos.BotonDescontarButtonHandler;
import vista.eventos.BotonPagarFianzaEventHandler;
import vista.eventos.BotonTerminarTurnoEventHandler;
import vista.eventos.BotonTirarDadosEventHandler;
import vista.eventos.BotonVenderEventHandler;

public class ContenedorPrincipal extends BorderPane {

	private BarraDeMenu menuBar;
	private Canvas canvasCentral;
	private VBox contenedorCentral;
	private Partida partida;
	private VBox panelDerecha;
	private VistaJugadores vistaJugadores;
	private Stage stage;

	public ContenedorPrincipal(Stage stage) {

		this.partida = new Partida();
		this.setMenu(stage);
		this.setCentro();
		this.setBotonera(stage);
		this.setPanelDerecha();
		this.stage = stage;
	}

	public void setPanelDerecha() {
		panelDerecha = new VBox();

		Text turno = new Text("Turno: " + (partida.getTurno()));

		Text jugador = new Text("Jugador: " + (partida.jugadorActual().getNombre()));

		Text efectivo = new Text("Efectivo: " + (partida.jugadorActual().getEfectivo()));

		Text ubicacion = new Text("Estas parado en: " + (partida.getCaibleActual().getNombre()));

		Text valorDado1 = new Text("Numero obtenido en el primer Dado: " + (partida.getTirador().getValorDado1()));

		Text valorDado2 = new Text("Numero obtenido en el segundo Dado: " + (partida.getTirador().getValorDado2()));

		panelDerecha.getChildren().addAll(turno, jugador, efectivo, ubicacion, valorDado1, valorDado2);

		panelDerecha.setAlignment(Pos.TOP_RIGHT);
		panelDerecha.setPadding(new Insets(95));
		this.setRight(panelDerecha);

	}

	public void update() {
		this.vistaJugadores.update();
		this.setMenu(this.stage);
		this.setCentro();
		this.setBotonera(this.stage);
		this.setPanelDerecha();
	}

	private void setBotonera(Stage stage) {

		Button botonPagarFianza = new Button();
		botonPagarFianza.setText("Pagar Fianza");
		BotonPagarFianzaEventHandler fianzaButtonHandler = new BotonPagarFianzaEventHandler(this.partida, stage, this);
		//if (this.partida.jugadorActual().estadoDeHabilitacion()) {
			botonPagarFianza.setOnAction(fianzaButtonHandler);
		//}

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

		Button botonVender = new Button();
		botonVender.setText("Vender");
		BotonVenderEventHandler botonVenderHandler = new BotonVenderEventHandler(stage, partida, this);
		botonVender.setOnAction(botonVenderHandler);

		Button botonTerminarTurno = new Button();
		botonTerminarTurno.setText("Terminar turno");
		BotonTerminarTurnoEventHandler terminarButtonHandler = new BotonTerminarTurnoEventHandler(stage, partida, this);
		botonTerminarTurno.setOnAction(terminarButtonHandler);

		Button botonDescontarEfectivo = new Button();
		botonDescontarEfectivo.setText("Descontar efectivo");
		BotonDescontarButtonHandler descontarButtonHandler = new BotonDescontarButtonHandler(partida, stage, this);
		botonDescontarEfectivo.setOnAction(descontarButtonHandler);

		VBox contenedorVertical = new VBox(botonTirar, botonConstruir, botonComprar, botonTerminarTurno, botonVender,
				botonPagarFianza, botonDescontarEfectivo);

		contenedorVertical.setSpacing(20);
		contenedorVertical.setPadding(new Insets(15));

		this.setLeft(contenedorVertical);

	}

	private void setMenu(Stage stage) {
		this.menuBar = new BarraDeMenu(stage);
		this.setTop(menuBar);
	}

	private void setCentro() {

		canvasCentral = new Canvas(770, 700);
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

	public BarraDeMenu getBarraDeMenu() {
		return menuBar;
	}

	public void eliminarJugadorActual() {
		this.vistaJugadores.eliminarJugadorActual();

	}

}
