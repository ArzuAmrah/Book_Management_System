package book;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book ("Java Programming", "Author A", "ISBN1234");
        Book book2 = new Book ("Python Programming", "Author B", "ISBN5678");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Available books: ");

        for (Book book : library.getAvailableBooks()){
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
