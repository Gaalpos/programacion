package ejemplos2;

public class testCoche {
	public static void main(String[] args) {
		coche npi= new coche();
		coche feo = new coche(4, "marron", "ni_se_sabe", "antiguo", 2, 7.32, 14);
		coche molon= new coche(7, "azul palido", "ACME", "mark3", 1, 0.34, 3200);
		feo.acelerar();
		feo.acelerar(100);
		feo.arrancar();
		feo.frenar();
		feo.pasarITV();
		System.out.println(feo.equals(molon));
		System.out.println(feo.toString());
		System.out.println(molon.toString());
		feo.color="dorado que lo flipas";
		System.out.println(feo);
		System.out.println(npi.toString());
}
}