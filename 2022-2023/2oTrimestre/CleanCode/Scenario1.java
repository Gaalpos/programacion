
/*
 * 
 function canBuyBeer(age, money) {
  if (age >= 21 && money >= 20) {
    return true;
  }
  return false;
}
 */

public class Scenario1 {

    final static int MAYOR_EDAD = 18;
    final static int PRECIO_CERVEZA = 20;

    public static boolean canBuyBeer(int age, int money) {
        if (age >= MAYOR_EDAD && money >= PRECIO_CERVEZA) {
            return true;
        }
        return false;
    }
}
