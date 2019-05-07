package P1DP;

public class Main {
	public static void main(String[] args) {
		ReizigerOracleDaoImpl a = new ReizigerOracleDaoImpl();
		
		Reiziger r1 = new Reiziger("Jan", "1999-2-12");
		Reiziger r2 = new Reiziger("Kees", "1999-6-22");
		Reiziger r3 = new Reiziger("Piet", "2000-12-10");
		a.save(r1);
		a.save(r2);
		a.save(r3);
		System.out.println(a.findAll());
		System.out.println(a.update(r2, "klaas", "1999-6-23"));
		System.out.println(a.delete(r3));
		System.out.println(a.findAll());
		}
}
