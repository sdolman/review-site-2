package springMvc2;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {

	private Map<Long, Review> reviewsById;
	private String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce in neque ac leo luctus tincidunt vel eget urna. Sed faucibus leo eget tellus accumsan, eu sagittis massa tempus. Mauris in imperdiet sem. Sed varius vulputate odio, vitae tincidunt tellus vulputate eu. Praesent luctus elementum erat vel aliquet. Curabitur sed neque vulputate, pharetra libero et, blandit purus. Nullam vehicula volutpat nunc sed condimentum. Quisque quis purus non arcu ullamcorper fermentum at vitae massa. Vivamus faucibus, erat quis imperdiet dapibus, nisi tortor lacinia massa, vel elementum turpis sapien eget elit. Fusce hendrerit lorem eget metus cursus, vel tempus turpis vehicula. Praesent convallis tortor urna, nec molestie eros aliquet at.";

	public ReviewRepository() {
		reviewsById = new HashMap<Long, Review>();
		Review review1 = new Review(1, "Hitchhiker's Guide", new Date(2016, 11, 11), "Douglas Adams", lorem);
		reviewsById.put(review1.getId(), review1);
		Review review2 = new Review(2, "Chess Moves", new Date(2016, 11, 25), "Seth Dolman", lorem);
		reviewsById.put(review2.getId(), review2);
		reviewsById.put(3l, new Review(3, "Coding Basics", new Date(2016, 9, 25), "Kierra Westmoreland", lorem));
	}

	public Review findById(Long id) {
		return reviewsById.get(id);
	}

	public Iterable<Review> findAll() {
		return reviewsById.values();
	}
}
