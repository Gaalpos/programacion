package cap3;

public class progresionesAritmeticas {

	
	public static void main(String[] args) {
		
				int cont=0;
				//PROGRESION Aritmetica 
				//termino inicial 1
				//razon 3
				//1,4,7,10,13.....
				for(int i=1;i<20;i=i+3) {
					
					System.out.print(i+",");
					cont++;
					}
				
				System.out.println();
				System.out.println("has listado "+cont+" numeros");
			
				//comienza 99,  razon -4
				cont=0;
				for(int j=99; j>0; j=j-4) {
					System.out.print(j+",");
					cont++;
				}
				
				System.out.println();
				System.out.println("has listado "+cont+" numeros");
			
				
		
		
	}
	
}