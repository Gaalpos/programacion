package cap2;

public class Cochito {
		private int km;
		private int antiguedad;
		private String marca;

		public Cochito(int km, int antiguedad, String marca) {
			this.km = km;
			this.antiguedad = antiguedad;
			this.marca = marca;
		}

		public Cochito(int km, String marca) {
			this.km = km;
			this.marca = marca;
		}
		
		

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public int getKm() {
			return km;
		}

		public int getAntiguedad() {
			return antiguedad;
		}

		@Override
		public String toString() {
			return "coche [km=" + km + ", antiguedad=" + antiguedad + ", marca=" + marca + "]";
		}

	
}
