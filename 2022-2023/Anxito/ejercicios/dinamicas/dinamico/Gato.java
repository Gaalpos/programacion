package dinamico;

    public class Gato implements Comparable<Gato> { 
        private String nombre; 
        private String color; 
        private String raza; 
        private int edad;

        public Gato() {
            nombre="anonimo";
            color="";
            raza="";
        
        }

        public Gato(String nombre, String color, String raza, int edad) { 
        this.nombre = nombre; 
        this.color = color; 
        this.raza = raza; 
        this.edad=edad;
        } 

        public int getEdad() {
            return edad;
        }

        public void setEdad() {
            this.edad=edad;
        }

        public String getNombre() { 
        return nombre; 
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

        public String getRaza() { 
        return raza; 
        } 

        public String getColor() {
            return color;
        }

        

        public String toString() { 
        return "Gato: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza + "\nEdad: "+this.edad; 
        } 

        //ESTOS DOS METODOS LOS TENEMOS QUE ESCRIBIR NOSOTROS
         public int compareTo(Gato g) { 
            if(this.edad==g.getEdad())
            return (this.nombre).compareTo(g.getNombre());
        else
            return -(this.edad - g.getEdad()); 
        } 



        public boolean equals(Gato g) { 
        return (this.nombre).equals(g.getNombre()); 
        } 
    } 
        

