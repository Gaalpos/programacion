package Ficheros;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;

public class EjemploFlujos{
	
	
	public static void main(String[] args) {
		
		String s = new String ("En un lugar de la mancha, de cuyo nomnbre no quiero acordarme");
		s=s+"no ha mucho tiempo vivia un hidalgo de los de lanza en el astillero";
		s=s+" adarga antigia, rocin flaco y galgo corredor";
		char [] arr = new char [s.length()];
		int car = 0;
		StringReader flujoInput = new StringReader(s);
		CharArrayWriter	flujoOutput = new CharArrayWriter();
		
		try {
			while((car=flujoInput.read( ))!=-1) {
				flujoOutput.write(car);
				
			}
			arr=flujoOutput.toCharArray();
			System.out.println(arr);
		}catch(IOException e){
			e.printStackTrace();
		}
		finally {
			flujoInput.close();
			flujoOutput.close();
		}
	}
}
