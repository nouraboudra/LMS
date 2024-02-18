package ma.lms.lms.dto;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BookRequestDto {

    private Long id;
    private String title;
    private String isbn;
    private LocalDate publication_date;
    private long authorId;


}
