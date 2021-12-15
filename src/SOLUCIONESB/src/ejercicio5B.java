
public class ejercicio5B {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < i; j++) {
				if (j == sumaDivisores(i) && i == sumaDivisores(j)) {
					System.out.println(i + "-son amigos-" + j);
				}
			}
		}
	}

	public static int sumaDivisores(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
