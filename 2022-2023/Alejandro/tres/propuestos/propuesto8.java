package propuestos;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class propuesto8{

public static String decimalToRoman(int n){
    String rom="";
    do{
        if(n>=1000){
            rom+="M";
            n-=1000;
            System.out.println(rom);
        }
        if(n>=900){
            rom+="CM";
            n-=900;
            System.out.println(rom);
        }
        if(n>=500){
            rom+="D";
            n-=500;
            System.out.println(rom);
        }
        if(n>=400){
            rom+="CD";
            n-=400;
            System.out.println(rom);
        }
        while(n>=100){
            rom+="C";
            n-=100;
            System.out.println(rom);
        }
        while(n>=90){
            rom+="XC";
            n-=90;
            System.out.println(rom);
        }
        while(n>=50){
            rom+="L";
            n-=50;
            System.out.println(rom);
        }
        while(n>=40){
            rom+="XL";
            n-=40;
            System.out.println(rom);
        }
        while(n>=10){
            rom+="X";
            n-=10;
            System.out.println(rom);
        }
        while(n>=9){
            rom+="IX";
            n-=9;
            System.out.println(rom);
        }
        while (n>=5) {
            rom+="V";
            n-=5;
            System.out.println(rom);
        }
        while (n>=4) {
            rom+="IV";
            n-=4;
            System.out.println(rom);
        }
        while(n>=1){
            rom+="I";
            n-=1;
            System.out.println(rom);
        }
    }while(n!=0);
    return rom;
}
public static int romanToDecimal(String rom){
int n=0;
return n;
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=0;
    System.out.println("dame numero entero: ");
    n=sc.nextInt();
   
System.out.println("En romano: "+decimalToRoman(n));
}

}
