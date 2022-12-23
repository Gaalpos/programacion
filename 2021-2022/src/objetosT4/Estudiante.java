package objetosT4;

import java.util.Random;

public class Estudiante extends Individuo {

	// atributo
	float nota;

	Estudiante() {
		super();
	}

	Estudiante(String nombre, int edad, Sexo sexo, float nota) {
		super(nombre, edad, sexo);
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Estudiante [nota=" + nota + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]"+"\n";
	}
	
	public boolean isDisponible() {
		// para devolver 50% - 50%
		Random r = new Random ();
		return r.nextBoolean();
	}

}
