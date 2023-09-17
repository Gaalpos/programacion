public class Felino {
private nombre;
private String especie;
private int edad;
private String colorPelaje;
protected static int numeroEjemplares;
private int id;
public Felino (String esp, int ed, String color){
especie = esp;
edad = ed;
colorPelaje = color;
numeroEjemplares++;
id = numeroEjemplares;
}
public Felino (){
this ("indeterminado",0,"indeterminado");
}
}
