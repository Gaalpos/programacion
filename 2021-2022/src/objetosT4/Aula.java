package objetosT4;

import java.util.ArrayList;

public class Aula {
	int id;
	int nmax;
	Materia destinada;
	Profesor profe;
	ArrayList<Estudiante> alumnos;

	// constructor
	Aula() {
		super();
	}

	Aula(int id, int nmax, Materia destinada, Profesor profe, ArrayList<Estudiante> alumnos) {

		this.id = id;
		this.nmax = nmax;
		this.destinada = destinada;
		this.profe = profe;
		if (alumnos.size() <= nmax)
			this.alumnos = alumnos;
		else
			System.out.println("Demasiados alumnos");
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", nmax=" + nmax + ", destinada=" + destinada + "\n" + ", profe=" + profe
				+ ", alumnos=" + alumnos + "]";
	}

//profesor viene y si su materia coincide con la del aula
	boolean hayClase() {
		if(profe.isDisponible()==true && this.destinada==profe.materia) 
				return true;
			else
				return false;
		
		}
	}


