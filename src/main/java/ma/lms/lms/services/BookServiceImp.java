package ma.lms.lms.services;

import lombok.AllArgsConstructor;
import ma.lms.lms.dto.BookRequestDto;
import ma.lms.lms.dto.BookResponseDto;
import ma.lms.lms.entities.Author;
import ma.lms.lms.entities.Book;
import ma.lms.lms.repositories.AuthorRepository;
import ma.lms.lms.repositories.BookRepository;
import ma.lms.lms.repositories.LibraryPatronRepository;
import ma.lms.lms.utils.Mapping;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@AllArgsConstructor
@Service
public class BookServiceImp implements BookService{

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final LibraryPatronRepository libraryPatronRepository;

    @Override
    public BookResponseDto getBookbyId(long id) {
        return Mapping.mapToResponseDto(bookRepository
                                                    .findById(id)
                                                    .orElseThrow(()-> new NoSuchElementException("sorry we cant find it ")));
    }

    @Override
    public BookResponseDto addBook(BookRequestDto bookRequestDto) {

        var book = Mapping.mapToEntityBook(bookRequestDto);

        var book2= bookRepository.save(book);
        return Mapping.mapToResponseDto(book2);
    }

    @Override
    public List<BookResponseDto> getAllBooks() {
        List<Book> books= bookRepository.findAll();
        return books.stream().map(Mapping::mapToResponseDto).toList();

    }

    @Override
    public BookResponseDto updateBook(BookRequestDto bookRequestDto) {
        Book book= Mapping.mapToEntityBook(bookRequestDto);
        return Mapping.mapToResponseDto(bookRepository.save(book));
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }
}
