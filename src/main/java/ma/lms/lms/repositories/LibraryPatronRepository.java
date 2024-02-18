package ma.lms.lms.repositories;

import ma.lms.lms.entities.LibraryPatron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryPatronRepository extends JpaRepository<LibraryPatron , Long>{
}
