package ejerciciosCadenas;

public class ImprimeArgumentos {
	public static void main(String[] args) {
		
		if(args.length>0) {
			for (int i =0; i< args.length; i++) {
				System.out.println("Argumento "+i+ " : "+args[i]);
			}
		}else {
			System.out.println("No hay ningun argumento");
		}
	}

}
