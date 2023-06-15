
public class Principal {

   public static void main(String[] args) {
       Conversor conv = new Conversor();
       conv.setMillas(3);
       float km = conv.millasAKm();
       System.out.println(km);
   }

}