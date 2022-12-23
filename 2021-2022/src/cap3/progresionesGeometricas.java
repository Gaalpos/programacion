package cap3;

public class progresionesGeometricas {

	public static void main(String[] args) {
		
		int cont=0;
		//PROGRESION Geometrica 
		//termino inicial 3
		//razon 2
		//3,6,12,24,48,96.....
		for(int i=3;i<100;i*=2) {
			
			System.out.print(i+",");
			cont++;
			}
		
		System.out.println();
		System.out.println("has listado "+cont+" numeros");
	
		//comienza 128,  razon *1/2     /2
		//128,64,32,16,8,4,2.....
		cont=0;
		for(int j=128; j>1; j=j/2) {
			System.out.print(j+",");
			cont++;
		}
		
		System.out.println();
		System.out.println("has listado "+cont+" numeros");
	
		


}
	
	
}
