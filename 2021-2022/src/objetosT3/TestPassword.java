package objetosT3;

import repasoExamen2ev.generaArray;

public class TestPassword {

	public static void main(String[] args) {
		Password uno = new Password();
		System.out.println(uno.toString());
		
		for (int i=0;i<=10;i++) {
			Password p = new Password(10);
			System.out.println(p.toString()+ " "+p.esFuerte());
			
		}
	}
}
