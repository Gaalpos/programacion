package vehiculos;

import java.util.Random;

public class matricula2 {
	
	private static String generaMatricula()
	  {
	    //Letras válidas para matrícula
	    char[] array = {'B', 'C',
	                    'D', 'F', 'G', 'H', 'J', 'K', 'L', 
	                    'M', 'N', 'P', 'R', 'S', 'T', 'V', 
	                    'W', 'X', 'Y', 'Z'};

	    String matricula = "";

	    for (int i=0; i<7; i++){
	      Random rnd = new Random();
	      int ale = (int)(rnd.nextDouble() * array.length); //Aleatorio para la letra
	      int ale2 = (int)(rnd.nextDouble() * 10); //Aleatorio entre 0-9
	      if (i>3) {
	        matricula += array[ale];
	      } else {
	        matricula +=  ale2;
	      }
	    }

	    return matricula;

	  }

}
