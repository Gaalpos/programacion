public class DNI {

    public char calcularLetra(int numeros) {
        int resto = numeros % 23;
        char[] letras = {'T','R','W','A','G','M','Y','F'
                    ,'P','D','X','B','N','J','Z','S','Q'
                    ,'V','H','L','C','K','E'};
        return letras[resto];
    }
       
    public boolean validar(String dni) {
       
        // Validar que el dni tenga 9 caracteres
        if( dni.length() != 9)
            return false;
       
        // Validar que el ultimo caracter sea una letra del alfabeto
        char ultimaLetra = dni.charAt(8);
       
        if( ! Character.isAlphabetic(ultimaLetra) )
            return false;
       
        //TODO Validar que la letra se al acorrecta
                                       
        return true;
    }
   
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
    }
 
 }
 
 