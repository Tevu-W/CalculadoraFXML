package dad.javafx.fxml.CalculadoraFXML;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CalculadoraFXMLModel {

	StringProperty resultado = new SimpleStringProperty();

	public final StringProperty resultadoProperty() {
		return this.resultado;
	}

	public final String getResultado() {
		return this.resultadoProperty().get();
	}

	public final void setResultado(final String resultado) {
		this.resultadoProperty().set(resultado);
	}

}
