package copias;

public class estudiante implements Cloneable { 
    private int numero; 
 
    public int getNumero() { 
        return numero; 
    } 
 
    public void setNumero(int number) { 
        this.numero = number; 
    }

	@Override
	public String toString() {
		return "Estudiante [numero=" + numero + "]";
	} 
	@Override
	public Object clone() {
		estudiante estu = null;
		try{
			estu = (estudiante)super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return estu;
	}
    
     
} 
