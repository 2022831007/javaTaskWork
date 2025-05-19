public class LibrarySystem {

    String title, author;

    LibrarySystem(String title) {
        this(title, null);
    }

    LibrarySystem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        LibrarySystem book1 = new LibrarySystem("Data Structure learning", "Schaums");
        LibrarySystem book2 = new LibrarySystem("Java:OOP");

         System.out.println("Book Name: " + book1.title + " , Author: " + book1.author);
         System.out.println("Book Name: " + book2.title + " , Author: " + book2.author);
    }
}

