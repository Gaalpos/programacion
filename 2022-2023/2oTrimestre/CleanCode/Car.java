public class Car {
	String model;
	String brand;
	String registration;
	boolean ValidRegistration();
	
	boolean validateRegistration() {


		if(type.equals("OLD")) {
			if(registration.length() == 8) {
				return true;
			}
			else {
				return false;
			}
		}else {
			if(registration.length() == 7) {
				return true;
			}
			else {
				return false;
			}
		}



		
	}
}

