import java.util.Scanner;


public class ejercicio19 {
    /*Dadas 6 notas, escribir la cantidad de alumnos aprobados,
condicionados (=4) y suspensos.*/ 

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double notas=0;
    int aprobados=0;
    int condicionados=0;
    int suspensos=0;
    
    for(int i=1;i<=6;i++) {
System.out.println("Dame la nota: ");
        notas=sc.nextDouble();
      


        if (notas>=5) {
            aprobados++;
        }

        else if (notas<4){
            suspensos++;
            
        } 
        
        else {
            condicionados++;
        }

    }

    System.out.println("Alumnos aprobados: "+aprobados);
    System.out.println("Alumnos condicionados: "+condicionados);
    System.out.println("Alumnos suspensos: "+suspensos);
}




}
