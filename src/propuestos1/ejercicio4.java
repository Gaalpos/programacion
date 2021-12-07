package propuestos1;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int t=0;
		
		System.out.println("A vale "+a);
		System.out.println("B vale "+b);
		System.out.println("C vale "+c);
		System.out.println("D vale "+d);
		
		
		t=b;
		b=c;
		System.out.println("Ahora B vale:" +b);
		c=a;
		System.out.println("Ahora C vale:" +c);
		a=d;
		System.out.println("Ahora A vale:" +a);
		b=t;
		d=b;
		System.out.println("Ahora D vale:" +b);
	}

}
