package model;

public class puntRecollida {

	private int idPuntRecollida;
	private String adreca;
	
	
	public puntRecollida(int idPuntRecollida, String adreca) {
		this.idPuntRecollida = idPuntRecollida;
		this.adreca = adreca;
	}

	
	public int getIdPuntRecollida() {
		return idPuntRecollida;
	}





	public void setIdPuntRecollida(int idPuntRecollida) {
		this.idPuntRecollida = idPuntRecollida;
	}





	public String getAdreca() {
		return adreca;
	}





	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}





	@Override
	public String toString() {
		return "puntRecollida [idPuntRecollida=" + idPuntRecollida + ", adreca=" + adreca + "]";
	}
	
	
}
