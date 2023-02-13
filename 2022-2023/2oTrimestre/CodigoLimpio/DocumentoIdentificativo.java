public class DocumentoIdentificativo {
	// Puede ser CIF o NIF
	String type;
	String text;
	
	String getLetter() {
		String letraEncontrada = "";
		if(type == "CIF") {
			char temp =  text.charAt(0);
			letraEncontrada = String.valueOf(temp);
		}else if(type == "NIF"){
			char temp = text.charAt(text.length()-1);
			letraEncontrada = String.valueOf(temp);
		}else {
			System.out.println("Error en el tipo de documento");
		}
		return letraEncontrada;
	}
	
	boolean isValid() {
		
		if(type=="CIF") {
			boolean tieneLetra = false;
			boolean tieneNum = false;
			// boolean tieneNum2 = false;
			// boolean tieneNum3 = false;
			// boolean tieneNum4 = false;
			// boolean tieneNum5 = false;
			// boolean tieneNum6 = false;
			// boolean tieneNum7 = false;
			// boolean tieneNum8 = false;
			
            
			if( Character.isAlphabetic(text.charAt(0))  == true) {
				tieneLetra = true;
			}
			
for( int i= 1; i < 8; i++){
    if (Character.isDigit(text.charAt(i)) == true)
    tieneNum=true;
}

			// if( Character.isAlphabetic(text.charAt(0))  == true) {
			// 	tieneLetra = true;
			// }
			
			// if( Character.isDigit(text.charAt(1))  == true) {
			// 	tieneNum1 = true;
			// }
			
			// if( Character.isDigit(text.charAt(2))  == true) {
			// 	tieneNum2 = true;
			// }
			
			// if( Character.isDigit(text.charAt(3))  == true) {
			// 	tieneNum3 = true;
			// }
			
			// if( Character.isDigit(text.charAt(4))  == true) {
			// 	tieneNum4 = true;
			// }
			
			// if( Character.isDigit(text.charAt(5))  == true) {
			// 	tieneNum5 = true;
			// }
			
			// if( Character.isDigit(text.charAt(6))  == true) {
			// 	tieneNum6 = true;
			// }
			
			// if( Character.isDigit(text.charAt(7))  == true) {
			// 	tieneNum7 = true;
			// }
			// if( Character.isDigit(text.charAt(8))  == true) {
			// 	tieneNum8 = true;
			// }
			
			if(tieneLetra && tieneNum1 && tieneNum2 && tieneNum3 && tieneNum4
					&& tieneNum5 && tieneNum6 && tieneNum7 && tieneNum8) {
				return true;
			}else {
				return false;
			}
			
		}else if(text == "NIF") {
			//TODO falta por hacer
			return false;
		}
		return false;
	}
	
}
 