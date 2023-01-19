package ejemplos2;

public class pajaro {
	

	 //*** atributos o propiedades ****
	private char color; //propiedad o atributo color
	private int edad; //propiedad o atributo edad
	//*** métodos de la clase ****
	
	pajaro(){
		
	}
	
	pajaro(char color,int edad){
		this.color= color;
		if(edad>=0) {
			this.edad=edad;
			
		}
		else {
			System.out.println("No se admiten edades negativas");
			this.edad=0;
		}
		
	}
	
	
	public void imprimeEdad(){System.out.println(edad);}
	public void imprimeColor(){}
	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void printcolor(){
	switch(color){//abre switch
	//Los pájaros son verdes, amarillos, grises, negros o blancos
	//No existen pájaros de otros colores
	case 'v': System.out.println("verde");break;
	case 'a': System.out.println("amarillo");break;
	case 'g': System.out.println("gris");break;



	case 'n': System.out.println("negro");break;
	case 'b': System.out.println("blanco");break;
	default: System.out.println("color no establecido");}}


	public String toString() {
		return "pajaro [color=" + color + ", edad=" + edad + "]";
	}

	

}