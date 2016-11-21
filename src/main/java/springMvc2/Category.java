package springMvc2;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
//	@OneToMany(cascade = {CascadeType.MERGE},fetch= FetchType.EAGER, mappedBy = "category")
	@OneToMany
    Set<Review> reviews;
	
	protected Category() {}

	public Category(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Set<Review> getReviews() {
		return reviews;
	}
	
	
}
