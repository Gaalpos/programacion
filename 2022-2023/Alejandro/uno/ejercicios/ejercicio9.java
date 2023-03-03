package ejercicios;

public class ejercicio9 {

	
	public static int getNumero(){
		return (int) (1+Math.random()* ( (99 +1)-1 ) );}
		
		public static void main(String[] args) {
			int numero;
			int pares = 0;
		//generamos 40 numeros
		for(int i=0;i<40;i++) {
			numero=getNumero();
			System.out.println("generado: "+numero);
				if ( (numero%2==0) ){
					pares++;
					System.out.println("par");
					}
		}						
				
			System.out.println("Hemos generado "+pares+ " numeros pares ");
			System.out.println("hemos generado "+(40-pares)+" impares");
	}

}
