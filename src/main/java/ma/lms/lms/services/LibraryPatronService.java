package ma.lms.lms.services;

import ma.lms.lms.entities.LibraryPatron;

import java.util.List;
import java.util.NoSuchElementException;

public interface LibraryPatronService {

    public LibraryPatron getLibraryPatronById(long id) throws NoSuchElementException;
    public List<LibraryPatron> getAllLibraryPatronById();




}
