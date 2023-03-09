package cap2;

import java.util.Scanner;

public class auto {

	//MEJORA EN constructores SI
	
	private String marca;
	private String modelo;
	private consumo centralita;
	
	
	auto(String mar,String mod,double k,double l, double v, double p){
		this.marca=mar;
		this.modelo=mod;
		this.centralita= new consumo(k, l, v, p);
		}
	//se podrian duplicar usando el metodo pideInfo();
	auto(String mar,String mod, consumo cen){
		this.marca=mar;
		this.modelo=mod;
		//asumimos que se crea un objeto cen en algun sitio
		this.centralita=new consumo(cen);
		}
    //constructor alternativo que ya pide los datos
	auto(String mar,String mod){
		this.marca=mar;
		this.modelo=mod;
		//asumimos que se crea un objeto CONSUMO gracias al metodo
		this.centralita= consumo.pideInfo();
		}
	
	//opciones de mejora de uso de atributos NADA
	public static auto pideTodo() {
		Scanner es = new Scanner(System.in);
		String mar;
		String mod;
		consumo central;
		auto bus;
		System.out.println("Introduce marca");
		mar = es.next();
		System.out.println("Introduce modelo");
		mod = es.next();
		central = consumo.pideInfo();
		bus = new auto(mar, mod, central);
		return bus;
		}
	
	@Override
	public String toString() {
		return "auto [marca=" + marca + "\n "
				+ "modelo=" + modelo + "\n"
				+ "centralita=" + centralita.toString() + "]";
	}

	public String dameInfo() {
		return centralita.dameInfo();
	}

}