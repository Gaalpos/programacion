package Ejemplo2;

public class Votacion {
    //ATRIBUTOS DE OBJETO O INSTNCIA
// Persona a la que se vota en esta instancia y el numero
// de votos que lleva
private String Persona = null;
private int Votos = 0;

// ATRIBUTOS DE CLASE
// Persona mas votada de todas las instancias y el numero
// de votos que lleva
static private int VotosMasVotado = 0;
static private String PersonaMasVotada = null;

// Constructor
Votacion (String Persona) {
this.Persona = Persona;
this.Votos=0;
}

//METODO DE OBJETO
// Se invoca cada vez que alguien vota a Persona
public void Voto() {
Votos++;
if (Votos > VotosMasVotado) {
PersonaMasVotada = Persona;
VotosMasVotado = Votos;
}
}

// Devuelve el nombre de Persona
public String getPersona() {
return Persona;
}

// Devuelve el numero de votos de Persona
public int getVotos() {
return Votos;
}

// Devuelve el nombre de la persona mas votada
static public String NombreDelMasVotado() {
return PersonaMasVotada;
}

// Devuelve el numero de votos de la persona mas votada
static public int VotosDelMasVotado() {
return VotosMasVotado;
}

static String showItToMe(){
    return Votacion.NombreDelMasVotado() + ": "+ Votacion.VotosDelMasVotado();
}

@Override
public String toString() {
    return "Votacion [Persona=" + Persona + ", Votos=" + Votos + "]";
}


}
