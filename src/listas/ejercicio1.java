package listas;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) throws URISyntaxException {

	/* prepara una lista con 6 objetos estdiante
	 * */
	
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Estudiante> lista = new ArrayList<>();	
		
		String n;
		Integer e;
		URI m;
		Estudiante est;
		
		for (int i=0; i<6;i++) {
		
		 
		 System.out.println("Nombre");
		 n=sc.nextLine();
		 
		 System.out.println("Edad: ");
		 e=Integer.parseInt(sc.nextLine());
		 
		 System.out.println("mail");
		 m=new URI(sc.nextLine());
		 
		 est = new Estudiante(n,e,m);
		 lista.add(est);
		} 
		
		for(Estudiante p:lista) {
			System.out.println(p);
		}
		
		Collections.sort(lista);
	}
}
