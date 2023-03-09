

import java.util.Scanner;


public class ejercicio18 {

/*Igual que el anterior pero suponiendo que no se introduce el
precio por litro. Solo existen tres productos con precios:
1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.*/ 

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int codigo=0;
    double cantidad=0;
    double precio=0;
    double total=0;
    double cantidadde1=0;
    int mayores=0;
    for(int i=1;i<=5;i++) {
    System.out.println("Dame el código del artículo(1,2,3): ");
    codigo=sc.nextInt();
        
        switch (codigo) {
            case 1:
            precio=0.6;
                break;
            case 2:
            precio=3;
                break;
            case 3:
            precio=1.25;
                break;
        
            default:
                break;
        }
    
 
    if(i==1) {
    System.out.println("Dame la cantidad vendida en litros: ");
    cantidad=sc.nextInt();
    cantidadde1=cantidad;
    }
    else {
        System.out.println("Dame la cantidad vendida en litros: ");
        cantidad=sc.nextInt();
    }
    
    
    
    total+=cantidad*precio;
    if(cantidad*precio>600) {
        mayores++;
    }
    
    }
    

    System.out.println("La facturación total es: "+total);
    System.out.println("La cantidad de litros del artículo 1 es: "+cantidadde1);
    System.out.println("Facturas de mas de 600€: "+mayores);


}}
