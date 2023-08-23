import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // Создаем список книг
    Book book1 = new Book("William Shakespear", "Romeo und Julia", 40);
    Book book2 = new Book("Erich J. Schreiber", "JAVA Aufgaben und Übungen", 200);
    Book book3 = new Book("Elisabeth Jung", "Java Übungsbuch", 250);
    Book book4 = new Book("Michael Bonacina", "Java Programmieren für Einsteiger", 70);
    Book book5 = new Book("David Kopec", "Algorithmen in Java", 56);
    Book book6 = new Book("William Shakespear", "Hamlet", 140);
    List<Book> Books = new ArrayList<>();
    Books.add(book1);
    Books.add(book2);
    Books.add(book3);
    Books.add(book4);
    Books.add(book5);
    Books.add(book6);
    // публикуем изначальный список книг
    printBeautifulList((ArrayList<Book>) Books);
    // публикуем отсортированный список книг
    printBooksByAuthor((ArrayList<Book>) Books);

  }

  private static void printBooksByAuthor(ArrayList<Book> books) {
    // пробуем создать анонимный класс
    books.sort(new Comparator<Book>() {
      @Override
      public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
      }
    });
    printBeautifulList((ArrayList<Book>) books);
  }

  private static void printBeautifulList(ArrayList<Book> books) {
    for (int i = 0; i < books.size(); i++) {
      System.out.println(
          "Author: " + books.get(i).getAuthor() + ", Title: " + books.get(i).getTitle()
              + ", Pages: " + books.get(i).getPages());
    }
  }
}