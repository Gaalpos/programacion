package herencia;

public class Jugador {
	private String nombre;
	private String demarcacion;
	private int partidosJugados;
	private int golesMarcados;
	private int tarjetasAmarillas;
	private int tarjetasRojas;
	protected static int identificador;

	public Jugador(String n, String d, int p, int g, int a, int r) {
		nombre = n;
		demarcacion = d;
		partidosJugados = p;
		golesMarcados = g;
		tarjetasAmarillas = a;
		tarjetasRojas = r;
		identificador++;
	}

	public Jugador() {
		this("sin nombre", "sin demarcacion", 0, 0, 0, 0);
	}

	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Demarcación: " + demarcacion);
		System.out.println("Partidos Jugados: " + partidosJugados);
		System.out.println("Goles Marcados: " + golesMarcados);
		System.out.println("Tarjetas amarillas:" + tarjetasAmarillas);
		System.out.println("Tarjetas Rojas: " + tarjetasRojas);
		System.out.println("Identificador: " + identificador);
	}

}