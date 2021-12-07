package cap2;

import java.util.Scanner;

public class testMarinas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double millas;
		Scanner es =new Scanner(System.in);
		System.out.println("introduce millas");
		millas=es.nextDouble();
		marinas doro=new marinas (millas);
		System.out.println(doro.toString()+ " millas");
		
		//conversiones
		System.out.println("en metros "+doro.millasAMetros());
		System.out.println("en kilometros "+doro.millasAKilometros());
		
		es.close();
	}

}
