package parking;

public class Puerta {

	//atributos?
	String calle;
	Parking park;
	
	//constructor
	Puerta(Parking park, String calle){
		this.calle=calle;
		this.park=park;
	};
	
	//metodos
	public void entraVehiculo() {
		System.out.println("abriendo puerta");
		park.meter();
	}

	public void saleVehivulo() {
		System.out.println("abriendo puerta");
		park.sacar();
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Parking getPark() {
		return park;
	}

	public void setPark(Parking park) {
		this.park = park;
	}

	@Override
	public String toString() {
		return "Puerta [calle=" + calle + ", park=" + park + "]";
	}
	
	
}
