package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Proprietaire;

public class ProprietaireDAO {

	public static List<String> ListeProprio() {

		Connection c = Connect.cConnect();

		List<String> lProprio = new ArrayList<>();

		String nomProprio;
		Statement stm;

		try {
			stm = c.createStatement();

			String sql = "select Nom_proprietaire from proprietaire ";
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				nomProprio = rs.getString("Nom_proprietaire");
				lProprio.add(nomProprio);
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

		return lProprio;
	}

	// Ajout d'un proprietaire

	public static void createProprietaire(Proprietaire proprio, int numClub)
			throws Exception {

		Connection c = Connect.cConnect();
		PreparedStatement stm;
		try {
			stm = c.prepareStatement("INSERT INTO Proprietaire (num_club,nom_proprietaire,coordonnees_proprietaire,compte_participant) VALUES (?,?,?,?)");
			stm.setInt(1, numClub);
			stm.setString(2, proprio.getNom_proprietaire());
			stm.setString(3, proprio.getCoordonnees_proprietaire());
			stm.setString(4, proprio.getCompte_participant());

			stm.executeUpdate();

			stm.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	public static int NumeroProprio(String nomProprio) {

		int numproprio = 0;

		Connection c = Connect.cConnect();
		Statement stm;
		try {
			stm = c.createStatement();
			String sql = "select Num_proprietaire from proprietaire  WHERE nom_proprietaire="
					+ "'" + nomProprio + "'" + ";";
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				numproprio = rs.getInt("Num_proprietaire");
			}

			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return numproprio;
	}

}
