package Maquina;

import java.util.Scanner;

public class Control {
    // ***************************************************
 // * Recoge monedas en 'Maquina' para cobrar 'Precio'.
// * Devuelve 'true'
// * si el pago se ha realizado con exito y 'false' en
// * caso contrario
 // ****************************************************
public static boolean IntroduccionMonedas
(Modelo Maquina, float Precio) {
    Scanner sc = new Scanner(System.in);

String Accion;
char Car;
boolean Pagado=false, Anulado = false, CambioOK ;
float Acumulado = 0;

do {
System.out.println("-- u(mete 1 euro),d(mete 10 centimos),a(anula operacion) --");
Accion = sc.nextLine();
Car = Accion.charAt(0);
switch (Car) {
    case 's':
    System.out.println("Porducto Agotado");
    break;
    
case 'u':
if (Maquina.Deposito1Euro.HayHueco()) {



Maquina.Deposito1Euro.MeteElemento();
Acumulado = Acumulado + 1f;
} else
System.out.println("Temporalmente esta maquina no acepta monedas de un euro");
break;

case 'd':
if (Maquina.Deposito01Euro.HayHueco()) {
Maquina.Deposito01Euro.MeteElemento();
Acumulado = Acumulado + 0.1f;
} else
System.out.println("Temporalmente esta maquina no acepta monedas de 0.1 euros");
break;

case 'a':
System.out.println("Operación anulada, reocoja sus monedas");
Anulado = true;
break;
}

Maquina.MostrarEstadoMaquina();

} while (Acumulado<Precio && !Anulado);

if (Anulado)
Devolver(Maquina,Acumulado);
else
if (CambioDisponible(Maquina,Acumulado-Precio)) {
Devolver (Maquina,Acumulado-Precio);
System.out.println("Recoja usted su cambio ");
} else {
System.out.println("La maquina no dispone del cambio necesario");
Devolver(Maquina,Acumulado);
Anulado = true;
}
return (!Anulado);
}



// ******************************************************
// * Indica si es posible devolver 'Cantidad' euros en
//* 'Maquina'
// ******************************************************
private static boolean CambioDisponible
(Modelo Maquina, float Cantidad) {




int Monedas1,Monedas01;

Cantidad = Cantidad + 0.01f; //Evita problemas de
//falta de precision
Monedas1 = (int) Math.floor((double) Cantidad);
Cantidad = Cantidad - (float) Monedas1;
Monedas01 = (int) Math.floor((double) Cantidad*10f);
return 
(Maquina.Deposito1Euro.getNumeroDeElementos()>=Monedas1)&&
(Maquina.Deposito01Euro.getNumeroDeElementos()>=Monedas01);
}


// **************************************************
// * Devuelve la cantidad de dinero indicada,
// * actualizando los almacenes de monedas
// **************************************************
private static void Devolver (Modelo
Maquina, float Cantidad) {

int Monedas1,Monedas01;
Cantidad = Cantidad + 0.01f; //Evita problemas de
//falta de precision
Monedas1 = (int) Math.floor((double)Cantidad);
Cantidad = Cantidad - (float) Monedas1;
Monedas01 = (int) Math.floor((double)Cantidad*10f);

for (int i=1;i<=Monedas1;i++){
Maquina.Deposito1Euro.SacaElemento();
// Sacar 1 moneda de un euro
}

for (int i=1;i<=Monedas01;i++){
Maquina.Deposito01Euro.SacaElemento();
// Sacar 1 moneda de 0.1 euro
}
System.out.println("Recoja el importe: "+Monedas1+" monedas de un euro y "+Monedas01+" monedas de 0.1 euros");

}
}


