package com.capgemini.serialization.execution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.serialization.entity.Project;
import com.capgemini.serialization.entity.Student;
import com.capgemini.serialization.fileHandler.FileHandler;

public class JavaApp {
	public static void execution() {
		Project project1 = new Project(1,"ChatBot","AI based");
		
		
		Student student1 = new Student(1,"Raja","raja@gmail.com",9876543210L,project1);
		Student student2 = new Student(2,"Rani","rani@gmail.com",9876543211L,project1);
		Student student3 = new Student(3,"Raja","raja@gmail.com",9876543212L,project1);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		try {
			FileHandler.createTheFile();
			FileHandler.serialization(students);
			FileHandler.deserialization();
			FileHandler.deleteTheFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}