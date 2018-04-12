package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Getter
@Setter
public class Student extends BaseEntity{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private int age;
	
	private String country;
	
	@Column(name = "programming_language")
	private String programmingLanguage;
	
	private String[] hobby;
}
