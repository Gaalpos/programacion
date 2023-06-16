class ProyectilNormal extends Proyectil{

    public ProyectilNormal(float calibre, float potenciaInicio, int calidad) {
        super(calibre, potenciaInicio, calidad);
    }

    public float calculaDamage(){
        return  potenciaInicio * calibre + calidad;
    }

}
class ProyectilIncendiario extends Proyectil{

    public ProyectilIncendiario(float calibre, float potenciaInicio, int calidad) {
        super(calibre, potenciaInicio, calidad);
    }

    public float calculaDamage(){
        return potenciaInicio * 8 * calibre+calidad;
    }
    
}
class ProyectilPlata extends Proyectil{

    public ProyectilPlata(float calibre, float potenciaInicio, int calidad) {
        super(calibre, potenciaInicio, calidad);
    }

    public float calculaDamage(){
        return potenciaInicio * 20 * calibre+calidad;
    }

  
    
}


class Proyectil {
   
    float calibre=100; 
    float potenciaInicio = 40;
    int calidad = 10;
    private boolean gastado = false;
    
 
    public Proyectil(float calibre, float potenciaInicio, int calidad) {
        this.calibre = calibre;
        this.potenciaInicio = potenciaInicio;
        this.calidad = calidad;
    }



    boolean estaUsado(){
       if (gastado == true)
        return true;
        else
        return false;
    }

    void usar(){
        gastado = true;
    }
 
}

// enum TipoProyectil {NORMAL, INCENDIARIO, PLATA};
//TipoProyectil tipoBala;
   // ;
