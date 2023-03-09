import java.util.Arrays;

public class Principal {

	public static float add(float n1, float n2) {
		return n1 + n2;
	}

	public static char getFirstCharacterInUpperCase(String text) {
		if(text== null)
			return 0;
		if (text.equals(""))
			return 0;
		
		char FirstCharacter = text.charAt(0);
		return Character.toUpperCase(FirstCharacter);

	}

	public static float sum(float[] numberList) {
		
		if (numberList == null) return 0;
		float acum = 0;
		for (int i = 0; i < numberList.length; i++) {
			acum = acum + numberList[i];
		}
		return acum;
		
		
		
	}
	
	public static int getLargestValue(int [] numberList) {
		if (numberList == null) return 0;
		if (numberList.length == 0) return 0;
		int n = numberList[0];
		for (int i=1; i<numberList.length; i++) {
			if (numberList[i]>n) 
				n = numberList[i];
		}
		
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numberList = {5, 8, 0,88};
		
		
	}

}
