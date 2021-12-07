package cap2;

public class testSatelite {
	public static void main(String[] args) {
		
		satelite sol=new satelite();
		System.out.println(sol.toString());
		sol.setPosicion(15,12.39,4.53);
		System.out.println(sol.toString());
		
		
		satelite luna=new satelite(-8.2,42.2,0);
		System.out.println(luna.toString());
		luna.setPosicion(-122.02,37.2,10);
		System.out.println(luna.toString());
		
	}
}
