abstract class jugador{
    protected int golpeBase;
    private String tipo;
    private int resistencia;
     public int calcularGolpe(jugador atacado){
        return golpeBase / atacado.resistencia;
 }
}
