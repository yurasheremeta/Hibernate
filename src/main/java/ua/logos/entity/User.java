package ua.logos.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor


@Entity
@Table(name = "user")
public class User extends baseEntity {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	
	@Column(name = "user_name" , length= 50 ,nullable = false )
	private String user_name;
	
	@Column(name = "phone_number" , length = 15 , unique = true)
	private int phoneNumber;
	
	@Column(name = "email" , length = 50 , nullable = false , unique = true)
	private String email;
	
	@Column(name = "date_of_birth" , nullable = false)
	private String dateOfBirth;
	
	@Column(name = "details" , columnDefinition = "text")
	private String details;

	
	@OneToMany(mappedBy = "user")
	private List<TakenBook> takenBook;
	@ManyToOne()
	@JoinColumn(name = "addres_id")
	private Addres addres;
	

}

