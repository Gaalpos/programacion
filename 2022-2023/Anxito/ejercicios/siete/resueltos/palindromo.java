package resueltos;

import java.util.Scanner;

public class palindromo {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String s=sc.nextLine();
        
        System.out.print(s);
        int fin = s.length()-1;
        int inicio=0;
        boolean espalin=true;
        
        while(inicio < fin){
            if(s.charAt(inicio)!=s.charAt(fin)){
                espalin=false;
            }
        inicio++;
        fin--;
        }
        if(espalin)
            System.out.print("\nEs palindromo.");
        else
            System.out.print("\nNo es palindromo.");
        
    }
}
