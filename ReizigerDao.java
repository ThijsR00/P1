package P1DP;

import java.util.ArrayList;


public interface ReizigerDao {
	public ArrayList<Reiziger> findAll();
	public ArrayList<Reiziger> findByGBdatum(String GBdatum);
	public Reiziger save(Reiziger reiziger);
	public Reiziger update(Reiziger reiziger, String naam, String gbdatum);
	public boolean delete(Reiziger reiziger);
	/*
	 * public void closeConnection();
	 */}
