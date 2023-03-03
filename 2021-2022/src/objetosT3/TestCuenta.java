package objetosT3;

public class TestCuenta {
	
	public static void main(String[] args) {
		Cuenta uno= new Cuenta("Jose Perez");
		Cuenta dos = new Cuenta("marcos, cortes",1500d);
		
		uno.ingresar(500d);
		System.out.println(uno.toString());
		uno.ingresar(-1200d);
		System.out.println(uno.toString());
		
		
		dos.retirar(235d);
		System.out.println(dos.toString());
		dos.retirar(5000d);
		System.out.println(dos.toString());
		
		dos.retirar(-1000d);
		System.out.println(dos.toString());
	}

}
