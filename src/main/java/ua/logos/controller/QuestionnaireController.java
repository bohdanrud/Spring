package ua.logos.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.logos.entity.Questionnaire;
import ua.logos.service.QuestionnaireService;

@Controller
@RequestMapping("/questionnaire")
public class QuestionnaireController {

	@Autowired
	private QuestionnaireService questionnaireService;
	
	@GetMapping("/new")
	public String showQuestionnaire(Model model) {
		model.addAttribute("pageTitle", "Questions");
		model.addAttribute("questionnaireModel", new Questionnaire());
		model.addAttribute("countries", Arrays.asList("Ukraine","Poland","Russia","UK","Other"));
		model.addAttribute("sexes", Arrays.asList("Male","Female","Other"));
		model.addAttribute("educations", Arrays.asList("Bachelor degree","Specialist degree","Master's (Magister) degree","Other"));
		model.addAttribute("socialNetworksList", Arrays.asList("Facebook","Instagram","VK","Google+","Other"));
		model.addAttribute("programmingLanguages", Arrays.asList("Java","C++","C#","Python","Ruby","Java Script","Others"));
		model.addAttribute("operationSystemsList", Arrays.asList("Windows","Linux","MacOS","AmigaOS","MorphOS","FreeBSD","Others"));
		model.addAttribute("experiencesTimes", Arrays.asList("No","< 6 Months","6 - 12 Months","1 - 2 Years","3 - 5 Years","6 - 10 Years","> 10 Years"));
		model.addAttribute("rangs", Arrays.asList("Ending courses","Junior","Middle","Senior"));
		model.addAttribute("technologiesList", Arrays.asList("MySQL","JDBC","Spring","Hibernate","HTML","CSS","Java Servlets","JPA","Git","Others"));
		model.addAttribute("ways", Arrays.asList("Google","Social Networks","Advertisement","Friends","Other way"));
		model.addAttribute("foreignLanguagesList", Arrays.asList("English","German","Poland","Russian","Spanish","Others"));
		model.addAttribute("englishLevelList", Arrays.asList("Starter","Elementary","Pre-intermediate","Intermediate","Upper intermediate","Advanced"));
		
		return "questionnaire/questions";
	}
	
	@PostMapping("/new")
	public String save(@ModelAttribute("questionnaireModel") Questionnaire questionnaire,
			@RequestParam("email") String email) {
		questionnaire.setEmail(email);
		questionnaireService.saveQuestionnaire(questionnaire);
		return "redirect:/questionnaire/questionnaire";
	}
	
	@GetMapping("/all-answers")
	public String showAllAnswers(Model model) {
		model.addAttribute("answersList", questionnaireService.showAllQuestionnaire());
		
		return "questionnaire/all-answers";
	}
}
