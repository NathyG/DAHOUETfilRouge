package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Voilier;

public class VoilierDAO {

	public static List<String> ListeProprio() {

		Connection c = Connect.cConnect();

		List<String> lVoilier = new ArrayList<>();

		String nomVoilier;
		Statement stm;

		try {
			stm = c.createStatement();

			String sql = "select Nom_voilier from voilier ";
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				nomVoilier = rs.getString("Nom_voilier");
				lVoilier.add(nomVoilier);
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

		return lVoilier;
	}

	// Ajout d'un voilier

	public static void createVoilier(Voilier v) throws Exception {

		Connection c = Connect.cConnect();
		PreparedStatement stm;
		try {
			stm = c.prepareStatement("INSERT INTO voilier (Num_proprietaire,nom_classe,Nom_voilier) VALUES (?,?,?)");
			stm.setInt(1, v.getNum_proprietaire());
			stm.setString(2, v.getNom_classe());
			stm.setString(3, v.getNom_voilier());

			stm.executeUpdate();

			stm.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

}
