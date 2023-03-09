// public class Videoclub {

// }

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

abstract class Pelicula {
    float precio;
    // String tipo = "Normal"; // normal, estreno, clasica
    String titulo;
    String sinopsis;

    abstract float getPrecio();
}

class Alquiler {
    Pelicula pelicula;
    LocalDate fechaAlquiler = LocalDate.now();

    long getDiasAlquiler() {
        LocalDate fechaActual = LocalDate.now(); // fecha actual
        return DAYS.between(fechaAlquiler, fechaActual);
    }
}

class Direccion {
    String calle;
    String piso;
    String letra;
    String cp;

}

class Cliente {
    String nombre;
    String telefono;
    Direccion direccion;

    Alquiler[] alquileres;

    float calculaTotalAlquiler(Alquiler alquiler) {
        float recargo = 0;
        float precioPelicula = 0;

        // Calcular recargo por días alquilado
        if (alquiler.getDiasAlquiler() <= 7) {
            recargo = 0;
        }
        if (alquiler.getDiasAlquiler() >= 8 && alquiler.getDiasAlquiler() < 20) {
            recargo = alquiler.getDiasAlquiler() * 10;
        }
        if (alquiler.getDiasAlquiler() > 20) {
            recargo = 250;
        }
    }

        precioPelicula = alquiler.pelicula.getPrecio();

        class PeliculaNormal extends Pelicula {
            float getPrecio() {
                return precio;
            }

        }

        class PeliculaEstreno extends Pelicula {
            float getPrecio() {
                return precio * 2;
            }
        }

        class PeliculaClasica extends Pelicula {
            float getPrecio() {
                return precio * 4;
            }
        }    
    // // Calculo precio pelicula
    // if (alquiler.pelicula.tipo == "Clasica") {
    // precioPelicula = alquiler.pelicula.precio * 1;
    // }
    // if (alquiler.pelicula.tipo == "Normal") {
    // precioPelicula = alquiler.pelicula.precio * 2;
    // }
    // if (alquiler.pelicula.tipo == "Estreno") {
    // precioPelicula = alquiler.pelicula.precio * 4;
    // }
    // return recargo + precioPelicula;

    // float calcularTotalAlquileres() {
    // float total = 0;
    // for (Alquiler al : alquileres) {
    // total += calculaTotalAlquiler(al);
    // }
    // return total;
    // }

    // Un cliente es moroso si tiene algún alquier de más de 20 días
    boolean esMoroso() {
        boolean moroso = false;
        for (Alquiler al : alquileres) {
            if (al.getDiasAlquiler() > 20) {
                moroso = true;
            }
        }
        return moroso;
    }

}
