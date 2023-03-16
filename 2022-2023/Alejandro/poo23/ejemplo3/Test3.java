package ejemplo3;

import java.util.ArrayList;

public class Test3 {
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {    
        Entrenador CHOLO = new Entrenador(1, "Diego", "Simeone", 52, "XTR0016");
        Futbolista grisman = new Futbolista(2, "Toño", "grizman", 19, 12, "Media Punta");
        Masajista manolo = new Masajista(3, "Manuel", "Bombo", 44, "Licenciado en Fisioterapia", 28);

        integrantes.add(CHOLO);
        integrantes.add(grisman);
        integrantes.add(manolo);

        Entrenador delBosque = new Entrenador(1, "Vivente", "Del Bosque", 60, "284EZ89");
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Zurdo");
        Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        /*for(SeleccionFutbol sf: integrantes){
            System.out.println(sf.toString());
        }*/

        //blucle foreach donde cada objeto llame solo a sus métodos específicos
        for(SeleccionFutbol sf: integrantes){
            System.out.println(sf.toString());

            //Si es entrenador
            if(sf instanceof Entrenador){
               ((Entrenador)sf).dirigirEntrenamiento();
               ((Entrenador)sf).dirigirPartido();
            }
            //Si es futbolista
            if(sf instanceof Futbolista){
                ((Futbolista)sf).jugarPartido();
                ((Futbolista)sf).entrenar();
            }
            //Si es masajista
            if(sf instanceof Masajista){
                ((Masajista)sf).darMasaje();
                ((Masajista)sf).Viajar();
            }
        }
}
}