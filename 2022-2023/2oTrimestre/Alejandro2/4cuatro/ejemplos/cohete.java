package ejemplos;

public class cohete {

	public static int numCohetes=0;
	cohete(){
		numCohetes++;
	}
	
	public int dimeCohetes() {
		return numCohetes;
	
	}

	
	public static int getNumCohetes() {
		return numCohetes;
	}

	
	public static void setNumCohetes(int numCohetes) {
		//en vez de usar thhis que es una referencia a un objeto
		//usa el nombre de la clase
		cohete.numCohetes = numCohetes;
	}
	
	public static void main(String[] args) {
		
		cohete c1 = new cohete();
		cohete c2 = new cohete();
		cohete c3 = new cohete();
		cohete c4 = new cohete();
		
		System.out.println("numero de cohetes creados: "+cohete.getNumCohetes());
		
	}
	
}
