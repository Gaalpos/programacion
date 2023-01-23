package intro;

public class rectangulo extends figura implements areaFigura,perimetro /*extends Object*/ {
	
	private String nombre;
	private int ancho=0;
	private int alto=0;
	
	rectangulo(int an, int al, String nombre){
		
		this.ancho=an;
		this.alto=al;
		this.nombre=nombre;
	}
// no se vale repite int int string
//rectangulo(int al, int an, String nombre){}

	rectangulo(){
		this.ancho=0;
		this.alto=0;
		this.nombre="";
	}

	rectangulo(int dato){
		this.alto= this.ancho= dato;
	}


	//Constructor de copia
	
	rectangulo(rectangulo r){
		this.ancho= r.getAncho();
		this.alto= r.getAlto();
		this.nombre= r.getNombre();
	}
	
	
	
	
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n){
		String nombre=n;
	}
	
	public int getAncho(){
		return this.ancho;
	}
	
	public int getAlto(){
		return this.alto;
	}
	
	public rectangulo inrementarAncho() {
		this.ancho++;
		return this;
	}
	
	public rectangulo inrementarAlto() {
		this.alto++;
		return this;
	}

	@Override
	public String toString() {
		return "rectangulo [ancho=" + ancho + ", alto=" + alto + ", nombre="+ nombre+ "] ";
	}


public Object clone() {
	Object objeto= null;
	try {
		objeto=super.clone();
		
	}catch(CloneNotSupportedException nsex) {
		nsex.printStackTrace();
		System.out.println("La cagaste");
	}
	return objeto;
} 
public int area(){
	return this.alto*this.ancho;
}

public double perimetro(){
	return 2*(this.alto+this.ancho);
}
	
	
	
	
	
	
	
}
