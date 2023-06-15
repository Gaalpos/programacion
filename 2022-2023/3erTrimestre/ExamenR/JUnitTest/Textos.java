public class Textos {

   public static void main(String[] args) {
       Textos programa = new Textos();
       programa.iniciar();
   }
  
   public void iniciar() {
       String texto = "cebem";
       System.out.println( obtenerPrimerCaracter(texto) );
      
   }
  
   public char obtenerPrimerCaracter(String cadena) {
       if(cadena == null || cadena.isEmpty() == true) {
           return 0;
       }
       return cadena.charAt(0);
   }

   public boolean cadenaVacia(String cadena) {
       if(cadena == null || cadena.length() == 0) {
           return true;
       }else {
           return false;
       }
   }

   public char obtenerUltimoCaracter(String cadena) {
       //TODO falta terminar
       return 'a';
   }
  
   public String borrarCaracteresPares(String cadena) {
       //TODO falta terminar
       return "bla bla bla";
   }
  
   public String pasarAMayusculasCaracteresImpares(String cadena) {
       //TODO falta terminar
       return "bla bla bla";
   }
  
   // "hola soy angel"  -->   ["hola", "soy", "angel"]
   public String[] separaTexto(String cadena, String separador) {
       //TODO falta terminar
       return new String['a'];
   }
}



