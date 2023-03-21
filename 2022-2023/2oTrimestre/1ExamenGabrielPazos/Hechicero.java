public class Hechicero {

    String nombre;
    static int nivel;
    static float destreza;
    float mana;
    private boolean preparado = true;

    boolean puedeLanzarHechizo() {
        if (preparado) {
            if (mana > 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Hechicero(String nombre, int nivel, double d, float mana, boolean preparado) {
        this.nombre = nombre;
        Hechicero.nivel = nivel;
        Hechicero.destreza = (float) d;
        this.mana = mana;
        this.preparado = preparado;
    }
}
