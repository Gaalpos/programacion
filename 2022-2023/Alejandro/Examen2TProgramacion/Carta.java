package Examen2TProgramacion;

public class Carta implements Comparable {

	String valor;
	String palo;

	String[] valores = { "a", "k", "q", "j", "diez", "nueve", "ocho", "siete", "seis", "cinco", "cuatro", "tres",
			"dos" };
	String[] palos = { "corazones", "diamantes", "picas", "treboles" };

	public String generaPalo() {
		int ind = (int) (Math.random() * 4);
		return palos[ind];
	}

	public String generaValor() {
		int ind = (int) (Math.random() * 12);
		return valores[ind];

	}

	public Carta() {
		this.valor = generaValor();
		this.palo = generaPalo();
	}

	public String getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (palo == null) {
			if (other.palo != null)
				return false;
		} else if (!palo.equals(other.palo))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		// son iguales si tienen el mismo palo y el mismo valor
		return true;
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		// primero por palo
		Carta car = (Carta) obj;

		// si son palos distintos ordena por palo
		if (!this.getPalo().equals(car.getPalo()))
			return this.getPalo().compareTo(car.getPalo());
		// si son del mismo palo ordena por valor
		else
			return this.getValor().compareTo(car.getValor());

	}

}
