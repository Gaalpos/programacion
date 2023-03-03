package ejemplos2;

public class testpajaro {

public static void main(String[] args) {
	int años;
pajaro piolin;
piolin=new pajaro();
piolin.setEdad(5);
//piolin.imprimeEdad();
System.out.println(piolin.toString());
piolin.setEdad(8);
años=piolin.getEdad();
System.out.println("el pajaro tiene años: "+años);
piolin.setColor('a');
//piolin.imprimeColor();
System.out.println(piolin.toString());

//Ejemplo de uso de constructor con todos los atributos
pajaro dos= new pajaro('t', -12);
System.out.println(dos.toString());
}

}