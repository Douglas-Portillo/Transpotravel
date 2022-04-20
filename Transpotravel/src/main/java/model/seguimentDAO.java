package model;

import java.util.List;

public interface seguimentDAO {
	
public static int Tots(Conbd conn, List<seguiment> llista){
		
		return 0;
		
	}
	
	seguiment cercaArticle(Conbd conn,int id);
	boolean create(Conbd conn,seguiment art);
	boolean update(Conbd conn,int id,seguiment art);
	boolean delete(Conbd conn,int id);

}
