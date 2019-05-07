package P1DP;

import java.util.ArrayList; 
import java.sql.Date; 

public class ReizigerOracleDaoImpl implements ReizigerDao {
	private ArrayList<Reiziger> alleReizigers= new ArrayList<Reiziger>();
	public ArrayList<Reiziger> findAll(){
		return alleReizigers;
	}
	public ArrayList<Reiziger> findByGBdatum(String GBdatum){
		Date datum = java.sql.Date.valueOf(GBdatum);

		ArrayList<Reiziger> reizigersMetGd = new ArrayList<Reiziger>();
		for (Reiziger r : alleReizigers) {
			if (r.getGbdatum() == datum) {
				reizigersMetGd.add(r);
			}
		}
		return reizigersMetGd;
	}
	public Reiziger save(Reiziger reiziger) {
		alleReizigers.add(reiziger);
		return reiziger;
	}
	public Reiziger update(Reiziger reiziger, String naam, String gbdatum) {
		for (Reiziger r : alleReizigers) {
			if(r.equals(reiziger)) {
				r.setNaam(naam);
				r.setGbdatum(java.sql.Date.valueOf(gbdatum));
				return r;
			}
		}
		return reiziger;
	}
	public boolean delete(Reiziger reiziger) {
		for (Reiziger r : alleReizigers) {
			if (r.equals(reiziger)) {
				alleReizigers.remove(r);
				return true;
			}
		}
		return false;
	}
	
}
