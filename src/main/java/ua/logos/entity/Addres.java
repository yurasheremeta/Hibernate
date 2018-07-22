package ua.logos.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="addres")
public class Addres extends baseEntity {

	@Column(name = "country" , length = 50 , nullable =false)
	private String country;
	
	@Column(name = "city" , length = 80 , nullable = false)
	private String city;
	
	@Column(name = "street" , length = 120 , nullable = false)
	private String street;
	
	@Column(name  = "build_number" , nullable= false)
	private int buildNumber;
	
	@Column(name = "flat_number" , nullable = false)
	private int flatNumber;
	@OneToMany(mappedBy = "addres")
	private List<User> users;
	 
	
}
