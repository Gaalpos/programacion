public class Conversor {
   private float valor;
  
   public void setMillas(float millas) {
       this.valor = millas;
   }
  
   public void setKm(float km) {
       this.valor = km;
   }
  
   public float millasAKm() {
       final float UN_MILLA_VALE = 1.61f;
       return this.valor * UN_MILLA_VALE;
   }
  
   public float kmAMillas() {
       final float UNA_KM_VALE = 0.62f;
       return this.valor * UNA_KM_VALE;
   }
}




