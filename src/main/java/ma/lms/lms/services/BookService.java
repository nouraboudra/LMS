package ma.lms.lms.services;

import ma.lms.lms.dto.BookRequestDto;
import ma.lms.lms.dto.BookResponseDto;
import ma.lms.lms.entities.Book;

import java.util.List;

public interface BookService {

   public BookResponseDto getBookbyId(long id);

   public BookResponseDto addBook(BookRequestDto bookRequestDto);

   public List<BookResponseDto> getAllBooks();
   public BookResponseDto updateBook(BookRequestDto bookRequestDto);

   public void deleteBook(long id);

}
