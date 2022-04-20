package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;


public class EquipatgeDAOImpl implements EquipatgeDAO {
	
	@Override
	public equipatge cercarEquipatge(Conbd conn, int id) {
		
		equipatge equipatgeClient = null;
		
		String sql = "select equipatge.idEquipatge, equipatge.pes, equipatge.dni, A.ciutat, B.ciutat, estat.descripcio, puntrecollida.adreca " + 
				"from equipatge " + 
				"inner join estat on equipatge.idEstat = estat.idEstat " + 
				"inner join localitzacio as A on equipatge.idOrigen = A.idLocalitzacio " + 
				"inner join localitzacio as B on equipatge.idDesti = B.idLocalitzacio " +
				"inner join puntrecollida on equipatge.idPunt = puntrecollida.idPunt " + 
				"where idEquipatge=" + id + ";";
								
		try {
			
			PreparedStatement ps = conn.getConexio().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
						
			while(rs.next()) {
				
				String puntRecollida = rs.getString("adreca");
				int idEquipatge = rs.getInt("idEquipatge");
				int pes = rs.getInt("pes");
				String dni = rs.getString("dni");
				String origen = rs.getString("A.ciutat");
				String desti = rs.getString("B.ciutat");
				String estat = rs.getString("descripcio");
				
				equipatgeClient = new equipatge(idEquipatge, pes,dni,origen,desti,estat,puntRecollida);
			}
					
		}catch(Exception e) {
			
			System.out.println("ERROR AL CERCAR EQUIPATGE: " + e);
			
		}
		
		
				
		return equipatgeClient;
	}
	
}
