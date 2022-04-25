package model;

import java.time.LocalDateTime;
import java.util.List;




public interface distribuciovolsDAO {

	/*public static int Tots(Conbd conn, List<distribuciovols> llista){
		return 0;
	}
	
	public static void cercarVols(Conbd conn,int idorigenEntrat, int iddestiEntrat,List<distribuciovols> llista2){
	}*/
	public static void ComboBoxOrigen(Conbd conn,List<String> origens) {
	}
	public static void ComboBoxDesti(Conbd conn, List<String> destins) {
	}
	
	public static void cercarVols(Conbd conn,List<distribuciovols> llista2) {
		
		
	}
	public static void ComboBoxVols(Conbd conn,List<String> ciutats) {}
	public static void insertarVol(Conbd conn,String idorigen,String iddesti,int preu,LocalDateTime horaSortida,LocalDateTime horaArribada) {
	}
	public static void eliminarVol(Conbd conn,String idvol) {
		
	}

	distribuciovols cercarVolClient(Conbd conn, int id);
	
}
