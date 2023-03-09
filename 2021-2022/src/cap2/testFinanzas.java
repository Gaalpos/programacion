package cap2;

public class testFinanzas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creo un objeto con cambio 1.16
		
		finanzas antiguo=new finanzas();
		System.out.println(antiguo.toString());
		//lo uso
		System.out.println(antiguo.dolaresToEuros(100));
		System.out.println(antiguo.eurosToDolares(1000));
		
		
		//creo un objeto con cambio 1.16
		finanzas hoy = new finanzas(1.16);
		
		//lo uso
		System.out.println(hoy.toString());
		System.out.println(hoy.dolaresToEuros(200));
		System.out.println(hoy.eurosToDolares(5000));
	}

}
