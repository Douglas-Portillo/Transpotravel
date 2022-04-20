package model;
import java.sql.ResultSet;      
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.ImageView;

//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
import java.time.LocalDateTime;


public class distribuciovolsDAOImpl implements distribuciovolsDAO{

	//static String sql = "SELECT * FROM distribuciovols;";

	/*public static int Tots(Conbd conn, List<distribuciovols> llista) {
		
			try {
				
				PreparedStatement ps = conn.getConexio().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					
					int iddistribuciovols = rs.getInt("iddistribuciovols");
					int idorigen = rs.getInt("idorigen");
					int iddesti = rs.getInt("iddesti");
					int preu = rs.getInt("preu");
					LocalDateTime horaArribada = rs.getObject("horaArribada", LocalDateTime.class);
					LocalDateTime horaSortida = rs.getObject("horaSortida", LocalDateTime.class);
					int oferta = rs.getInt("oferta");
					int idpuntrecollida=rs.getInt("idpuntrecollida");
					Image image = new Image(rs.getString("imatge"));
			        ImageView iv1 = new ImageView();
			        iv1.setImage(image);
					
					distribuciovols afegir = new distribuciovols(iddistribuciovols, idorigen, iddesti, preu,horaArribada,horaSortida,oferta,idpuntrecollida,iv1);
					llista.add(afegir);
					
				}
						
			}catch(Exception e) {
				
				System.out.println("ERROR");
				
			}
			
			if (llista.size() == 0) {
				
				return 0;
				
			}

			else {
				
				return (llista.size() + 1);
				
			}
			
		}*/
	
	
	public static void ComboBoxDesti(Conbd conn,List<String> destins) {
		
		String sql2 = "select localitzacio.ciutat from distribuciovols inner join localitzacio on distribuciovols.iddesti=localitzacio.idLocalitzacio;";
		
		try {
			
			PreparedStatement ps = conn.getConexio().prepareStatement(sql2);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				String iddestins = rs.getString("localitzacio.ciutat");
				
				destins.add(iddestins);			
				
			}
					
		}catch(Exception e) {

			System.out.println("ERROR En el Combobox desti");
			
		}

		
	}
	
	
	
	
	
	public static void ComboBoxOrigen(Conbd conn,List<String> origens) {
		String sql2 = "select localitzacio.ciutat from distribuciovols inner join localitzacio on distribuciovols.idorigen=localitzacio.idLocalitzacio;";
		
		try {
			
			PreparedStatement ps = conn.getConexio().prepareStatement(sql2);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				String idorigens = rs.getString("localitzacio.ciutat");
				
				origens.add(idorigens);			
				
			}
					
		}catch(Exception e) {

			System.out.println("ERROR En el Combobox origen");
			
		}

		
	}
	
	/*public static void cercarVolsOferta(Conbd conn,int idorigenEntrat,int iddestiEntrat,List<distribuciovols> llista2) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM distribuciovols where idorigen = '" + idorigenEntrat + "' and iddesti='"+iddestiEntrat+"';";
				
		try {
			
			PreparedStatement ps = conn.getConexio().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int iddistribuciovols = rs.getInt("iddistribuciovols");
				int idorigen = rs.getInt("idorigen");
				int iddesti = rs.getInt("iddesti");
				int preu = rs.getInt("preu");
				LocalDateTime horaArribada = rs.getObject("horaArribada", LocalDateTime.class);
				LocalDateTime horaSortida = rs.getObject("horaSortida", LocalDateTime.class);
				int oferta = rs.getInt("oferta");
				int idpuntrecollida=rs.getInt("idpuntrecollida");
				Image image = new Image(rs.getString("imatge"));
		        ImageView iv1 = new ImageView();
		        iv1.setImage(image);
		        
				distribuciovols afegir = new distribuciovols(iddistribuciovols, idorigen, iddesti, preu,horaArribada,horaSortida,oferta,idpuntrecollida,iv1);
				llista2.add(afegir);			
				
			}
					
		}catch(Exception e) {
			
			System.out.println("ERROR En el cercarvols");
			
		}
				
	}*/
	
	
	
	public static void cercarVols(Conbd conn,List<distribuciovols> llista2) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM distribuciovols;";
				
		try {
			
			PreparedStatement ps = conn.getConexio().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int iddistribuciovols = rs.getInt("iddistribuciovols");
				String idorigen = rs.getString("idorigen");
				String iddesti = rs.getString("iddesti");
				int preu = rs.getInt("preu");
				LocalDateTime horaSortida = rs.getObject("horaSortida", LocalDateTime.class);
				LocalDateTime horaArribada = rs.getObject("horaArribada", LocalDateTime.class);
				int oferta = rs.getInt("oferta");
				int idpuntrecollida = rs.getInt("idPuntRecollida");
				String descripcio = rs.getString("descripcio");
				String estat = rs.getString("estat");
				
				distribuciovols afegir = new distribuciovols(iddistribuciovols, idorigen,iddesti, preu,horaArribada,horaSortida,oferta,idpuntrecollida,descripcio,null,estat);

				llista2.add(afegir);			
				
			}
					
		}catch(Exception e) {
			
			System.out.println("ERROR En el Cercar vols oferta: " + e);
			
		}
				
	}
	
	
	@Override
	public distribuciovols cercarVolClient(Conbd conn, int id) {
		
		distribuciovols distribuciovolsClient = null;
		
		String sql = "select distribuciovols.iddistribuciovols,A.ciutat, B.ciutat, estat.descripcio " + 
				"from distribuciovols " + 
				"inner join estat on distribuciovols.estat = estat.idEstat " + 
				"inner join localitzacio as A on distribuciovols.idorigen = A.idLocalitzacio " + 
				"inner join localitzacio as B on distribuciovols.iddesti = B.idLocalitzacio " + 
				"where iddistribuciovols = " + id + ";";
								
		try {
			
			PreparedStatement ps = conn.getConexio().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
						
			while(rs.next()) {
				
				String idPunt = rs.getString("iddistribuciovols");
				String origen = rs.getString("A.ciutat");
				String desti = rs.getString("B.ciutat");
				String estat = rs.getString("descripcio");		
				
				//distribuciovolsClient = new distribuciovols(null, origen,desti,null, null,null,null,null,null,null,estat);
				
				distribuciovolsClient = new distribuciovols(Integer.parseInt(idPunt), origen, desti, 0, null, null, 0, 0, " ", null,estat);
			}
			
		}catch(Exception e) {
			System.out.println("ERROR AL CERCAR VOL: " + e);	
		}
		
			return distribuciovolsClient;
		
		}

}
