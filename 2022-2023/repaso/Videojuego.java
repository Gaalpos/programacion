public class Videojuego extends Producto {
    enum Estilo {accion, deportes, aventuras, puzzle, infantil};
    enum Plataforma {xbox, playstation, pc, nintendoSwitch};

    private Estilo estilo;
    private Plataforma plataforma;


    public Videojuego(Videojuego.Estilo estilo, Videojuego.Plataforma plataforma) {
        this.estilo = estilo;
        this.plataforma = plataforma;
    }

    public Videojuego(String titulo, double precio, int plazoDias, boolean alquilado, Videojuego.Estilo estilo,
            Videojuego.Plataforma plataforma) {
        super(titulo, precio, plazoDias, alquilado);
        this.estilo = estilo;
        this.plataforma = plataforma;
    }
    
    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    

    @Override
    public String toString() {
        return "Videojuego []";
    };
    
    
}
