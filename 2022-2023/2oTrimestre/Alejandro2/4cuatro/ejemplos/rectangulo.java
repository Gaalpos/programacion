package ejemplos;

public class rectangulo  /*extends Object*/ {
	
	private String nombre;
	private int ancho=0;
	private int alto=0;
	
	rectangulo(int an, int al, String nombre){
		
		this.ancho=an;
		this.alto=al;
		this.nombre=nombre;
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


public boolean equals (Object obj) {
	
	if(obj instanceof rectangulo) {
		rectangulo tempRectangulo = (rectangulo) obj;
		
		if(this.ancho == tempRectangulo.ancho &&
			this.alto == tempRectangulo.alto&&
			this.nombre.equals(tempRectangulo.nombre)){
				return true;
			}else {
				return false;
			}
			
	}else {
		return false;
	}
}//cierre del metodo equals 
	
	
	
	
	
	
	
}
