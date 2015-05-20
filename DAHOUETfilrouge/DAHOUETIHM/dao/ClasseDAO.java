package dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class ClasseDAO
{
	public static List<String> ListeClasse(String nomSerie){
	
		Connection c = Connect.cConnect();
	 
		List<String> lClasse = new ArrayList<>();
		 
		String nomClasse;        
	  
     Statement stm;
    
		try {
			stm = c.createStatement();
		
			String sql = "select classe.Nom_classe from classe " +
				"inner join serie on classe.Num_serie = serie.Num_serie "+
				" where serie.Nom_serie = " + "'" + nomSerie + "'"+ ";";

				
	        ResultSet rs = stm.executeQuery(sql);
	      
	        while (rs.next())
	         {
	        	nomClasse = rs.getString("Nom_classe");
		        lClasse.add(nomClasse); 
	         }
	         rs.close();
	       
	       
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
			
		return lClasse;
		
	
    
		 
	 }
	
}
