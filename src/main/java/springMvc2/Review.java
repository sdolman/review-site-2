package springMvc2;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private Date date;
	private String author;
	private String content;
	@ManyToOne(cascade=CascadeType.MERGE)
	private Category category;
	
	protected Review() {}
	
	public Review (String title, Date date, String author, String content, Category category) {
		super();
		this.title = title;
		this.date = date;
		this.author = author;
		this.content = content;
		this.category = category;
	}
	
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Date getDate() {
		return date;
	}
	public String getAuthor() {
		return author;
	}
	public String getContent() {
		return content;
	}
	
	public Category getCategory() {
		return category;
	}
	
//	@Override
//    public String toString() {
//        return String.format(
//				"Review[id=%d, firstName='%s', lastName='%s']",
//                id, firstName, lastName);
//    }
	
}
