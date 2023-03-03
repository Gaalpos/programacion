package ejercicios;

public class resuelto1 {

		public static char getLetras(){
		return (char)(Math.random()*26 + 'a');
		 }

		public static void main(String[] args) {
			for (int j=1;j<6;j++)
			System.out.println(getLetras());
			
		}

	}