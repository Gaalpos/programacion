package objetosT4;

public class testIndividuo {
	
	public static void main(String[] args) {
		//Individuo beta = new Individuo("manolo",24,Sexo.VARON);
		
		Estudiante delta = new Estudiante("manolo",24,Sexo.VARON,7.5f);
		System.out.println(delta.toString());
		System.out.println(delta.isDisponible());
		
		Profesor gamma = new Profesor("irene",54,Sexo.MUJER , Materia.FISICA);
		System.out.println(gamma.toString());
		System.out.println(gamma.isDisponible());
	}

}
