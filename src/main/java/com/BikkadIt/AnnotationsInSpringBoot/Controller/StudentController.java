package com.BikkadIt.AnnotationsInSpringBoot.Controller;

import com.BikkadIt.AnnotationsInSpringBoot.Service.StudentService;
import com.BikkadIt.AnnotationsInSpringBoot.model.Student;

public class StudentController {

	public StudentController() {
		super();
		System.out.println("Student Class Controller");
	}

	public Student saveStudentController(Student stu) {
		System.out.println(stu);
		
	StudentService studentservice= new StudentService();
	Student saveStudentService = studentservice.saveStudentService(stu);
		return stu;
		
	}
	
}
