package propuesto89;
public class prueba{

String nombre;
public Prueba(String n){
   this.nombre=n;
}
public void primero(){
    System.out.println("has llamado al primer método");
}

public void segundo(){
    System.out.println("Primera llamada");
    primero();
    System.out.println("Segunda llamada");
    this.primero();
}

public static void main(String[] args) {
    
Prueba p= new Prueba("Estamos creando un objeto para llamar a los métodos")

p.segundo;


}

}
