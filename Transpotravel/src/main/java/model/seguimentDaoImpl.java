package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;


public class seguimentDaoImpl implements seguimentDAO {

	static String sql = "SELECT * FROM seguiment;";

	public static int Tots(Conbd conn, List<seguiment> llista) {
		
			try {
				
				PreparedStatement ps = conn.getConexio().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					
					
					String idEstat = rs.getString("idEstat");

					seguiment seguiment = new seguiment(0, null, null,idEstat);
					llista.add(seguiment);
					
				}
						
			}catch(Exception e) {
				
				System.out.println("ERROR de Consulta");
				
			}
			
		
			/*
			String sql = "SELECT * FROM article;";

			ResultSet result = connexio.consulta(sql);

			try {

					while(result.next()) {
						
						int idArticle = result.getInt("id_article");
						String descripcio = result.getString("descripcio");
						double preu_compra = result.getDouble("preu_compra");
						double preu_venta = result.getDouble("preu_venta");

						article afegir = new article(idArticle, descripcio, preu_compra, preu_venta);
						llista.add(afegir);

					}
			} catch (Exception e) {
				System.out.println("ERROR");
			}
			*/
			
			if (llista.size() == 0) {
				
				return 0;
				
			}

			else {
				
				return (llista.size() + 1);
				
			}
			
		}
	
	
	
	@Override
	public seguiment cercaArticle(Conbd conn, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Conbd conn, seguiment art) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Conbd conn, int id, seguiment art) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Conbd conn, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
