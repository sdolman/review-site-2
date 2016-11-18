package springMvc2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@RequestMapping("/review")
	public String review(@RequestParam(value = "id") long id, Model model) throws ParseException {
		String pattern = "MM/dd/yyyy";
	    SimpleDateFormat format = new SimpleDateFormat(pattern);
		Review review = new Review(id, "Winning at Bingo", format.parse("11/10/2016"), "Jim Fakerton", "It's all luck");
		model.addAttribute("selectedReview", review);
		return "review-view";
	}

}
