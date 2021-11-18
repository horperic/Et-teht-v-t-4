package model;

public class asiakas {
	private String etunimi, sukunimi, sposti;
	private int puhelin;
	public asiakas() {
		super();		
	}
	public asiakas(String etunimi, String sukunimi, String sposti, int puhelin) {
		super();
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.sposti= sposti;
		this.puhelin = puhelin;
	}
	public String getEtunimi() {
		return etunimi;
	}
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	public String getSukunimi() {
		return sukunimi;
	}
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	public String getSposti() {
		return sposti;
	}
	public void setSposti(String sposti) {
		this.sposti = sposti;
	}
	public int getPuhelin() {
		return puhelin;
	}
	public void setPuhelin(int puhelin) {
		this.puhelin = puhelin;
	}
	@Override
	public String toString() {
		return "Asiakas [Etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", sposti=" + sposti + ", puhelin=" + puhelin + "]";
	}
	
	
}
