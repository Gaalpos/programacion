public class PasarMayusculas {

   public static void main(String[] args) {
       PasarMayusculas programa = new PasarMayusculas();
       programa.iniciar();
   }
  
   public void iniciar() {
       String texto = "hola";
       String resultado = convertirAMayusculas(texto);
       System.out.println(resultado);
   }
  
   public String convertirAMayusculas(String texto) {
       return texto.toUpperCase().trim();
   }
}