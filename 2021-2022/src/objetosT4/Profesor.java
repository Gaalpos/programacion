package objetosT4;

import java.util.Random;

public class Profesor extends Individuo{
	
	//atributo
	Materia materia;
	
	Profesor(){
		super();
	}
	
	//constructor completo
	Profesor(String nombre, int edad,Sexo sexo, Materia materia){
		super(nombre,edad,sexo);
		this.materia=materia;
	}

	@Override
	public String toString() {
		return "Profesor [materia=" + materia + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]"+"\n";
	}
	
	public boolean isDisponible() {
		//80% true 20% false
		
		Random r= new Random();
		if(r.nextDouble()<0.8)
			return true;
		else
			return false;
	}
}
