package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.logos.entity.Questionnaire;

@Repository
public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Integer>{

}
