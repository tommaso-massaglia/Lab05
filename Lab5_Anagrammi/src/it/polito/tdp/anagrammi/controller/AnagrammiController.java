package it.polito.tdp.anagrammi.controller;

import it.polito.tdp.anagrammi.model.Model;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {

	Model model;

	public void setModel(Model model) {
		this.model = model;
	}

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtInput;

	@FXML
	private Button btnCalcola;

	@FXML
	private TextArea txtCorretti;

	@FXML
	private TextArea txtErrati;

	@FXML
	private Button btnReset;

	@FXML
	void doCalcola(ActionEvent event) {
		this.doReset(event);
		for (String s : model.getAnagrammi(this.txtInput.getText())) {
			if (model.contieneParola(s))
				this.txtCorretti.appendText(s + "\n");
			else
				this.txtErrati.appendText(s + "\n");
		}
	}

	@FXML
	void doReset(ActionEvent event) {
		this.txtCorretti.clear();
		this.txtErrati.clear();
	}

	@FXML
	void initialize() {
		assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Anagrammi.fxml'.";
		assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
		assert txtCorretti != null : "fx:id=\"txtCorretti\" was not injected: check your FXML file 'Anagrammi.fxml'.";
		assert txtErrati != null : "fx:id=\"txtErrati\" was not injected: check your FXML file 'Anagrammi.fxml'.";
		assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

	}

}
