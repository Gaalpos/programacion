package cap2;

public class testpajaro {

	public static void main(String[] args) {
		
		/*
		//declaro pero no construyo todavia una
		//referencia a un pajaro
		pajaro p1;
		pajaro p2;
		//creo un objeto nuevo
		p1 = new pajaro();
		System.out.println(  p1.toString() );
		p1.setEdad(5);
		//pepe.printEdad();
		System.out.println(  p1.toString() );
		p1.setColor('/');
		System.out.println(  p1.toString());
		p1.printColor();
		
		p2= new pajaro();
		p2.setEdad(2);
		p2.setColor('R');
		
		System.out.println( p2.toString() ); */
		
		//PROBANDO TODOS LOS CONSTRUCTORES
		pajaro cero= new pajaro();
		pajaro uno=  new pajaro('F');
		pajaro dos=  new pajaro(345);
		pajaro tres= new pajaro('Ñ', -4);
		pajaro cuatro= new pajaro('F',34,"cuco");
		
		System.out.println( cero.toString() );
		System.out.println( uno.toString() );
		System.out.println( dos.toString() );
		System.out.println( tres.toString() );
		System.out.println( cuatro.toString() );
		
		pajaro.muestraTotal();
		
		
		
		}
}