package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class Anagrammi {

	String parolaoriginale;
	List<String> anagrammi;

	public Anagrammi(String parolaoriginale) {
		this.parolaoriginale = parolaoriginale;
		this.anagrammi = new ArrayList<String>();
	}

	public String getParolaoriginale() {
		return parolaoriginale;
	}

	public List<String> getAnagrammi() {
		this.anag(parolaoriginale, "");
		return anagrammi;
	}

	public void anag(String s1, String s2) {
		if (s1.length() == 0) {
			if (!anagrammi.contains(s2))
			anagrammi.add(s2);
		} else {
			for (int i = 0; i < s1.length(); i++) {
				anag(s1.substring(0, i) + s1.substring(i + 1, s1.length()), s1.charAt(i) + s2);
			}
		}
	}

}
