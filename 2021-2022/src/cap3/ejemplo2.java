package cap3;

public class ejemplo2 {
	
	public static void main(String[] args) {
		
		/*
		int numero=0;
		int num=5;
		*/
		//bucle que cuenta hasta 10
		
		/*
		while(numero<=10) {
			System.out.println(numero);
			numero++;
		}
		System.out.println("fin main");
		*/
		/*
		do {
			System.out.println(num);
			num++;
		}while (num<=10);
		*/
		/*
		for(int numero=1; numero<=10; numero++) {
			System.out.println(numero);
		}
		*/
		
		
		for(int numero=10; numero>=0; numero--) {
			System.out.println(numero);
		}
		System.out.println("fin main");
		
		
		int a=5;
		int b=0;
		
		
		try {
		System.out.println("resultado "+(a/b));
	}catch (Exception e) {
		e.printStackTrace();
		System.out.println("COMO DIVIDES POR 0???");
	}
	}

}
