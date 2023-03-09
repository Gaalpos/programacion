package dinamicas;

import java.util.ArrayList;

public class Gato implements Comparable<Gato> {
    private String nombre;
    private String color;
    private String raza;
    private int edad;

    public Gato() {
        nombre = "anonimo";
        color = "";
        raza = "";
        edad = 0;
    }

    public Gato(String nombre, String color, String raza, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", edad=" + edad + "]";
    }

    public int compareTo(Gato g) {
        if (this.edad == g.getEdad()) {
            return (this.nombre).compareTo(g.getNombre());
        } else {
            return -(this.edad - g.getEdad());

        }
    }

    public boolean equals(Gato g) {

        return (this.nombre).equals(g.getNombre());
    }
}
