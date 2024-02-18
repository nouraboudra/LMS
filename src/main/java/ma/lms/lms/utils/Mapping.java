package ma.lms.lms.utils;

import ma.lms.lms.dto.BookRequestDto;
import ma.lms.lms.dto.BookResponseDto;
import ma.lms.lms.entities.Author;
import ma.lms.lms.entities.Book;
import org.modelmapper.ModelMapper;

public class Mapping {
    private static final ModelMapper modelMapper = new ModelMapper();

    //BookRequestDto === Book
    public static Book mapToEntityBook(BookRequestDto bookRequestDto) {

        return modelMapper.map(bookRequestDto, Book.class);
    }

    //Book === BookResponseDto
    public static BookResponseDto mapToResponseDto(Book book) {

        return modelMapper.map(book, BookResponseDto.class);
    }





}