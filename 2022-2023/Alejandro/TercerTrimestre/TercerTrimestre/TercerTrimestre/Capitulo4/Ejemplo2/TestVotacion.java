package Ejemplo2;

import java.util.Scanner;

public class TestVotacion {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        char voto;
        System.out.println("Inicio de Votacion");
        Votacion.showItToMe();
        
        // Tenemos tres candidatos en esta votacion
        Votacion Juan = new Votacion ("Juan Peire");
        Votacion Ana = new Votacion ("Ana Garcia");
        Votacion Adela = new Votacion ("Adela Sancho");
        
         // empieza la votacion
        do {
            System.out.println("Vota: J para Juan, An para Ana, A para LAPUTA Adela / X para salir");
             voto= sc.nextLine();
             switch(voto){
                case 'J'{

                }
             }
        } while (voto!="X");

        Juan.Voto(); Ana.Voto(); Ana.Voto(); Ana.Voto();
        Adela.Voto();
        System.out.println (Votacion.NombreDelMasVotado() + ": "+ Votacion.VotosDelMasVotado());
        
        Juan.Voto(); Juan.Voto(); Juan.Voto(); Adela.Voto();
        System.out.println (Votacion.NombreDelMasVotado() + ": "+ Votacion.VotosDelMasVotado());
        
        Adela.Voto(); Adela.Voto(); Ana.Voto(); Ana.Voto();

        /*System.out.println("Lo que dicen los objetos");
        System.out.println(Juan.toString());
        System.out.println(Ana.toString());
        System.out.println(Adela.toString());*/


        System.out.println("Fin Votacion: RESULTADO -----> lo que dice la clase");
        System.out.println (Votacion.NombreDelMasVotado() + ": "+ Votacion.VotosDelMasVotado());


      
        
        }
}
