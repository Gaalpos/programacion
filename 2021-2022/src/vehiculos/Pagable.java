package vehiculos;

public interface Pagable {
	public final int IVA_DEFECTO=21;
	
	public float impuesto();
	
	public float seguro();
	
	public float itv();

}
