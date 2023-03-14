import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GestionPersonal {


    static HashMap<Integer,String> gp= new HashMap<>();
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int opc=0;
        boolean seguir= true;
        do{
        System.out.println("Gestion de Personal");
        System.out.println("-------------------");
        System.out.println("seleccione una opcion: ");
        System.out.println("1   -   listar");
        System.out.println("2   -   añadir");
        System.out.println("3   -   modificar");
        System.out.println("4   -   borrar");
        System.out.println("5   -   salir");
        opc= Integer.parseInt(sc.nextLine());

        switch(opc){
            case(1): //lista
            for(Map.Entry pareja: gp.entrySet()){
                System.out.println(pareja);
            }
            break;
            case(2)://añadir
            System.out.println("introduce una clave");
            int clave = Integer.parseInt(sc.nextLine());
            if(gp.containsKey(clave)){
                System.out.println("clave ya existente");
            }
            else{
            System.out.println("Introduce nombre: ");
            String nombre= sc.nextLine();
            gp.put(clave, nombre);
            }
            break;

            case(3)://modificar
            System.out.println("introduce una clave");
            int claveM = Integer.parseInt(sc.nextLine());
            if(gp.containsKey(claveM)){
                System.out.println("valor actual: "+gp.get(claveM));
                System.out.println("Introduce nuevo valor");
                String nombreM= sc.nextLine();
                gp.put(claveM, nombreM);
            }
            else{
                System.out.println("clave no existente");
            }
            break;

            case(4)://borrar
            System.out.println("introduce un numero a borrar");
            int claveB = Integer.parseInt(sc.nextLine());
            gp.remove(claveB);
            break;
            
            case(5)://salir
            seguir=false;
            System.out.println("gracias por usar la gestion");
            break;
        }
    }
    while(seguir);
    
    }
}
