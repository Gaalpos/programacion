package ejemplos;

public class cohete {

	private static int numcohetes=0;
	cohete(){
		numcohetes++;
	}
	
	public static int getNumCohetes(){
		return numcohetes;
	}
	
	public static void setNumcohetes(int numcohetes) {
		
		cohete.numcohetes=numcohetes;
	}
	
	public static void main(String[] args) {
		
		
		cohete c1= new cohete();
		cohete c2= new cohete();
		cohete c3= new cohete();
		cohete c4= new cohete();
		
		System.out.println("numero de cohetes creados: "+cohete.getNumCohetes());
		
		
		
		
	}
	
	
}
