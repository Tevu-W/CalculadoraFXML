package dad.javafx.fxml.CalculadoraFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraFXMLController implements Initializable {

	Calculadora calculadora = new Calculadora();

	CalculadoraFXMLModel model = new CalculadoraFXMLModel();

	// view
	@FXML
	private GridPane view;

	@FXML
	private TextField resultadoField;

	@FXML
	private Button Button7;

	@FXML
	private Button Button8;

	@FXML
	private Button Button9;

	@FXML
	private Button Button4;

	@FXML
	private Button Button5;

	@FXML
	private Button Button6;

	@FXML
	private Button Button1;

	@FXML
	private Button Button2;

	@FXML
	private Button Button3;

	@FXML
	private Button Button0;

	@FXML
	private Button ButtonCE;

	@FXML
	private Button ButtonC;

	@FXML
	private Button ButtonProduct;

	@FXML
	private Button ButtonDivide;

	@FXML
	private Button ButtonSubtract;

	@FXML
	private Button ButtonComma;

	@FXML
	private Button ButtonPlus;

	@FXML
	private Button ButtonResult;

	public CalculadoraFXMLController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraFXMLView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		resultadoField.textProperty().bind(model.resultadoProperty());

	}

	public GridPane getView() {
		return view;
	}

	@FXML
	void borrar(ActionEvent event) {
		calculadora.borrar();
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void borrarTodo(ActionEvent event) {
		calculadora.borrarTodo();
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void boton0(ActionEvent event) {
		calculadora.insertar('0');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void boton1(ActionEvent event) {
		calculadora.insertar('1');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void boton2(ActionEvent event) {
		calculadora.insertar('2');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void boton3(ActionEvent event) {
		calculadora.insertar('3');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void boton4(ActionEvent event) {
		calculadora.insertar('4');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void boton5(ActionEvent event) {
		calculadora.insertar('5');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void boton6(ActionEvent event) {
		calculadora.insertar('6');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void boton7(ActionEvent event) {
		calculadora.insertar('7');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void boton8(ActionEvent event) {
		calculadora.insertar('8');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void boton9(ActionEvent event) {
		calculadora.insertar('9');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void coma(ActionEvent event) {
		calculadora.insertarComa();
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void dividir(ActionEvent event) {
		calculadora.operar('/');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void igual(ActionEvent event) {
		calculadora.operar('=');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void multiplicar(ActionEvent event) {
		calculadora.operar('*');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void restar(ActionEvent event) {
		calculadora.operar('-');
		model.setResultado(calculadora.getPantalla());
	}

	@FXML
	void sumar(ActionEvent event) {
		calculadora.operar('+');
		model.setResultado(calculadora.getPantalla());
	}

}
