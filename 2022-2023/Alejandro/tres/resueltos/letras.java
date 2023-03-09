package resueltos;

import java.util.Scanner;

public class letras {

	
		private char letra;
		letras(char l){
		letra = l;
		if (l >= 'a') {
		letra -= 'a'; //Quitamos 97 para saber su posicion( la diferencia entre el caracter a y el dado por nosotros)
		letra += 'A'; //Alñadimos 65 para saber que letra mayúscula le corrsponde
		}
		}
		public char getLetra() {
			
			return letra;
			}
		
		public void printLetra(){
		System.out.println (letra) ;
		}
		@Override
		public String toString() {
			return "letras [letra=" + letra + "]";
		}
		
		public static void main(String[] args) {
			
			char let;
			Scanner sc= new Scanner(System.in);
			System.out.println("Dame una letra: ");
			let=sc.nextLine().charAt(0);
			
			letras una= new letras(let);
			System.out.println(una.toString());
			
		}
		
		
		
		}
	
	
	
	

