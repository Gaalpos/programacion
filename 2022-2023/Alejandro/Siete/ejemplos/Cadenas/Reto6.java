package Cadenas;

public class Reto6 {
    public static void main(String[] args) {
        String muylarga="National Aeronautics and Space Administration";

    String[] arr=muylarga.split(" ");
    String acronimo="";
    for(int i=0;i<arr.length;i++){
        if(arr[i].length()>3)
    acronimo+=arr[i].charAt(0);
    }
    System.out.println(acronimo);
    }
    
}
