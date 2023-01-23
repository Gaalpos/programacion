package intro;

public class circulo implements areaFigura,perimetro {
    
final static double PI=3.1416;
int radio;

circulo(int radio){
this.radio=radio;
}

public int getRadio(){
    return this.radio;
}

public void setRadio(int r){
    this.radio=r;
}


public int area(){
    return (int)PI*radio*radio;
}




}
