package resueltos;

public class resuelto2 {

	

		
	
			private int velocidad;
			resuelto2(){velocidad=0;}
			
			public int getVelocidad() {
				return this.velocidad;
			}
			
			public void  acelerar(int parametro) {
				velocidad+=parametro;
				
			}
			
			
			public void frenar(int anonimo) {
				velocidad-=anonimo;
				
			}

			public String toString() {
				return "coche [velocidad=" + velocidad + "]";
			}
			
			
			
			
			
			
		
	}


