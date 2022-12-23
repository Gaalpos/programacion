package cap2;

public class testCoche2 {
	public static void main(String[] args) {

		int vel = 100;
		int seco=50;
		String marca1="Picapiedra";
		String modelo="Roca 1";
		
		coche uno = new coche();
		System.out.println(uno.toString());
		uno.acelera(15);
		System.out.println(uno.toString());
		uno.frena(35);
		System.out.println(uno.toString());

		
		coche dos = new coche(vel,marca1,modelo);
		System.out.println(dos.toString());
		dos.acelera(2*vel);
		System.out.println(dos.toString());
		dos.frena(seco);
		System.out.println(dos.toString());
		

	}
}