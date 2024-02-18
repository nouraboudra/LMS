package ma.lms.lms.dto;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class BookResponseDto {

    private Long id;
    private String title;
    private String isbn;
    private LocalDate publication_date;

    private long authorId;
    private String authorName;
    private String authorBiography;

}
