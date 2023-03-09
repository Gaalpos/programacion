package viernes27;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class CartaN  implements Comparable{
	    // necesito implementar un equals
		// necesito implementar un compareTo
		// enum Palo {OROS,COPAS,ESPADAS,BASTOS}
		// enum Valor {AS,DOS,TRES,CUATRO,CINCO,SEIS,SIETE,SOTA,CABALLO,REY}

	
		String palo;
		String valor;

		static Map<String,Integer> map = new TreeMap<>();
		
		static void rellenaMapa(){
			map.put("AS", 1);
			map.put("DOS", 2);
			map.put("TRES", 3);
			map.put("CUATRO", 4);
			map.put("CINCO", 5);
			map.put("SEIS", 6);
			map.put("SIETE", 7);
			map.put("SOTA", 10);
			map.put("CABALLO", 11);
			map.put("REY", 12);
		}
		
		CartaN() {
			this.palo = generaPalo();
			this.valor = generaValor();
			rellenaMapa();
		}

		CartaN(String palo, String valor) {
			this.palo = palo;
			this.valor = valor;
		}

		public String getPalo() {
			return palo;
		}

		public String getValor() {
			return valor;
		}

		@Override
		public String toString() {
			return "CartaN [palo=" + palo + ", valor=" + valor + "]";
		}

		public static String generaPalo() {
			String p = null;
			Random r = new Random();
			int n = 1 + r.nextInt(4 - 0);
			switch (n) {
			case 1:
				p = "OROS";
				break;
			case 2:
				p = "COPAS";
				break;
			case 3:
				p = "ESPADAS";
				break;
			case 4:
				p = "BASTOS";
				break;
			}
			return p;
		}

		private String generaValor() {
			String v = null;
			Random r = new Random();
			int n = 1 + r.nextInt(10 - 0);
			switch (n) {

			case 1:
				v = "AS";
				break;
			case 2:
				v = "DOS";
				break;
			case 3:
				v = "TRES";
				break;
			case 4:
				v = "CUATRO";
				break;
			case 5:
				v = "CINCO";
				break;
			case 6:
				v = "SEIS";
				break;
			case 7:
				v = "SIETE";
				break;
			case 8:
				v = "SOTA";
				break;
			case 9:
				v = "CABALLO";
				break;
			case 10:
				v = "REY";
				break;
			}
			return v;
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
			CartaN other = (CartaN) obj;

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
			return true;
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			CartaN c = (CartaN) o;
			if ((this.palo.compareTo(c.palo)) == 0)
				
				return    //por valor NUMERICO
						  map.get(this.valor).compareTo(map.get(c.valor));
			else
				return (this.palo).compareTo(c.palo);
		}

}