package it.polito.it.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class parolaDAO {

	/**
	 * Controlla se il database contiene o meno una parola
	 * 
	 * @param passata
	 * @return {@link True} se contiene la parola, {@link False} altrimenti.
	 */
	public boolean contieneParola(String passata) {

		final String sql = "SELECT nome FROM parola WHERE nome=?";

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, passata);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				String nome = rs.getString("nome");
				System.out.println(nome);
				return true;

			}

			return false;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}

}
