package springMvc2;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReviewApplication.class, args);
    }
    
    
    
    @Resource
    private CategoryRepository categoryRepository;
    
    @Resource
    private ReviewRepository reviewRepository;
    
    @Bean
    public CommandLineRunner populateReviews() {
        return new ReviewPopulatorRunner();
    }
    
    public class ReviewPopulatorRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
        	Review review;
        	Category strategy = new Category("strategy");
        	strategy = categoryRepository.save(strategy);
        	review = new Review("Winning at Bingo", new Date(), "Jim Fakerton", "It's all luck.", strategy);
            reviewRepository.save(review);
            review = new Review("Chess Moves: Checkmate Yesterday!", new Date(), "Bobby McBobberson", "Think and then do things.", strategy);
            reviewRepository.save(review);
            Category mystery = new Category("mystery");
            mystery = categoryRepository.save(mystery);
            review = new Review("Crimes Are Ugly", new Date(), "Batman", "I am the knight.", mystery);
        }
    }
}