package intro;

	public class rectangulo extends figura implements areaFigura, perimetroFigura  {
		
		
		private String nombre;
		private int ancho=0;
		private int alto=0;
		
		rectangulo(int an, int al, String nombre){
			super();
			this.ancho=an;
			this.alto=al;
			this.nombre=nombre;
		}
		
		/*no se vale repetir int int y String
		rectangulo(intal, int an, String nombre){
		}*/
		
		rectangulo(){
			this.ancho=0;
			this.alto=0;
			this.nombre="";
		}
		
		rectangulo(int dato){
			this.alto=this.ancho=dato;
		}
		//Constructor de copia
		
		rectangulo(rectangulo r){
			this.ancho= r.getAncho();
			this.alto= r.getAlto();
			this.nombre= r.getNombre();
		}
		
		public String getNombre() {
			return this.nombre;
		}
		public void setNombre(String n){
			String nombre=n;
		}
		
		public int getAncho(){
			return this.ancho;
		}
		
		public int getAlto(){
			return this.alto;
		}
		
		public rectangulo inrementarAncho() {
			this.ancho++;
			return this;
		}
		
		public rectangulo inrementarAlto() {
			this.alto++;
			return this;
		}

		@Override
		public String toString() {
			return "rectangulo [ancho=" + ancho + ", alto=" + alto + ", nombre="+ nombre+ "] ";
		}
		
		//como deseamos calcular areas de rectangulo
		//tendre que escribir este metodo adaptado a un rectangulo

		@Override
		public int area() {
			
			return this.alto*this.ancho;
		}
		
		@Override
		public double perimetro() {
			
			return 2*alto+2*ancho;
		}
		
	}
	
	

