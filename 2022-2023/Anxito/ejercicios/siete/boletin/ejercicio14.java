package boletin;

import javax.swing.JOptionPane;

// 14. Leer dos series de 10 enteros, que estarán ordenados
// crecientemente. Copiar (fusionar) las dos tablas en una
// tercera, de forma que sigan ordenados.

public class ejercicio14 {
    
    public void ordenar(){
        int temp;		
        int[] valores = new int [10];
        
        for(byte i = 0;i < valores.length;i++){
            
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero :"));	
        }
        
        
        for(byte i = 0;i < valores.length/2;i++){
                    
            System.out.print(valores[i]);
            System.out.print(valores[9 - i]);
            
        }
                
            }
            
        /*	Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la
            forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.*/
            
            public void ordenar2(){
                
                int[] valores1 = new int [12];
                int[] valores2 = new int [12];
                int[] mezcla   = new int [24];
        for(byte i = 0; i < valores1.length;i++){
            
            valores1[i] =  (int) (Math.random() * 98);
            valores2[i] =  (int) (Math.random() * 98);
        
        System.out.println("valores1 [" + i + "] = " + valores1[i]);
        System.out.println("valores2 [" + i + "] = " + valores2[i]);
        
        }
        
        byte j = 0;
        byte i = 0;
        while(i < 12){
        
            //valores1
            for(byte k = 0 ; k < 3;k++){
                mezcla[j] = valores1[i + k];
                j++;
            }
            
            //valores2
            
            for(byte k = 0 ; k < 3;k++){
                mezcla[j] = valores2[i + k];
                j++;
            }
            
            i += 3;
            
            
        }
        
        
            for(byte k = 0; i < mezcla.length ;i++){
                
                
            System.out.println("mezcla [" + i + "] = " + mezcla[i]);
            
            }
        
            
            }
        
        /*	 Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en
             una tercera, de forma que sigan ordenados	*/
            
            public static void main (String[] args){
                
                Ordenar2 T = new Ordenar2();
                T.Ordenar2();
                
            }
            
            
            
        }


