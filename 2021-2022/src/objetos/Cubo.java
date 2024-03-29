package objetos;

public class Cubo {

	// atributos ////////////////////////////
	int capacidad; // capacidad m�xima en litros
	int contenido; // contenido actual en litros

	// m�todos //////////////////////////////
	// constructor
	Cubo(int c) {
		this.capacidad = c;
	}

	// m�todos getter
	int getCapacidad() {
		return this.capacidad;
	}

	int getContenido() {
		return this.contenido;
	}

	// m�todo setter
	void setContenido(int litros) {
		this.contenido = litros;
	}

	// otros m�todos
	void vacia() {
		this.contenido = 0;
	}

	/**
	 * Llena el cubo al m�ximo de su capacidad.
	 */
	void llena() {
		this.contenido = this.capacidad;
	}

	/**
	 * Pinta el cubo en la pantalla. Se muestran los bordes del cubo con el car�cter
	 * # y el agua que contiene con el car�cter ~.
	 */
	void pinta() {
		for (int nivel = this.capacidad; nivel > 0; nivel--) {
			if (this.contenido >= nivel) {
				System.out.println("#~~~~#");
			} else {
				System.out.println("#    #");
			}
		}
		System.out.println("######");
	}

	/**
	* Vuelca el contenido de un cubo sobre otro.
	* Antes de echar el agua se comprueba cu�nto le cabe al
	* cubo destino.
	*/
	void vuelcaEn(Cubo destino) {
	
	int libres = destino.getCapacidad() - destino.getContenido();
	if (libres > 0) {
	if (this.contenido <= libres) {
	destino.setContenido(destino.getContenido() + this.contenido);
	this.vacia();
	} else {
	this.contenido -= libres;
	destino.llena();
	}
	}
	}
}