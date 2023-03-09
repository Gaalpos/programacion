package intro;

public class  triangulo  extends figura implements areaFigura{
    
double base;
double altura;
double area;

triangulo(double altura,double base){
    this.altura=altura;
    this.base=base;
}

public double getArea(double altura,double base) {
    return area=(base+altura)/2;
}

@Override
public int area() {
    // TODO Auto-generated method stub
    return 0;
}

}
