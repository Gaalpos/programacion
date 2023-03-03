package objetosT4;

import java.util.ArrayList;

public class testAula {
	public static void main(String[] args) {
		
		Profesor pepe = new Profesor ("Pepe",25,Sexo.VARON, Materia.MATEMATICAS);
		
		Estudiante gaalpos = new Estudiante ("Gaalpos",21, Sexo.VARON, 4f);
		Estudiante capi = new Estudiante ("Capi",19, Sexo.VARON, 5f);
		Estudiante helena = new Estudiante ("Helena",27, Sexo.MUJER, 9f);
		Estudiante chincho = new Estudiante ("Chincho",21, Sexo.MUJER, 7f);
		
		
		ArrayList <Estudiante> lista = new ArrayList<>();
		
		lista.add(gaalpos);
		lista.add(capi);
		lista.add(helena);
		lista.add(chincho);
		
		Aula pisoDos = new Aula (5,12,Materia.MATEMATICAS, pepe, lista);
		System.out.println(pisoDos.toString());
		System.out.println("hay clase? " + pisoDos.hayClase());
	}
}
