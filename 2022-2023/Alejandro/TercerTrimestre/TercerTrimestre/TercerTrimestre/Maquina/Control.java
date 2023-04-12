package Maquina;

public class Control {
    // ***************************************************
4 // * Recoge monedas en 'Maquina' para cobrar 'Precio'.
// * Devuelve 'true'
5 // * si el pago se ha realizado con exito y 'false' en
// * caso contrario
6 // ****************************************************
7 public static boolean IntroduccionMonedas
8 (MaquinaModeloSencillo Maquina, float Precio) {
9
10 String Accion;
11 char Car;
12 boolean Pagado=false, Anulado = false, CambioOK ;
13 float Acumulado = 0;
14
15 do {
16 System.out.println("-- u,d,a --");
17 Accion = Teclado.Lee_String();
18 Car = Accion.charAt(0);
19 switch (Car) {
20 case 'u':
21 if (Maquina.Deposito1Euro.HayHueco()) {

ã BOBADILLA CAPÍTULO 4: PROGRAMACIÓN ORIENTADA A OBJETOS USANDO CLASES 131

22 Maquina.Deposito1Euro.MeteElemento();
23 Acumulado = Acumulado + 1f;
24 } else
25 System.out.println("Temporalmente esta
26 maquina no cepta monedas de un euro");
27 break;
28
29 case 'd':
30 if (Maquina.Deposito01Euro.HayHueco()) {
31 Maquina.Deposito01Euro.MeteElemento();
32 Acumulado = Acumulado + 0.1f;
33 } else
34 System.out.println("Temporalmente esta
35 maquina no acepta monedas de 0.1 euros");
36 break;
37
38 case 'a':
39 System.out.println("Operación anulada");
40 Anulado = true;
41 break;
42 }
43
44 Maquina.MostrarEstadoMaquina();
45
46 } while (Acumulado<Precio || Anulado);
47
48 if (Anulado)
49 Devolver(Maquina,Acumulado);
50 else
51 if (CambioDisponible(Maquina,Acumulado-Precio)) {
52 Devolver (Maquina,Acumulado-Precio);
53 } else {
54 System.out.println("La maquina no dispone del
cambio necesario");
55 Devolver(Maquina,Acumulado);
56 Anulado = true;
57 }
58 return (!Anulado);
59 }
60
61
62
63 // ******************************************************
64 // * Indica si es posible devolver 'Cantidad' euros en
// * 'Maquina'
65 // ******************************************************
66 private static boolean CambioDisponible
67 (MaquinaModeloSencillo Maquina, float Cantidad) {

132 JAVA A TRAVÉS DE EJEMPLOS Ó JESÚS BOBADILLA SANCHO (JBOBI@EUI.UPM.ES)

68
69 int Monedas1,Monedas01;
70
71 Cantidad = Cantidad + 0.01f; //Evita problemas de
//falta de precision
72 Monedas1 = (int) Math.floor((double) Cantidad);
73 Cantidad = Cantidad - (float) Monedas1;
74 Monedas01 = (int) Math.floor((double) Cantidad*10f);
75 return {
(Maquina.Deposito1Euro.DimeNumeroDeElementos()>=Monedas1)&&
(Maquina.Deposito01Euro.DimeNumeroDeElementos()>=Monedas01));
76 }
77
78
79
80 // **************************************************
81 // * Devuelve la cantidad de dinero indicada,
82 // * actualizando los almacenes de monedas
83 // **************************************************
84 private static void Devolver (MaquinaModeloSencillo
85 Maquina, float Cantidad) {
86
87 int Monedas1,Monedas01;
88 Cantidad = Cantidad + 0.01f; //Evita problemas de
//falta de precision
89 Monedas1 = (int) Math.floor((double)Cantidad);
90 Cantidad = Cantidad - (float) Monedas1;
91 Monedas01 = (int) Math.floor((double)Cantidad*10f);
92
93 for (int i=1;i<=Monedas1;i++){
94 Maquina.Deposito1Euro.SacaElemento();
95 // Sacar 1 moneda de un euro
96 }
97
98 for (int i=1;i<=Monedas01;i++){
99 Maquina.Deposito01Euro.SacaElemento();
100 // Sacar 1 moneda de 0.1 euro
101 }
102 System.out.println("Recoja el importe: "+Monedas1+"
103 monedas de un euro y "+Monedas01+
104 " monedas de 0.1 euros");
105
106 }
}
