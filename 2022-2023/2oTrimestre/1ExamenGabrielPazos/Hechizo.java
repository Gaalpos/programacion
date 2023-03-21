class Transformacion extends Hechizo{
   
    String nombre = "Transformacion"; 
    float danno= Hechicero.nivel * 2 +Hechicero.destreza; 

     public Transformacion(String nombre, String descripcion, float dannobase) {
        super(nombre, descripcion, dannobase);
        //TODO Auto-generated constructor stub
    }

}

class Encantamiento extends Hechizo{
   
    String nombre = "Encantamiento"; 
    float danno= Hechicero.nivel * 2 +Hechicero.destreza; 

    public Encantamiento(String nombre, String descripcion, float dannobase) {
        super(nombre, descripcion, dannobase);
        //TODO Auto-generated constructor stub
    }
}
class Embrujo extends Hechizo{
   
    String nombre = "Embrujo"; 
    float danno= Hechicero.nivel * 1 +Hechicero.destreza; 

    public Embrujo(String nombre, String descripcion, float dannobase) {
        super(nombre, descripcion, dannobase);
        //TODO Auto-generated constructor stub
    }
}
class Malefico extends Hechizo{
  
    String nombre = "malefico"; 
    float danno= Hechicero.nivel * 2 + Hechicero.destreza;
    
    public Malefico(String nombre, String descripcion, float dannobase) {
        super(nombre, descripcion, dannobase);
        //TODO Auto-generated constructor stub
    }
}



public class Hechizo {

    String nombre = "default"; 
    String descripcion; 
    float Dannobase = 0;

    
    public Hechizo(String nombre, String descripcion, float dannobase) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        Dannobase = dannobase;
    }
 
 }
 