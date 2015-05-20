package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SerieDAO {

	public static List<String> ListeSerie() {
		Connection c = Connect.cConnect();

		List<String> lSerie = new ArrayList<>();

		String nomSerie;
		Statement stm;

		try {
			stm = c.createStatement();

			String sql = "select Nom_serie from serie ";
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				nomSerie = rs.getString("Nom_serie");
				lSerie.add(nomSerie);
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return lSerie;

	}
}