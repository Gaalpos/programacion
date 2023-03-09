package resueltos;

/*Crea la clase peso, la cual tendrá las siguientes características:
Deberá tener un atributo donde se almacene el peso de un objeto en kilogramos.
En el constructor se le pasará el peso y la medida en la que se ha tomado (‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz
para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).
Deberá de tener los siguientes métodos:
getLibras. Devuelve el peso en libras.
getLingotes. Devuelve el peso en lingotes.
getPeso. Devuelve el peso en la medida que se pase como parámetro (‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz
para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).
Para la realización del ejercicio toma como referencia los siguientes datos:
1 Libra = 16 onzas = 453 gramos =0,453Kg.
1 Lingote = 32,17 libras = 14,59 kg.
1 Onza = 0,0625 libras = 28,35 gramos = 0,02835Kg.
1 Penique = 0,05 onzas = 1,55 gramos.
1 Quintal =100 libras = 43,3 kg.
Crea además un método main para testear y verificar los métodos de esta clase.*/



public class peso {

	double valor;//valor del peso en kg
	
	peso(double v,String medida){
		
		this.valor= v;

	}
	

	public double getValor(String medida) {
		double aux=0d;
		
		
		switch(medida) {
		
		case "libras":
			aux=valor/0.453;
			
			break;
		case "lingotes":
			aux=valor/14.59;
			
			break;
		case "onzas":
			aux=valor/0.02835;
			
			break;
		case "peniques":
			aux=valor/0.00155;
			
			break;
		case "kilos":
			aux=valor;
			
			break;
		case "gramos":
			aux=valor*1000;
			
			break;
		case "quintales":
			aux=valor/43.3;
			
			break;
			
			default: System.out.println("No existe esa unidad de medida");
		
		}
		return aux;
		
	}

	@Override
	public String toString() {
		return "peso [valor=" + valor + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
