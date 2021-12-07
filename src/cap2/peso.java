package cap2;

public class peso {

	// atributos
	double cantidad;
	//String=unidad; //sobra este atributo
	

	// constructor
	peso(double c, String u){
		  this.cantidad=pesoKilos(c,u); 
		//  this.unidad="kilos"; // sobra
		
	}
	
	/* NECESITO SEIS METODOS: GETGRAMOS, GETLINGOTES,

*/
	public double pesoKilos(double c, String u) {
		double normal = 0;

		switch (u) {

		case ("lingotes"):
			normal = 14.59 * c;
			break;
		case ("libras"):
			normal = 0.453 * c;
		break;

		case ("gramos"):
			normal = c/1000;
		break;
		case ("onzas"):
			normal = 28.35 * c/1000;
		break;
		case ("peniques"):
			normal = 1.55 * c/1000;
		break;
		case ("quintales"):
			normal = 43.3* c;
		break;
		case ("kilos"):
			normal=c;
		break;
		default:
			System.out.println("unidad no valida");

		}

		return normal;
	}
	
	public void dimeLingotes() {
		System.out.println((cantidad/14.59)+" lingotes");
	}
	public void dimeLibras() {
		System.out.println((cantidad*1000/453)+" libras");			
	}
	public void dimeGramos() {
		System.out.println((cantidad*1000)+" Gramos");
	}
	public void dimeOnzas() {
		System.out.println((cantidad*1000/28.35)+" Onzas");
	}
	public void dimePeniques() {
		System.out.println((cantidad*1000/1.55)+" Peniques");
	}
	public void dimeQuintales() {
		System.out.println((cantidad/43.3)+" Quintales");
	}

	@Override
	public String toString() {
		return "peso [cantidad=" + cantidad+ "]";
				//+ ", unidad=" + unidad + "]";
	}
	
}
