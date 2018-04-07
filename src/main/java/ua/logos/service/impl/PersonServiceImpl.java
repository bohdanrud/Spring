package ua.logos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.logos.entity.Person;
import ua.logos.repository.PersonRepository;
import ua.logos.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepository personRepository;
	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		personRepository.save(person);
	}

	@Override
	public Person findPersonById(int Id) {
		// TODO Auto-generated method stub
		return personRepository.getOne(Id);
	}

	@Override
	public List<Person> findAllPerson() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

}
