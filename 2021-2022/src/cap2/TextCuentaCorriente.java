package cap2;

public class TextCuentaCorriente {
	public static void main(String[] args) {
		
		Cuenta dorada=new Cuenta();
		Cuenta currela= new Cuenta("Gabriel Pazos",2999.99f);
		
		System.out.println(dorada.toString());
		System.out.println(currela.toString());
		System.out.println(Cuenta.getnCuentas());
		
		currela.deposito(150f);
		System.out.println(currela.toString());
		
		currela.retiro(450f);
		System.out.println(currela.toString());
		
		System.out.println(currela.saldo());
		
		
	}

	
}
