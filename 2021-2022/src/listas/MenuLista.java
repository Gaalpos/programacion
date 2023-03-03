package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
Crear un arraylist de enteros y realiza un programa con el
siguiente menu:
1.Rellenar aleatorios (genera 50
numeros aleatorios entre 0
y 10 en el arraylist,eliminando su contenido anterios.

2Rellenar con un numero (todos los elementos del arraylist
se rellenan con un mismo numero)
3 Ordenar el arraylist escogido de forma ascendente o
descendente.
4 mostrar el contenido del arraylist.
5 Borrar un numero del Arraylist escogido (se borra tantas
veces como aparezca)
6 Calcula el maximo y minimo del arraylist .
7.Calcula el numero de veces que se repite un entero en un
arraylist
8. Sustitiur un numero por otro
9.salir*/

public class MenuLista {
	static ArrayList<Integer> numeros;

	// apartado 1
	public static void rellenaAleatorios() {
		Random r = new Random();
		numeros.clear();
		for (int i = 0; i < 12; i++) {
			numeros.add(Integer.valueOf(r.nextInt(10)));
		}
mostrarContenido();
	}

	// mostrar contenido que es el apartado 4
	public static void mostrarContenido() {
		for (Integer ent : numeros) {
			System.out.print(ent+" ");
		}
		System.out.println("\n-------------------------");
	}
	
	//apartado 2 rellenar todo con el mismo numero
	public static void rellenaNumero(int ent) {
		numeros.clear();
		for (int i = 0; i < 12; i++) {
			numeros.add(Integer.valueOf(ent));
		}
		mostrarContenido();
	}
	//apartado 3 ordenar ascendente o descnedente
	// tipo true ascen false descende
	public static void ordenar(boolean tipo) {
		Collections.sort(numeros);
		if (!tipo) {
			Collections.reverse(numeros);
		}
		mostrarContenido();
	}
	//opcion 5 borrar un  numero escogido
	public static void borrarNumero(int ent) {
		
		while(	numeros.contains(Integer.valueOf(ent))) {
		numeros.remove(Integer.valueOf(ent));
	}
		mostrarContenido();
	}
	
	//opcion 6 calcular max y min del arrayList
	public static void calculaMM() {
		System.out.println("MAX: "+Collections.max(numeros));
		System.out.println("MIN: "+Collections.min(numeros));
	}
	
	//opcion 7 num veces se repite un entero en un Array
	public static void contarNumero(int ent) {
		int cont=0;
		/*for(Integer i: numeros) {
			if(numeros.contains(Integer.valueOf(ent))){
				cont++;
			}
		}*/
		// con este metodo de Collections me dice cuantas veces está sin el bucle
		//Collections.frequency(numeros, ent);
		for(int i=0; i<numeros.size();i++) {
		if(numeros.get(i)==Integer.valueOf(ent)) {
			cont++;
		}
		}
		System.out.println("NUM: "+ent+" esta "+cont+" veces ");
		
	}
	//opcion 8 Sustitiur un num por otro
	public static void sustituyeNumero(int fuera, int dentro) {

		for(int i=0; i<numeros.size();i++) {
			if(numeros.get(i)==Integer.valueOf(fuera)) {
				numeros.set(i,Integer.valueOf(dentro));
			}
			}
		mostrarContenido();
	}
	public static void main(String[] args) {
		numeros = new ArrayList<Integer>();
		
		rellenaAleatorios();
		rellenaNumero(8);
		rellenaAleatorios();
		ordenar(false);
		borrarNumero(7);
		calculaMM();
		rellenaAleatorios();
		ordenar(true);
		contarNumero(1);
		rellenaNumero(5);
		sustituyeNumero(5, 4);
		
	}
}
