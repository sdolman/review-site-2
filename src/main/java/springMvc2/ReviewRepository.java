package springMvc2;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {

	Iterable<Review> findByAuthor(String author);
	
	Iterable<Review> findByAuthorOrTitle(String author, String title);

	Set<Review> findByAuthorLikeOrTitleLikeAllIgnoreCase(String author, String title);


}
