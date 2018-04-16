package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "questionnaire")
@NoArgsConstructor
@Getter
@Setter
public class Questionnaire extends BaseEntity{
	
	@Column(name = "full_name") //
	private String fullName;
	
	@Column(name = "age") //
	private int age;
	
	@Column(name = "country")//
	private String country;
	
	@Column(name = "sex") //
	private String sex;
	
	@Column(name = "email") //
	private String email;
	
	@Column(name = "education")//
	private String education;
	
	@Column(name = "social_networks")//
	private String[] socialNetworks;
	
	@Column(name = "programming_language")//
	private String programmingLanguage;
	
	@Column(name = "operation_systems") //
	private String[] operationSystems;
	
	@Column(name = "experience") //
	private String experience;
	
	@Column(name = "rang")//
	private String rang;
	
	@Column(name = "technologies")//
	private String[] technologies;
	
	@Column(name = "know_from") //
	private String knowFrom;
	
	@Column(name = "city") //
	private String city;
	
	@Column(name = "post_code") //
	private int postCode;
	
	@Column(name = "foreign_languages") //
	private String[] foreignLanguages;
	
	@Column(name = "english_level") //
	private String englishLevel;
	
	@Column(name = "phone")//
	private String phone;
	
	@Column(name = "hobby")//
	private String hobby;
	
	@Column(name = "note")//
	private String note;
	

}
