import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Book book1 = new Book("William Shakespear", "Romeo und Julia", 40 );
    Book book2 = new Book("Erich J. Schreiber", "JAVA Aufgaben und Übungen", 200);
    Book book3 = new Book("Elisabeth Jung", "Java Übungsbuch", 250);
    Book book4 = new Book("Michael Bonacina","Java Programmieren für Einsteiger", 70);
    Book book5 = new Book("David Kopec","Algorithmen in Java", 56);
    Book book6 = new Book("William Shakespear", "Hamlet", 140 );
    List <Book>  Books = new ArrayList<>();
    Books.add(book1);
    Books.add(book2);
    Books.add(book3);
    Books.add(book4);
    Books.add(book5);
    Books.add(book6);
    System.out.println(Books);
  }
}