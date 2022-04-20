package objetosT3;

import java.util.Random;

public class Password {
	
	int longitud;
	String contraseña;
	
	Password(){
		contraseña= generaPassword(8);
	}
	
	Password(int l){
		longitud=l;
		contraseña= generaPassword(l);
	}
/*
	private char[] mayusculas= { };
	private char[] minusculas= { };
	static char [] numeross = { };
	static char [] especiales
	*/
	private String generaPassword(int l) {
		String p="";
		for(int i=0;i<l;i++) {
			Random r = new Random();
			p+=(char)(r.nextInt(122-48+1)+48);
		}
		return p;
	}
	
	
	@Override
	public String toString() {
		return "Password [contraseña=" + contraseña + "]";
	}

}
