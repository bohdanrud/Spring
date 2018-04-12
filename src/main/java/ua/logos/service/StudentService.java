package ua.logos.service;

import java.util.List;

import ua.logos.entity.Student;

public interface StudentService {

	void saveStudent(Student student);
	
	List<Student> findAllStudents();
	
	Student findStudentById(int id);
	
}

