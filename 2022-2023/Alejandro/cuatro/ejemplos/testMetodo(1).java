package ejemplos;

public class testMetodo {
    
    public int dato=0;
    public static int datostatico=0;

    public void metodo(){
        testMetodo.datostatico++;
        this.dato++;

    }

    public static void metodostatico(){
        testMetodo.datostatico++;

    }


    public static void main(String[] args) {
           // dato++; NO HAS CREADO UN OBJETO
            datostatico++;
            metodostatico();
            //metodo(); NO HAS CREADO UN OBJETO PARA USARLO

            testMetodo tm = new testMetodo();
            tm.dato++;
            tm.metodo();



    }


}
