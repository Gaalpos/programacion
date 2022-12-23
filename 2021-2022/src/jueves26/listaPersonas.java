package jueves26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class listaPersonas {

	public static void main(String[] args) {
		
		List<Persona> rol = new ArrayList<>();
		Persona p;
		
		
		for (int i=0;i<3;i++) {
			p=Persona.pideDatos();
			rol.add(p);
		}
		
		for(Persona per:rol) {
			System.out.println(per);
		}
		
		
		Collections.sort(rol);
		
		for(Persona per:rol) {
			System.out.println(per);
		}
		
	
		/*
		// creamo suna nueva forma de comparar sobre la marcha y puntual para este momento
		Collections.sort(rol,new Comparator<Persona>(){
			public int compare(Persona p1,Persona p2) {
				return -(p1.getEdad()-p2.getEdad());
			}
		});
		*/
		System.out.println("\n");
		System.out.println("Con orden descenedente por edad");
		
		for(Persona per :rol) {
			System.out.println(per);
		}
		
		//compare por peso ascendente
		Collections.sort(rol,new Comparator<Persona>(){
			public int compare(Persona p1,Persona p2) {
				return -(int)(100*p1.getPeso()-100*p2.getPeso());
			}
		});
		
		
		//compare por altura descendente
		
	}
}
