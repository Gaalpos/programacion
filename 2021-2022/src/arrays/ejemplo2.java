package arrays;

import java.util.Arrays;

public class ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] uno = { 2.1, 9.5, 7.2, 1.3 };
		double[] dos = { 0.3, 0.5, 0.8, 0.9, };
		double[] suma = new double[4];

		if (uno.length == dos.length) {
			for (int k = 0; k < uno.length; k++) {
				suma[k] = uno[k] + dos[k];
				// System.out.println(suma[k]);
			}
			System.out.println("primer array");
			System.out.println(Arrays.toString(uno));
			System.out.println("segundo array");
			System.out.println(Arrays.toString(dos));
			System.out.println("array con la suma de las posiciones individuales");
			System.out.println(Arrays.toString(suma));
		}else {
			System.out.println("No se pueden sumar");
		}
	}

}
