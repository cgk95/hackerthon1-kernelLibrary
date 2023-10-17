package kernel.hackerthon.library.repository;

import kernel.hackerthon.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends
        JpaRepository<Book, Long>
{
}
