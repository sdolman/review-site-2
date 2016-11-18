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
    private ReviewRepository reviewRepository;
    
    @Bean
    public CommandLineRunner populateReviews() {
        return new ReviewPopulatorRunner();
    }
    
    public class ReviewPopulatorRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            // note that the id (I used 0L here) doesn't matter when we save via JPA. It will
            // generate ids starting with 1.
            
            //the id for this Review will be 1 (technically 1L since it's long).
            reviewRepository.save(new Review(0L, "Winning at Bingo", new Date(), "Jim Fakerton", "It's all luck"));
        }
    }
}