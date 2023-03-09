import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class Book {


	String ISBN;
	String titulo;
	String[] autores;
	String editorial;
	//Edition[] editions; 
	ArrayList <Edition> editions;
	 
	public Book(String ISBN) {
		this.ISBN=ISBN;
	}
	
	int count_auhors() {
		return autores.length;
	}
	void addNewEdition(Edition edition) {
		// Edition[] newArray = Arrays.copyOf(editions, editions.length+1);
		// newArray[editions.length] = new Edition(name, data, id);
		// editions = newArray;
		editions.add (edition);
	}
}

class Edition{
	String name;
	int id;
	Date fecha;
	
	public Edition(String name, Date fecha, int id) {
		super();
		this.name = name;
		this.fecha = fecha;
		this.id = id;
	}
	
}