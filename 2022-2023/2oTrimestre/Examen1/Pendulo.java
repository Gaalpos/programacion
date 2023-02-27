class Pendulo{	
	float longitud;
	
	public Pendulo(float longitud) {
		super();
		this.longitud = longitud;
	}


	double getPeriodo(float gravedad) throws ArithmeticException{
		if(longitud < 0) throw new ArithmeticException("El pendulo no tiene lontigud correcta");
		if(gravedad <= 0) throw new ArithmeticException("El periodo es infinito");
		return 2*Math.PI * Math.sqrt(longitud / gravedad);
		
	}
	
	double getFrecuencia(float gravedad) {
		if(longitud < 0) throw new ArithmeticException("El pendulo no tiene lontigud correcta");
		if(gravedad <= 0) throw new ArithmeticException("El periodo es infinito");
		return 1/getPeriodo(gravedad);
	}
	
	double getAceleracionAngular(float gravedad, int anguloEnGrados) {
		if(longitud < 0) return 0;
		double anguloEnRadianes = Math.toRadians(anguloEnGrados);
		return -(gravedad/longitud) * Math.sin(anguloEnRadianes);
	}

    public static void main(String[] args) {
        Pendulo p = new Pendulo(5);
        System.out.println(p.getAceleracionAngular(9.8f, 2));
    }
}
