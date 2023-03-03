package peces;

public class Pez {
	
	private static int numpeces=0;
	
	public static int cuentaPeces() {
		return numpeces;
	}
	
	protected String nombre; //es como privado, pero sus clases derivadas lo ven

	public Pez(String nombre) {
		
		this.nombre=nombre;
		numpeces++;
	}
	
	public Pez(Pez p) {
		this.nombre=getNombre();
		numpeces++;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*@Override
	protected Object clone() {
		// TODO Auto-generated method stub
		Object obj=null;
		try {
			
		return super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	*/
	
	@Override
	public boolean equals (Object obj) {
		
		if(obj instanceof Pez) {
			//si es un pez guardado el obj pasado en una referencia temporal de Pez
			
			Pez tempPez = (Pez) obj;
			
			if(	this.nombre.equals(tempPez.nombre)){
					return true;
				}else {
					return false;
				}
				
		}else {
			return false;
		}
	}//cierre del metodo equals 

	@Override
	public String toString() {
		return "Pez [nombre=" + nombre + "]";
	}
	
	
	
	
}
