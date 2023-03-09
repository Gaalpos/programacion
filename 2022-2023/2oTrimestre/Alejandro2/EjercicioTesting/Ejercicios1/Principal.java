package Ejercicios1;

public class Principal {

	
//Multiplica 2 numeros
		public static int multiplyWithNormalNumbers(int a,int b) {
		
		return a*b;
		}
		public static float multiplyWithDecimals(float a,float b) {
			
			return a*b;
			}
//Divide 2 numeros}
		public static int divideNormalNumbers (int a ,int b) {
			
			return a/b;
			}
public static double divideDecimalNumbers (double a ,double b) {
			
			return a/b;
			}
		//Otro que devuelva el primer caracter(convertido a mayúscula) de una cadena dada
		public static String getCab(String word) {
			word=word.substring(0,1);
			word=word.toUpperCase();
			return word;
			
		}
		
		
		public static void main(String[] args) {
			
			
			
		}
		
	}


