import java.util.Random;

public class Moneda {
    String[] Vlado={"cara","cruz"};
    String[] Vvalor={"1 centimo","2 centimos","5 centimos","10 centimos","20 centimos","50 centimos","1 euro","2 euros"};

    String valor;
    String lado;

    Moneda(String v, String l){
        this.valor=v;
        this.lado=l;
    }
    Moneda(){
        this.valor=generaValor();
        this.lado=generaLado();
    }
    public String generaLado(){
       int valor= (int) (Math.random()*2);
       System.out.println(valor);
       return Vlado[valor];
    }
    public String generaValor(){
        int valor= (int) (Math.random()*8);
       System.out.println(valor);
       return Vvalor[valor];
    }

    public String getValor() {
        return valor;
    }

    public String getLado() {
        return lado;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Moneda [valor=" + valor + ", lado=" + lado + "]";
    }

}
