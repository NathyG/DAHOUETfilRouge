package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Club;

public class ClubDAO {

	public static List<String> ListeClub() {
		{
			Connection c = Connect.cConnect();
			String nomClub;

			List<String> lClub = new ArrayList<>();
			Statement stm;

			try {
				stm = c.createStatement();

				String sql = "select Nom_club from club ";
				ResultSet rs = stm.executeQuery(sql);

				while (rs.next()) {
					nomClub = rs.getString("Nom_club");
					lClub.add(nomClub);

				}
				rs.close();

			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException();
			}

			return lClub;

		}
	}

	public static Club NumeroClub(String nomclub) {
		{
			Club cl = null;
			int numClub = 0;

			Connection c = Connect.cConnect();
			Statement stm;
			try {
				stm = c.createStatement();
				String sql = "select Num_club from club  WHERE nom_club=" + "'"
						+ nomclub + "'" + ";";
				ResultSet rs = stm.executeQuery(sql);

				rs.next();
				numClub = rs.getInt("Num_club");

				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
			cl = new Club(numClub, nomclub);

			return cl;
		}

	}

}
