import java.util.Arrays;

public class Carta implements Comparable{
    String valor;
    String palo;
    String[] palos= {"bastos","oros","copas","espadas"};
    String[] valores= {"As","2","3","4","5","6","7","Sota","Caballo","Rey"};

    Carta(){
        this.valor=generaValor();
        this.palo=generaPalo();
    }

    public String generaPalo(){
        int ind= (int) (Math.random()*4);
        return palos[ind];
     }
     public String generaValor(){
         int ind= (int) (Math.random()*10);
        return valores[ind];
     }

    public String getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return "Carta [valor=" + valor + ", palo=" + palo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
        result = prime * result + ((palo == null) ? 0 : palo.hashCode());
        return result;
    }

     @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carta other = (Carta) obj;
        if (valor == null) {
            if (other.valor != null)
                return false;
        } else if (!valor.equals(other.valor))
            return false;
        if (palo == null) {
            if (other.palo != null)
                return false;
        } else if (!palo.equals(other.palo))
            return false;
            //Si son iguales el mismo palo  el mismo valor
        return true;
    }
    /*public boolean equals(Object obj){
        Carta other= (Carta) obj;
        if(this.palo.equals(other.getPalo())&& this.valor.equals(other.getValor()))
        return true;
        else return false;
    }*/

    @Override
    public int compareTo(Object obj) {
        // TODO Auto-generated method stub
        //primero por palo
        Carta car = (Carta) obj;
        //Si son distintos ordena por palo
        if(!this.getPalo().equals(car.getPalo()))
        return this.getPalo().compareTo(car.getPalo());
        //Si son del mismo ordena por valor
        else
        return this.getValor().compareTo(car.getValor());

        
    }

    

    
    
}
