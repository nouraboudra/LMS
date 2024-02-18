package ma.lms.lms.controllers;

import lombok.AllArgsConstructor;
import ma.lms.lms.services.LibraryPatronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;


@AllArgsConstructor
@RestController
@RequestMapping("/libraryPatron")
public class LibraryPatronControllers {

    private  final LibraryPatronService libraryPatronService;

    @GetMapping("/{id}")
    public ResponseEntity <?> getlibraryPatronById(long id){
        try {
            return ResponseEntity.ok(libraryPatronService.getLibraryPatronById(id));
        }catch (NoSuchElementException e)  {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("")
    public ResponseEntity <?> getAlllibraryPatronById(){
        return ResponseEntity.ok(libraryPatronService.getAllLibraryPatronById());
    }




}
