package cap3;

import java.util.Arrays;

public class propuesto10VampA {
	final static int START = 11, END = 999999;
	
    public static void main(String[] args){
    
    	//dos array de caracteres 
    	char[] kChar, checkChar;
        //dos cadenas
    	String kStr, checkStr;
        int k;
        
        for(int i=START; i<END; i++) {
                for(int i1=i; i1<1000; i1++) {

                    k = i * i1;

                    kStr = Integer.toString(k);
                    checkStr = Integer.toString(i) + Integer.toString(i1);


                    kChar = kStr.toCharArray();
                    checkChar = checkStr.toCharArray();

                    Arrays.sort(kChar);
                    Arrays.sort(checkChar);

                    if(Arrays.equals(  kChar, checkChar) ) {
                        System.out.println(i + " * " + i1 + " = " + k);
                    }
                }
            }
    }
}
