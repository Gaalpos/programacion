package objetosT333;

public class testSVCE {

	public static void main(String[] args) {
		int contS = 0;
		int contV = 0;

		Serie uno = new Serie("perdidos", 5, "F", "tony");
		Serie dos = new Serie("modern family", 2, "D", "carlos");
		Serie tres = new Serie("simpons", 7, "R", "cesar");

		Videojuego one = new Videojuego("Minecraft", 20, "Sandnbox", "notch");
		Videojuego two = new Videojuego("God of war", 50, "aventura", "barry");
		Videojuego three = new Videojuego("FIFA", 30, "deportes", "pazos");
		
		Comic marvel = new Comic("Batman", 5, "Marvel", "Lee");
		Comic dc = new Comic("Superman", 3, "dc", "stan");
		Comic planeta = new Comic("Spiderman", 2, "planeta", "rose");

		Serie[] yonkis = { uno, dos, tres };
		Videojuego[] meta = { one, two, three };
		Comic [] marbel = {marvel,dc,planeta};

		uno.entregar();
		tres.entregar();

		two.entregar();


		for (Serie s : yonkis) {
			// System.out.println(s.toString());
			if (s.isEntregado()) {
				contS++;
				s.devolver();
			}

		}
		System.out.println("Series entregadas " + contS);

	
		for (Videojuego v : meta) {
			System.out.println(v.toString());
			if (v.isEntregado()) {
				contV++;
				v.devolver();
			}

		}
		System.out.println("Series entregadas " + contS);
		
		
		Serie max = yonkis[0];
		for (Serie s : yonkis) {
			if (s.compareTo(max) > 0) {
				max = s; 
				}

		}
		System.out.println("Serie on mas temporadas " + max);
		
		Videojuego maxi = meta[0];
		for (Videojuego v : meta) {
			if (v.compareTo(maxi) > 0) { 
				maxi = v; 
				System.out.println(maxi.toString());
				}

		}
		System.out.println("Videojuego con mas horas " + maxi);
	}
}
