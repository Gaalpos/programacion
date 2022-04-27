package objetosT4;

public abstract class Individuo {
	private final Sexo SEXO_DEF=Sexo.OTROS;
	
	String nombre;
	int edad;
	Sexo sexo;
	
	
	
	public Individuo() {
		sexo=SEXO_DEF;
	}
	
	
	Individuo(String nome, int ed, Sexo s){
		nombre=nome;
		edad=ed;
		sexo=s;
		
	}


	@Override
	public String toString() {
		return "Individuo [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	public boolean isDisponible;
	
}