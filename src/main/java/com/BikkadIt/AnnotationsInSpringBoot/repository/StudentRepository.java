package com.BikkadIt.AnnotationsInSpringBoot.repository;

import com.BikkadIt.AnnotationsInSpringBoot.model.Student;

public class StudentRepository {

	public StudentRepository() {
		super();
		System.out.println("Student Class Repository");
	}

	public Student saveStudentDao(Student stu) {
		System.out.println(stu);
		//logic to save data
		System.out.println(stu);
		return stu;
		
	}
}
