package dad.maven.imc;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IMC extends Application {
	
	private TextField tfPeso;
	private TextField tfAltura;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label lPeso = new Label("Peso:");
		Label lAltura = new Label("Altura:");
		Label lKg = new Label("kg");
		Label lCm = new Label("cm");
		
		Label lIMC = new Label();
		Label lResultado = new Label();
		
		tfPeso = new TextField();
		tfPeso.setPrefColumnCount(3);
		tfPeso.setMaxWidth(100);
		tfPeso.setAlignment(Pos.CENTER);
		
		tfAltura = new TextField();
		tfAltura.setPrefColumnCount(3);
		tfAltura.setMaxWidth(100);
		tfAltura.setAlignment(Pos.CENTER);
		
		HBox hbPeso = new HBox();
		hbPeso.setSpacing(5);
		hbPeso.setAlignment(Pos.BASELINE_CENTER);
		hbPeso.getChildren().addAll(lPeso, tfPeso, lKg);
		
		HBox hbAltura = new HBox();
		hbAltura.setSpacing(5);
		hbAltura.setAlignment(Pos.BASELINE_CENTER);
		hbAltura.getChildren().addAll(lAltura, tfAltura, lCm);
		
		HBox hbImc = new HBox();
		hbImc.setSpacing(1);
		hbImc.setAlignment(Pos.BASELINE_CENTER);
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(hbPeso, hbAltura, hbImc, lIMC, lResultado);
		
		Scene escena = new Scene(root, 320, 200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("IMC");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
