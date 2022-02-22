package ejerciciosCadenas;

public class ImprimirYContar {
	
	public static void main(String[] args) {
		String [] semana = {"lunes","martes","miercoles","jueves","viernes","sábado","domingo"};
		
		for( String usame : semana ) {
			System.out.println(usame+ " Longitud: "+usame.length());
		}
		
	}

}
