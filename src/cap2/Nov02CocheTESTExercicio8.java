package cap_dous;

public class Nov02CocheTESTExercicio8 {
/*Un coche non pode sobrepasar velocidade 120
  E non pode ir a velocidade menor ca 0 */
	public static void main(String[] args) {
			
			int vel=100;
			int seco=50;
			String brand="Mini";
			String model="Cooper";
			
			Nov02cocheExercicio8 uno = new Nov02cocheExercicio8();
			System.out.println(uno.toString());
			
			uno.acelera(15);
			System.out.println(uno.toString());
			
			uno.frena(35);
			System.out.println(uno.toString());
			
		System.out.println();
			
			Nov02cocheExercicio8 dos = new Nov02cocheExercicio8(vel,brand,model);
			System.out.println(dos.toString());
			
			dos.acelera(2*vel);
			System.out.println(dos.toString());
			
			dos.frena(seco);
			System.out.println(dos.toString());
	}
}