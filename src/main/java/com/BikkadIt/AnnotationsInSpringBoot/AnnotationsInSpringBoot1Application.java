package com.BikkadIt.AnnotationsInSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.BikkadIt.AnnotationsInSpringBoot.Controller.StudentController;
import com.BikkadIt.AnnotationsInSpringBoot.model.Student;

@SpringBootApplication
public class AnnotationsInSpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationsInSpringBoot1Application.class, args);
		
		Student stu = new Student();
		stu.setSid(11);
		stu.setSname("Ram Kumar");
		stu.setSaddr("Pune");
		
		StudentController  studentController= new StudentController();
		Student saveStudentController = studentController.saveStudentController(stu);
		System.out.println(saveStudentController);
	}

}
