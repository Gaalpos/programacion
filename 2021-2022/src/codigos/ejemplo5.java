package codigos;

public class ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 2, n = 5;
		boolean res;
		res = (m > n) && (m >= n);// res=false
		System.out.println("el resultado es " + res);

		res = !((m < n) || (m != n));// res=false
		System.out.println("el resultado es " + res);
	}

}
