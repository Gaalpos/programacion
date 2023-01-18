package propuesto89;

public class Bebe {
    

//COMO UN CONSTRUCTOR LLAMA A OTRO


Bebe(int i){
    //this y entre () llamar a una cadena??????????
    //construir un objeto haciendo una llamada a otro constructor
    this("Soy un bebe consentido");
    System.out.println("hola tengo "+i+" meses");
}

Bebe(String s){
    System.out.println(s);
}

void berrea(){
    System.out.println("buaaaaaaaaaaaaaaaaaaaaaa");
}

public static void main(String[] args) {
    //Uno no crea una referencia para manipular el objeto creado
   /*Bebe conBigote= new Bebe(8);
    conBigote.berrea(); */ 

    /*Así estaría ya creado
    new Bebe(8);*/

    new Bebe(8).berrea();
    //Soy consentido
    //Tengo 8 meses
    //buaaaaaaaaaaaaaaaaaa


}

}
