package seleccion;

import java.util.ArrayList;

public class testSeleccion {

	public static ArrayList <Seleccion> integrantes = 
				new ArrayList<Seleccion>();
	
	public static void main(String[] args) {
		
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		
		Futbolista Iniesta = new Futbolista(2, "Andrés","Iniesta",29,6,"Interior Derecho");
		
		Masajista raulMartinez = new Masajista (3, "Raúl","Martinez",41, "Licenciado en fisioterapia", 18);
		
		integrantes.add(delBosque);
		integrantes.add(Iniesta);
		integrantes.add(raulMartinez);
		
		
		//probamos metodo concentrarse
		
		for(Seleccion s : integrantes) {
			s.Concentrarse();
		}
		
		for(Seleccion s : integrantes) {
			s.Viajar();
		}
		
		for(Seleccion s:integrantes) {
			if(s instanceof Entrenador) {
				((Entrenador) s) .dirigirPartido();
				((Entrenador) s) .dirigirEntreno();
			}
		}
		for(Seleccion s:integrantes) {
			if(s instanceof Futbolista) {
				((Futbolista) s) .jugarPartido();
				((Futbolista) s) .entrenar();
			}
		}
	}
}
