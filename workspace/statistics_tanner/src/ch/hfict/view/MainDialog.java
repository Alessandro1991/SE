package ch.hfict.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.StringReader;

import ch.hfict.math.Statistics;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainDialog extends Application {
	Statistics statistics = new Statistics();

	public MainDialog() throws FileNotFoundException {
	}
	
	public String calculate(String input) {
		BufferedReader r = new BufferedReader(
				new StringReader(input));
		statistics.read(r);		
		return new Double(
				statistics.getAverage()).toString();
	}
	
	public void start(Stage stage) throws Exception {
		TextField result_fld = new TextField();
		TextField input_fld = new TextField();
		result_fld.setPrefColumnCount(12);
		result_fld.setEditable(false);
		input_fld.setPrefColumnCount(12);
		Button calc_btn = new Button("Calculate");
		calc_btn.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						String input = input_fld.getText();
						String res = calculate(input);
						result_fld.setText(res);
					}
		}		);
		Button clear_btn = new Button("Clear");
		clear_btn.setOnAction(
				new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						input_fld.setText("");
						result_fld.setText("");
					}
				});
		
		Label input_lbl = new Label("List of Values");
		Label result_lbl = new Label("Average");
		
		GridPane root = new GridPane();
		root.setPadding(new Insets(10, 10, 10, 10));
		root.setHgap(10);
		root.setVgap(4);
		root.add(input_lbl, 0, 0);
		root.add(result_lbl, 0, 1);
		root.add(input_fld, 1, 0);
		root.add(result_fld, 1, 1);
		HBox hbox = new HBox(10);
		hbox.getChildren().addAll(calc_btn, clear_btn);
		root.add(hbox, 1, 2);
		stage.setScene(new Scene(root, 300, 150));
		stage.setTitle("Hello JavaFX");
		stage.show();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new MainDialog();
		launch(args);
	}

}
