/* Crea una clase llamada Libro que guarde la información de cada uno de los libros
 * de una biblioteca. La clase debe guardar el título del libro, autor, 
 * número de ejemplares del libro y número de ejemplares prestados.
 * Además, contendrá: Constructor por defecto. Constructor con parámetros. 
 * Métodos setters/getters. Método toString.
 * Método préstamo que incremente el atributo correspondiente cada vez que se realice
 * un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
 * disponibles para prestar. Devuelve true si se ha podido realizar la operación
 * y false en caso contrario.
 * Método devolución que decremente el atributo correspondiente cuando se produzca
 * la devolución de un libro. No se podrán devolver libros que no se hayan prestado.
 * Devuelve true si se ha podido realizar la operación y false en caso contrario.
 *
 * Utilícela creando al menos tres libros que prueben los métodos.*/

public class libro {
	// Variables
		String titulo, autor;
		int numEjemplares, numPrestados;

		// Constructor por defecto
		libro() {
			titulo = "";
			autor = "";
			numEjemplares = 0;
			numPrestados = 0;
		}

		// Constructor con parámetros
		public libro(String titulo, String autor, int numEjemplares) {
			this.titulo = titulo;
			this.autor = autor;
			this.numEjemplares = numEjemplares;
			this.numPrestados = 0;
		}

		// Getters & Setters
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public int getNumEjemplares() {
			return numEjemplares;
		}

		public void setNumEjemplares(int numEjemplares) {
			this.numEjemplares = numEjemplares;
		}

		public int getNumPrestados() {
			return numPrestados;
		}

		public void setNumPrestados(int numPrestados) {
			this.numPrestados = numPrestados;
		}

		// ToString
		@Override
		public String toString() {
			return "Libro [titulo=" + titulo + ", autor=" + autor + ", numEjemplares=" + numEjemplares + ", numPrestados="
					+ numPrestados + "]";
		}

		// Método Prestamo
		public boolean Prestamo() {
			if (numEjemplares < 1) {
				return false;
			} else {
				numPrestados++;
				numEjemplares--;
				return true;
			}
		}

		// Método Devolución
		public boolean Devolucion() {
			if (numPrestados < 1) {
				return false;
			} else {
				numPrestados--;
				numEjemplares++;
				return true;
			}
		}
}
