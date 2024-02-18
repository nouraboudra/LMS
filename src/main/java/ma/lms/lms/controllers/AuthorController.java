package ma.lms.lms.controllers;

import lombok.AllArgsConstructor;
import ma.lms.lms.entities.Author;
import ma.lms.lms.services.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable long id){
        return ResponseEntity.ok(authorService.getAuthorById(id));
    }

    @GetMapping("")
    public ResponseEntity<?> getAllAuthor(){
        return ResponseEntity.ok(authorService.getAllAuthors());
    }

    @PostMapping("")
    public ResponseEntity<Author> addAuthor(@RequestBody Author author ){

        return ResponseEntity.ok(authorService.addAuthor(author));



    }

    @PutMapping("")
    public ResponseEntity<Author> updateAuthor(@RequestBody Author author){
        return ResponseEntity.ok(authorService.updateAuthor(author));
    }

    @DeleteMapping("/{id}")
    public void deleteAutor(@PathVariable long id )
    {
        authorService.deleteAuthor(id);
    }


}
