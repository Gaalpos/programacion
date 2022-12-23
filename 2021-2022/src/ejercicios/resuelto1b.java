package ejercicios;

public class resuelto1b {
	
	public static int generaNumero() {
		return (int) (1+ Math.random()*49);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("LA PRIMITIVA DE HOY ES:");
		for (int j=1;j<7;j++)
			System.out.println(generaNumero());
		

	}

}
