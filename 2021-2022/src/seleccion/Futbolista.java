package seleccion;

public class Futbolista extends Seleccion{

	int dorsal;
	private String demarcacion;
	
	public Futbolista() {
		super();
	}
	
	public Futbolista (int id, String nombre, String apellidos, int edad, int dorsal,String demarcacion) {
		super(id, nombre, apellidos,edad);
			this.dorsal=dorsal;
			this.demarcacion=demarcacion;
		}
	
	public int getDorsal() {
		return dorsal;
	}
	
	public String getDemarcacion() {
		return demarcacion;
	}
	
	public void Concentrase() {

	}
	
	public void Concentrarse() {
		//super.Concentrarse();
		System.out.println("Este es el metodo concentrarse de la superclase Futbolista");
	}

	public void Viajar() {
		//super.Viajar();
		System.out.println("Este es el metodo viajar de la superclase Futbolista");
	}
	
	public void jugarPartido() {
		System.out.println("Futbolista juega un partido");
	}
	
	public void entrenar() {
		System.out.println("Futbolista realiza un entreno");
	}

	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
	}
	
	
	
}
