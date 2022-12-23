package cap2;

public class testCoche {
	public static void main(String[] args) {

		int vel = 100;
		int seco=50;
		
		coche ferrari = new coche();
		System.out.println(ferrari.toString());
		ferrari.acelera(15);
		System.out.println(ferrari.toString());
		ferrari.frena(35);
		System.out.println(ferrari.toString());

		
		coche tesla = new coche(vel);
		System.out.println(tesla.toString());
		tesla.acelera(2*vel);
		System.out.println(tesla.toString());
		tesla.frena(seco);
		System.out.println(tesla.toString());
		

	}
}
