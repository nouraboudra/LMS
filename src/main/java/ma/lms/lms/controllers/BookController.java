package ma.lms.lms.controllers;

import lombok.AllArgsConstructor;
import ma.lms.lms.dto.BookRequestDto;
import ma.lms.lms.dto.BookResponseDto;
import ma.lms.lms.entities.Book;
import ma.lms.lms.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;


    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDto> getBookById(@PathVariable long id){
        return ResponseEntity.ok(bookService.getBookbyId(id));
    }

    @GetMapping("")
    public ResponseEntity<List<BookResponseDto>> getAllBook(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @PostMapping("")
    public ResponseEntity<?> addBook(@RequestBody BookRequestDto bookRequestDto)
    {
        return ResponseEntity.ok(bookService.addBook(bookRequestDto));
    }

    @PutMapping("")
    public ResponseEntity<?> updateBook(@RequestBody BookRequestDto bookRequestDto){
        return ResponseEntity.ok(bookService.updateBook(bookRequestDto));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        bookService.deleteBook(id);
    }
}
