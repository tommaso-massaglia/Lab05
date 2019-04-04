package it.polito.tdp.anagrammi.model;

import java.util.List;

import it.polito.it.anagrammi.DAO.*;

public class Model {

	public boolean contieneParola(String passata) {
		parolaDAO DAO = new parolaDAO();
		return DAO.contieneParola(passata);
	}

	public List<String> getAnagrammi(String parola) {

		Anagrammi nuovo = new Anagrammi(parola);

		return nuovo.getAnagrammi();
	}

	

}
