package model;

public interface personaDAO {
	
	persona cercaPersona(Conbd conn,int id);
	boolean create(Conbd conn,persona art);
	boolean update(Conbd conn,int id,persona art);
	boolean delete(Conbd conn,int id);

}
