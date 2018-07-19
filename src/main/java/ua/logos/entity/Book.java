package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "isbn" , length = 50 , nullable = false , unique = true)
	private String isbn;
	
	@Column(name = "book_name" , length = 150 , nullable = false)
	private String bookNmae;
	
	@Column(name = "publish_date" , nullable = false)
	private String publish_Date ;

	
	public Book() {
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookNmae() {
		return bookNmae;
	}

	public void setBookNmae(String bookNmae) {
		this.bookNmae = bookNmae;
	}

	public String getPublish_Date() {
		return publish_Date;
	}

	public void setPublish_Date(String publish_Date) {
		this.publish_Date = publish_Date;
	}

	
}
