package ua.logos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.logos.entity.Questionnaire;
import ua.logos.repository.QuestionnaireRepository;
import ua.logos.service.QuestionnaireService;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

	@Autowired
	private QuestionnaireRepository questionnaireRepository;
	
	@Override
	public void saveQuestionnaire(Questionnaire questionnaire) {
		// TODO Auto-generated method stub
		questionnaireRepository.save(questionnaire);

	}

	@Override
	public List<Questionnaire> showAllQuestionnaire() {
		// TODO Auto-generated method stub
		return questionnaireRepository.findAll();
	}

}
