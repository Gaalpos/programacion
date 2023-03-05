class Principal {
//    static  void matar(EnemigoNormal enemigo){
//         System.out.println("Murio el enemigo normal");
            
//     }

//     static  void matar(EnemigoBoss enemigo){
//         System.out.println("Murio el enemigo boss");
            
//     }

//     static void matar(EnemigoFinalBoss enemigo){
//         System.out.println("Murio el enemigo final boss");
            
//     }

static void matar(Enemigo enemigo){
    System.out.println("Murio el enemigo ");
                    }



    public static void main(String[] args) {
        EnemigoNormal stormTrooper1 = new EnemigoNormal();
        EnemigoNormal stormTrooper2 = new EnemigoNormal();
        EnemigoFinalBoss DarthVader = new EnemigoFinalBoss();

        matar(stormTrooper2);
    }
}



class Armadura{
    String tipoArmadura;
    int durabilidadArmadura;
	int calidadArmadura;

}

class EnemigoNormal extends Enemigo{
    float calculapotenciagolpe(){
        return golpeBase *8 * v;
    }
}

class EnemigoBoss  extends Enemigo{
    float calculapotenciagolpe(){
        return golpeBase *20  *v;
    }


}

class EnemigoFinalBoss extends Enemigo{
    float calculapotenciagolpe(){
        return golpeBase * v;
    }


}

abstract class Enemigo {
    Armadura armadura = new Armadura();
	float v=100; // vida del enemigo
	float golpeBase = 40;
	private boolean muerto = false;

    abstract float calculapotenciagolpe();

	boolean estaMuerto(){
		return muerto;
	}
	
	
}
