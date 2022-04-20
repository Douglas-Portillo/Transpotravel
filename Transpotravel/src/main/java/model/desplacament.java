package model;

public class desplacament {

	private int idDesplacament;
	private puntRecollida refPuntRecollida;
	private persona refPersona;
	private String origen;
	private String desti;
	private int preuFinal;
	
	public desplacament(int idDesplacament, puntRecollida refPuntRecollida,
			persona refPersona, String origen, String desti, int preuFinal) {
		this.idDesplacament = idDesplacament;
		this.refPuntRecollida = refPuntRecollida;
		this.refPersona = refPersona;
		this.origen = origen;
		this.desti = desti;
		this.preuFinal = preuFinal;
	}

	public int getIdDesplacament() {
		return idDesplacament;
	}

	public void setIdDesplacament(int idDesplacament) {
		this.idDesplacament = idDesplacament;
	}

	public puntRecollida getRefPuntRecollida() {
		return refPuntRecollida;
	}

	public void setRefPuntRecollida(puntRecollida puntRecollida) {
		this.refPuntRecollida = puntRecollida;
	}

	public persona getRefPersona() {
		return refPersona;
	}

	public void setRefPersona(persona objectePersona) {
		this.refPersona = objectePersona;
	}
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDesti() {
		return desti;
	}

	public void setDesti(String desti) {
		this.desti = desti;
	}

	public int getPreuFinal() {
		return preuFinal;
	}

	public void setPreuFinal(int preuFinal) {
		this.preuFinal = preuFinal;
	}

	@Override
	public String toString() {
		return "desplacament [idDesplacament=" + idDesplacament + ", origen=" + origen + ", desti=" + desti + ", preuFinal=" + preuFinal
				+ ", getIdDesplacament()=" + getIdDesplacament() + ", getRefPuntRecollida()=" + getRefPuntRecollida()
				+ ", getRefPersona()=" + getRefPersona() + ", getOrigen()=" + getOrigen() + ", getDesti()=" + getDesti()
				+ ", getPreuFinal()=" + getPreuFinal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
