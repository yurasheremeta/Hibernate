package ua.logos.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "author")
public class Author extends baseEntity {	
	@Column(name = "first_name" , length = 50 , nullable = false)
	private String firstName;
	
	@Column(name = "last_name" , length = 50 , nullable = false)
	private String lastName;
	
	
	@ManyToMany(mappedBy = "authors")
	private List<Book> books;

	

}
