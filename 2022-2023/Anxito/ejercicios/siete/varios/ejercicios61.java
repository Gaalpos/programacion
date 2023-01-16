
import java.util.Arrays;

public class ejercicios61 {

	public static void main(String[] args) {

		// opc1 enters arrDig1 ---> 0 hasta 9

		int[] arrDig1 = new int[10];
		for (int i = 0; i < arrDig1.length; i++) {
			arrDig1[i] = i;

		}

		System.out.println(Arrays.toString(arrDig1));

		// opc2 arDig2 ---> 9 hasta 0
		int[] arrDig2 = new int[10];
		for (int i = 0; i < arrDig2.length; i++) {
			arrDig2[i] = (arrDig2.length - 1) - i;

		}

		System.out.println(Arrays.toString(arrDig2));

		char[] arrCh1 = { 'a', 'e', 'i', 'o', 'u' };
		System.out.println(Arrays.toString(arrCh1));

		char[] arrCh2 = new char[5];
		for (int j = 0; j < arrCh2.length; j++) {
			arrCh2[j] = (char) (97 + j);
		}
		System.out.println(Arrays.toString(arrCh2));
	}

}