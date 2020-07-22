package la.jain.springcache;

public interface BookRepository {
    Book getBookByISBN(String isbn);
}
