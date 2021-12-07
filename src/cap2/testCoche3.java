package cap2;

public class testCoche3 {
	/*
	 * Un coche non pode sobrepasar velocidade 120 E non pode ir a velocidade menor
	 * ca 0
	 */
	public static void main(String[] args) {

		int vel = 100;
		int seco = 50;
		String brand = "Mini";
		String model = "Cooper";

		coche3 uno = new coche3();
		System.out.println(uno.toString());

		uno.acelera(15);
		System.out.println(uno.toString());

		uno.frena(35);
		System.out.println(uno.toString());

		System.out.println();

		coche3 dos = new coche3(vel, brand, model);
		System.out.println(dos.toString());

		dos.acelera(2 * vel);
		System.out.println(dos.toString());

		dos.frena(seco);
		System.out.println(dos.toString());
	}
}