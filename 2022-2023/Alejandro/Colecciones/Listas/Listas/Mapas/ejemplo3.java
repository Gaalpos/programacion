import java.util.HashMap;
import java.util.Scanner;

public class ejemplo3 {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//declaramos un mapa
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		
		//metodo para añadir parejas al map
		m.put(924, "Amalia Núñez");
		m.put(921, "Cindy Nero");
		m.put(700, "César Vázquez");
		m.put(219, "Víctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");

        System.out.println("Por favor, introduzca codigo");
        int codigo= Integer.parseInt(sc.nextLine());
        if(m.containsKey(codigo)){
            System.out.println("El codigo "+codigo+" corresponde a ");
            System.out.println(m.get(codigo));
        } 
        else{
            System.out.println("El codigo introducido no existe");
        }
}
}
