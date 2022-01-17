package arrays;

import java.util.Arrays;

public class reto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		it cont=0;
		int []pares=new int[100];
		pares[0] = 0;
		for (int i=0;i<pares.length;i++) {
			pares[i] = pares [i]+ 2;
		}
		System.out.println(Arrays.toString(pares));
	}

}
