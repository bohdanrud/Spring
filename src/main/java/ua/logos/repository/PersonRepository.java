package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.logos.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

	
	
}
