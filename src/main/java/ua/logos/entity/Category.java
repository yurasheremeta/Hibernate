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
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor


@Entity
@Table(name = "category")
public class Category extends baseEntity {	
	@Column(name = "category_name" , length = 50 , nullable = false , unique = true)
	private String categoryName;
	
	@ManyToMany
	@JoinTable(name = "category_book" , joinColumns = @JoinColumn(name = "category_id"),
	inverseJoinColumns = @JoinColumn(name = "book_id"))
	private List<Book> books;


}
