package ejemplos2;

public class Pajaro2 {

	 //*** atributos o propiedades ****
	//atributo DE CLASE
	//sirve para llevar la cuenta de los pájaros que se han creado
		private static int numpajaros=0;
		
		//los de siempre
		private char color; //propiedad o atributo color
		private int edad; //propiedad o atributo edad
		//*** métodos de la clase ****
		//metodo de clase que incrementa el numero de pajaros existentes en uno
		static void nuevopajaro(){numpajaros++;};
		// por defecto
		Pajaro2(){color = 'v';
		//edad = 0;
		nuevopajaro();
		}
		
		Pajaro2(char c, int e){color = c; 
		edad = e; 
		nuevopajaro();
		}
		//no necesito ningún objeto para llamarlo
		static void muestrapajaros(){System.out.println(numpajaros);}
		
		
		//metodo dinamico o de objeto
		public String toString() {
			return "Pajaro2 [color=" + color + ", edad=" + edad + "]";
		};
		
		

}