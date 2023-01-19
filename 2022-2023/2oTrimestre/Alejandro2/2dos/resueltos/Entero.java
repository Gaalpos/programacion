package resueltos;

public class Entero {
	
    //Atributo
        int valor=0;
        
    //Constructor por defecto que inicializa a 0 el valor interno.
        Entero() {
        
    valor=0;
        }

    //Constructor que inicializa el valor interno.
        Entero(int pon) {
        valor=pon;

        }

    //Varios metodos
   
    //Método añade que permite sumarle un número al valor interno.
    public int suma(int pon) {
		return valor=+pon;

	}
    
   // Método resta que resta un número al valor interno.
    public int resta(int quita) {
		return valor=-quita;

	}

    //Método getDoble. Devuelve el doble del valor interno.

    public  int doble() {
		return valor*2;

	}


    //Método getTriple. Devuelve el triple del valor interno.
	public  int triple() {
	return valor*3;
	}




                public String toString(){
                    return "Entero [valor=" + valor + "]";
                }
//Método getValor. Devuelve el valor interno.------->Getter
                public int getValor() {
                    return valor;
                }
//Método setNumero. Inicializa de nuevo el valor interno.------------>Setter
                public void setValor(int valor) {
                    this.valor = valor;
                }
}

