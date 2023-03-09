package propuesto4;

public class potencia {
    

    public int potencia(int a , int b){
        int pot=1;
        for(int i=1;i<=b;i++){
            pot*=a;
        }
        return pot;
    }
}
