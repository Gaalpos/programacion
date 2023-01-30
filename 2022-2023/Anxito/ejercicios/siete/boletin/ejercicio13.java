package boletin;
    
    import java.util.Arrays;

    /*
     * Leer 10 enteros. Guardar en otra tabla los elementos
    pares de la primera, y a continuación los elementos
    impares. Realizar dos versiones: una trabajando con los
    valores y otra trabajando con los índices.
     */
    public class ejercicio13 {
    
        public static void main(String[] args) {
            
            int[] array = {1,2,3,4,5,6,7,8,9,10 };
            System.out.println(Arrays.toString(array));
            
            int par=0,impar=0;
            for(int i=0;i<array.length;i++) {
                if(array[i]%2==0) par++;
                else impar++;
            }
            System.out.println("pares: "+par);
            System.out.println("impares: "+ impar);
            
            int[]pares =new int[par];
            int[]impares =new int[impar];
            System.out.println("Arrays vacíos");
            System.out.println(Arrays.toString(pares));
            System.out.println(Arrays.toString(impares));
            
            int j=0; //pares
            int k=0; //impares
            
            for(int i=0;i<array.length;i++) {
                if(array[i]%2==0) {
                    pares[j]=array[i];
                    j++;
                    //System.out.println(Arrays.toString(pares));
                }else {
                    impares[j]=array[i];
                    k++;
                    //System.out.println(Arrays.toString(pares));
                }
                
            }
            System.out.println("PARES");
            System.out.println(Arrays.toString(pares));
            System.out.println("IMPARES");
            System.out.println(Arrays.toString(impares));
        }
    }
    


