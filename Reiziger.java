package P1DP;

import java.sql.Date;

public class Reiziger {
	private String naam;
	private Date gbdatum;
	public Reiziger(String naam, String gbdatum) {
		this.naam = naam;
		this.gbdatum = java.sql.Date.valueOf(gbdatum);
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public Date getGbdatum() {
		return gbdatum;
	}
	public void setGbdatum(Date gbdatum) {
		this.gbdatum = gbdatum;
	}
	public String toString() {
		return "Reiziger [naam=" + naam + ", gbdatum=" + gbdatum + "]";
	}
	
	
}
