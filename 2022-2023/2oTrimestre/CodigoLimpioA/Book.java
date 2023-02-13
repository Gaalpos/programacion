import java.util.Arrays;

public class Book {
    String ISBN;
    // Titulo del libro
    String title;
    String[] autores;
    // Editoral del libro
    String editorial;
    Edition[] editions;

    public Book(String ISBN) {
        this.ISBN = ISBN;
    }

    int count_auhors() {
        return autores.length;
    }

    void addNewEdition(String name, String data, int id) {
        Edition[] newArray = Arrays.copyOf(editions, editions.length + 1);
        newArray[editions.length] = new Edition(name, data, id);
        editions = newArray;
    }
}

class Edition {
    String name;
    String data;
    int id;

    public Edition(String name, String data, int id) {
        super();
        this.name = name;
        this.data = data;
        this.id = id;
    }

}