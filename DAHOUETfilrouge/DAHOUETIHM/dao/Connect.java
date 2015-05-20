package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	static Connection con = null;

	public static Connection cConnect() {
		String url = "jdbc:mysql://localhost/dahouet";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// On se connecte via la passerelle jdbc Oracle

			return con = DriverManager.getConnection(url, "secretaire",
					"secret");
		} catch (SQLException sqlE) {
			System.out.println("Sql Erreur " + sqlE.getMessage());
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
