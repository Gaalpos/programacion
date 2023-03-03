package resueltos;

public class satelite {
//Introduzco las variables a utilizar. 
		private double meridiano;
		private double paralelo;
		private double distancia_tierra;
//creo un constructor satelite con las variables anteriores y le indico los tipos de valores que debe recoger para introducirlos en las variables.
		satelite (double m,double p,double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
		}
		//indico los valores por defecto de satelite
		satelite (){
		meridiano=paralelo=distancia_tierra=0;
		}
		//Creo el primer método para recoger los valores
		public void setPosicion(double m,double p,double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
		}
		//creo un metodo toString para usarlo en el test y así ver el valor de las variables
		public String toString() {
			return "satelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia_tierra=" + distancia_tierra + "]";
		
		}
		
		
		public void variaAltura(double desplazamiento) {
			
			distancia_tierra+=desplazamiento;
			
		}
		
		
		
		public boolean enOrbita() {
			
			if(distancia_tierra==0)
				{return false;}
			else
				{return true;}

		}

		
		public void variaCoordenadas(double variap, double variam) {
			
			paralelo+=variap;
			meridiano+=variam;
			
		}
		
		
	/*	public void variaposicion(double p, double m, double d) {
			
			paralelo+=p;
			meridiano+=m;
			distancia_tierra+=d;
		}*/
		public void variaposicion(double p, double m, double d) {
			variaCoordenadas(p,m);
			variaAltura(d);
			
		}
		
		
		
				}
