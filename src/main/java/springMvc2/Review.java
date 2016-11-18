package springMvc2;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {

	public Review(long id, String title, Date date, String author, String content) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.author = author;
		this.content = content;
	}
	private long id;
	private String title;
	private Date date;
	private String author;
	private String content;
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
	
}
