package ejemplo3;

import java.util.ArrayList;

public class TestSeleccion {

	public static ArrayList <SeleccionFutbol> integrantes = 
				new ArrayList<SeleccionFutbol>();
	
	public static void main(String[] args) {
		
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		
		Futbolista Iniesta = new Futbolista(2, "Andr�s","Iniesta",29,6,"Interior Derecho");
		
		Masajista raulMartinez = new Masajista (3, "Ra�l","Martinez",41, "Licenciado en fisioterapia", 18);
		
		integrantes.add(delBosque);
		integrantes.add(Iniesta);
		integrantes.add(raulMartinez);
		
		
		//probamos metodo concentrarse
		
		for(SeleccionFutbol s : integrantes) {
			s.Concentrarse();
		}
		
		for(SeleccionFutbol s : integrantes) {
			s.Viajar();
		}
		
		for(SeleccionFutbol s:integrantes) {
			if(s instanceof Entrenador) {
				((Entrenador) s) .dirigirPartido();
				((Entrenador) s) .dirigirEntrenamiento();
			}
		}
		for(SeleccionFutbol s:integrantes) {
			if(s instanceof Futbolista) {
				((Futbolista) s) .jugarPartido();
				((Futbolista) s) .entrenar();
			}
		}
	}
}

