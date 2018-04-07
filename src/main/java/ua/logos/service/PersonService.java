package ua.logos.service;

import java.util.List;

import ua.logos.entity.Person;

public interface PersonService {

	void savePerson(Person person);

	Person findPersonById(int Id);

	List<Person> findAllPerson();
}
