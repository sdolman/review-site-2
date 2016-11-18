package springMvc2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	private ReviewRepository repository = new ReviewRepository();

	@RequestMapping("/review")
	public String review(@RequestParam(value = "id") long id, Model model) throws ParseException {
		// String pattern = "MM/dd/yyyy";
		// SimpleDateFormat format = new SimpleDateFormat(pattern);
		// Review review = new Review(42, "Winning at Bingo",
		// format.parse("11/10/2016"), "Jim Fakerton", "It's all luck");
		Review review = repository.findById(id);
		model.addAttribute("selectedReview", review);
		return "review-view";
	}

	@RequestMapping("/allReviews")
	public String displayAllReviews(Model model) {
		Iterable<Review> reviews = repository.findAll();
		model.addAttribute("reviews", reviews);
		return "review-all";
	}

}
