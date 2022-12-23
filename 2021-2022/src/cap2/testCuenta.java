package cap2;

public class testCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cuenta dorada=new Cuenta();
		Cuenta currela=new Cuenta("gabriel pazos",2999.99f);
		
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
