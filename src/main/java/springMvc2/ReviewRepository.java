package springMvc2;

import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {

	Iterable<Review> findByAuthorIgnoreCase(String search);


}
