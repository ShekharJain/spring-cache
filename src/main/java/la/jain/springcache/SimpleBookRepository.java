package la.jain.springcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class SimpleBookRepository implements BookRepository {

    @Override
    @Cacheable("library")
    public Book getBookByISBN(String isbn) {
        simulateSlowService();
        return new Book(isbn,"This Book");
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
