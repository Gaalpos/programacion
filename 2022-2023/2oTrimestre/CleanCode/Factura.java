class Subject{
     String cod;
    String nombre;
    String direccion;
    String cif;

}

class Artcicle{
    String name;
    float price;

}

public Class Article{
    String name;
    float total;
}


public class Factura{
    String cod;
    String fecha;
    float total;
    Article[]articles ; //mejor un arraylist
   

public static String getDayOffWeek(int numberDayOfWeek){
    
    String[] semanita = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};

    return semanita[numberDayOfWeek-1];
}

}

// if(numberDayOfWeek ==1) return "lunes";
    // if(numberDayOfWeek ==2) return "martes";
    // if(numberDayOfWeek ==3) return "miercoles";
    // if(numberDayOfWeek ==4) return "jueves";
    // if(numberDayOfWeek ==5) return "viernes";
    // if(numberDayOfWeek ==6) return "sabado";
    // if(numberDayOfWeek ==7) return "domingo";