package prueba;

public class prueba{
	
	public void cuentaLetras(String cadena) {
		String c = cadena;
		int vcount = 0, ccount = 0;
		 c = c.toLowerCase();
	        for(int i = 0; i < c.length(); i++) { char ch = c.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { vcount++; } else if((ch >= 'a'&& ch <= 'z')) {
	                ccount++;
	            }
	        }
	        System.out.println("Vocales: " + vcount+ " Consonantes: "+ccount);
		
	
	}
}