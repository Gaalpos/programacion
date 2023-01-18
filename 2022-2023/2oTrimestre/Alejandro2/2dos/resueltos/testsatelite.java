package resueltos;

public class testsatelite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creo un nuevo objeto satelite con unos valores
		satelite meteosat= new satelite(89,02,1);
		//Llamo al método toString para que me muestre el valor de las variables del objeto creado
		System.out.println(meteosat.toString());
		
		meteosat.variaAltura(120);
		meteosat.variaCoordenadas(56, 80);
		System.out.println(meteosat.toString());
		meteosat.variaposicion(67, 38, 97);
		
		System.out.println("Esta en órbita?: "+meteosat.enOrbita());
		System.out.println(meteosat.toString());
	}

}
