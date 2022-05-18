package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * ***Ejercicio 6
Implementa el control de acceso al área restringida de un programa. 
Se debe pedir un nombre de usuario y una contraseña. 
Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. 
El usuario tendrá un máximo de 3 oportunidades. 
Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. 
Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una estructura de la clase HashMap.

 */

public class ejercicio6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String,String>mapa =new HashMap<>();
		
		String user="";
		String pass="";
		
		mapa.put("yanki","1312");
		mapa.put("melon","sandia");
		mapa.put("jak","2w3r4");
		
		System.out.println("introduce usuario: ");
		user=sc.nextLine();
		
		if(mapa.containsKey(user)) {
			System.out.println("al menos sabes el usuario");
			//pedir la contraseña
			System.out.println("contraseña");
			pass=sc.nextLine();
			if(mapa.get(user).equals(pass)) {
				System.out.println("ACCESO PERMITIDO");
			}else {
				System.out.println("ERROR DE CONTRASEÑA");
			}
		}else {
			System.out.println("que usas???");
			//volver a pedir usuario
		
		}
	}

}
