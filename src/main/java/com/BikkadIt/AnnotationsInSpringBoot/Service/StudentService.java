package com.BikkadIt.AnnotationsInSpringBoot.Service;

import com.BikkadIt.AnnotationsInSpringBoot.model.Student;
import com.BikkadIt.AnnotationsInSpringBoot.repository.StudentRepository;

public class StudentService {

	public StudentService() {
		super();
		System.out.println("Student Class Service");
	}
	
	public Student saveStudentService(Student stu) {
		
		System.out.println(stu);
		
		StudentRepository studentrepository=new StudentRepository();
		Student saveStudentDao = studentrepository.saveStudentDao(stu);
		return stu;
		
	}
	
}
