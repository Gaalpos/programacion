package ejercicios_propuesto_libro;

public class TestCoche {
	public static void main(String[] args) {
		int vel = 100;
		int seco = 50;

		String mark = "mini";
		String modelo = "cooper";

		// REVISAR

		Coche uno = new Coche();
		System.out.println(uno.toString());
		uno.acelera(15);
		System.out.println(uno.toString());
		uno.frena(35);
		System.out.println(uno.toString());

		Coche dos = new Coche(vel, mark, modelo);
		System.out.println(dos.toString());
		dos.acelera(2 * vel);
		System.out.println(dos.toString());
		dos.frena(seco);
		System.out.println(dos.toString());
	}
}
