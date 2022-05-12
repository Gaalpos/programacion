package Composicion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Autonomia Galicia = new Autonomia ("Galiza");
		
		Provincia coruña= new Provincia("La Coru",20);
		Provincia pontevedra= new Provincia("pontevedra",30);
		Provincia lugo= new Provincia("Lugo",20);
		Provincia ourense= new Provincia("Ourense",10);
		
		Galicia.getLista().add(coruña);
		Galicia.getLista().add(pontevedra);
		Galicia.getLista().add(lugo);
		Galicia.getLista().add(ourense);
		
		System.out.println(Galicia.toString());
	}

}
