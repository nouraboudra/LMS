package ma.lms.lms.services;

import lombok.AllArgsConstructor;
import ma.lms.lms.entities.LibraryPatron;
import ma.lms.lms.repositories.LibraryPatronRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
@Service
public class LibraryPatronServiceImp implements LibraryPatronService {

    private  final LibraryPatronRepository libraryPatronRepository;
    @Override
    public LibraryPatron getLibraryPatronById(long id) {
        return libraryPatronRepository
                    .findById(id)
                    .orElseThrow(()-> new NoSuchElementException("sir go away there is noooo Library Patron with that id x: "));

    }

    @Override
    public List<LibraryPatron> getAllLibraryPatronById() {
        return libraryPatronRepository.findAll();
    }
}
