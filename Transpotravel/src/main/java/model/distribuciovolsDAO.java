package model;

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
	
	distribuciovols cercarVolClient(Conbd conn, int id);
	
}
