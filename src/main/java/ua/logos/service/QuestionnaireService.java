package ua.logos.service;

import java.util.List;

import ua.logos.entity.Questionnaire;

public interface QuestionnaireService {
	
	void saveQuestionnaire (Questionnaire questionnaire);
	
	List<Questionnaire> showAllQuestionnaire();

}
