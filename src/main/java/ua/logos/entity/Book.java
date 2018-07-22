package ua.logos.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "book")
public class Book extends baseEntity {	
	@Column(name = "isbn" , length = 50 , nullable = false , unique = true)
	private String isbn;
	
	@Column(name = "book_name" , length = 150 , nullable = false)
	private String bookNmae;
	
	@Column(name = "publish_date" , nullable = false)
	private String publish_Date ;

	
	@ManyToMany
	@JoinTable(name = "author_book" , joinColumns = @JoinColumn(name = "book_id"), 
	inverseJoinColumns = @JoinColumn (name = "author_id"))
	private List<Author> authors;
	
	@ManyToMany(mappedBy = "books")
	private List<Category> categories;
	@OneToMany(mappedBy = "book")
	private List<TakenBook> takenBook;

	
}
