package resueltos;

import java.util.Scanner;

public class testpeso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String m;
		double v;
		
		System.out.println("valor: ");
		v=sc.nextDouble();
		System.out.println("A que unidad es?");
		m=sc.next();
		
		peso dos= new peso(v,m);
		
		
		System.out.println(dos.getValor(m)+" en "+m);
	}

}
