package la.jain.springcache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(ApplicationRunner.class);
    private final BookRepository books;

    public ApplicationRunner(BookRepository bookRepository) {
        this.books = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info ("Fetching Books");
        log.info ("isbn-1234 -->" + books.getBookByISBN("isbn-1234"));
        log.info ("isbn-1234 -->" + books.getBookByISBN("isbn-1234"));
        log.info ("isbn-1235 -->" + books.getBookByISBN("isbn-1235"));
        log.info ("isbn-1234 -->" + books.getBookByISBN("isbn-1234"));
        log.info ("isbn-1234 -->" + books.getBookByISBN("isbn-1234"));
        log.info ("isbn-1235 -->" + books.getBookByISBN("isbn-1235"));
        log.info ("isbn-1235 -->" + books.getBookByISBN("isbn-1235"));
        log.info ("isbn-1236 -->" + books.getBookByISBN("isbn-1236"));
        log.info ("isbn-1235 -->" + books.getBookByISBN("isbn-1235"));
    }

}
