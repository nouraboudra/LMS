package ma.lms.lms;

import ma.lms.lms.entities.Author;
import ma.lms.lms.entities.Book;
import ma.lms.lms.entities.LibraryPatron;
import ma.lms.lms.repositories.AuthorRepository;
import ma.lms.lms.repositories.BookRepository;
import ma.lms.lms.repositories.LibraryPatronRepository;
import ma.lms.lms.services.LibraryPatronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LmsApplication implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private LibraryPatronRepository libraryPatronRepository;

    public static void main(String[] args) {


        SpringApplication.run(LmsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = "2024-02-18";

        Author a= new Author(1L,"kate jacobs","ddfvfdvfd",null);
        Author b= new Author(2L,"Paulo Coelho","cvdvd",null);
        Author c= new Author(3L,"Colleen Hoover","dsfdsfds",null);
        Author d= new Author(4L,"chi haja","test",null);
                //convert String to LocalDate
        authorRepository.save(a);
        authorRepository.save(b);
        authorRepository.save(c);
        authorRepository.save(d);

        LocalDate localDate = LocalDate.parse(date, formatter);
        Book b1 = new Book(1L,"it's end with us","122333",localDate,c);
        Book b2 = new Book(2L,"Adulery","122334",localDate,b);
        Book b3 = new Book(3L,"the Friday night knitting club","122334",localDate,b);


        bookRepository.save(b1);
        bookRepository.save(b2);
        bookRepository.save(b3);

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        LibraryPatron p =new LibraryPatron(1L,"test","test.test@gmail.com",books);
        libraryPatronRepository.save(p);
    }
}
