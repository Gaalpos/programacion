package cap_dous;

/*8. Crea la clase coche con dos constructores. Uno no toma parámetros y el otro sí. 
 * Los dos constructores inicializarán los atributos marca y modelo de la clase. 
 * Crea dos objetos (cada objeto llama a un constructor distinto) y verifica
que todo funciona correctamente.
*/

public class Nov02cocheExercicio8 {

	private int velocidade;
	private String marca;
	private String modelo;
	
	public void setVelocidade(int v) {
		this.velocidade=v;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	Nov02cocheExercicio8 (){//por defeito?
		this.velocidade=0;
		this.marca="";
		this.modelo="";
	}
	 
	Nov02cocheExercicio8(int velo, String mar, String mod){//con todolos atributos
		this.velocidade=velo;
		this.marca=mar;
		this.modelo=mod;
	}

	void acelera(int more) { 
		if (velocidade+more>120)
			this.velocidade=120;
		else
			this.velocidade+=more;
	}
	
	void frena(int less) {
		if (velocidade-less<0)
			this.velocidade=0;
		else	
			this.velocidade-=less;
	}

	
	@Override
	public String toString() {
		return "Oct25cocheExercicio8 [velocidade=" + velocidade + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

}
