package cap2;

class pajaro {

	//variable para contar NO DEPENDE DE OBJETO
	//ES DE LA CLASE
	public static int numero = 0;
	
	public static void muestraTotal() {
		System.out.println("Total de pajaros creados: "+numero);
	}

	//***atributos o propiedades***
	private char color;
	private int edad;
	private String nombre;

	// constructores de la clase
	pajaro() {
		color = 'v';
		edad = 0;
		numero++;
	}

	pajaro(char c, int e) {
		this.color = validaColor(c);
		this.edad = validaEdad(e);
		numero++;
	}
	pajaro(char c) {
		this.color = c;
		numero++;
	}
	pajaro(int e) {
		this.edad = validaEdad(e);
		numero++;
	}
	pajaro(char color, int edad, String nombre){
		this.color=color;
		this.edad=edad;
		this.nombre=nombre;
		numero++;
	}
	
	//***metodos de la clase***
	  // metodo para filtrar la edad
	
	public int validaEdad(int ed) {

		if (ed > 0)
			return ed;
		else
			return 0;

	}
	// metodo para filtrar color
	public char validaColor(char color) {

		if (color == 'v' || color == 'a' || color == 'n' || color == 'v' || color == 'b' || color == 'F')
			return color;
		else
			return color = ' ';

	}
	
	//Setters

	public void setColor(char color) {
		this.color = color;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNomnbre(String nome) {
		this.nombre = nome;
	}
	
	//Getters

	public char getColor() {
		return this.color;
	}

	public int getEdad() {
		return this.edad;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void printEdad() {
		System.out.println(edad);
	}

	// Los pájaros son verdes, amarillos, grises, negros o blancos
	// No existen pájaros de otros colores
	public void printColor() {
		switch (color) {
		case 'v':
			System.out.println("verde");
			break;
		case 'a':
			System.out.println("amarillo");
			break;
		case 'g':
			System.out.println("gris");
			break;
		case 'n':
			System.out.println("negro");
			break;
		case 'b':
			System.out.println("blanco");
			break;
		case 'F':
			System.out.println("FRESITA");
			break;
		default:
			System.out.println("color no establecido");
		}
	}

	@Override
	public String toString() {
		return "pajaro [color=" + color + ", edad=" + edad + ", nombre=" + nombre + "]";
	}

}
