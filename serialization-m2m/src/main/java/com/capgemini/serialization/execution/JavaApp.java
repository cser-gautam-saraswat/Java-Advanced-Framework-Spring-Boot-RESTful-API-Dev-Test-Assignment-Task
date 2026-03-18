package com.capgemini.serialization.execution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.serialization.entity.Project;
import com.capgemini.serialization.entity.Student;
import com.capgemini.serialization.fileHandler.FileHandler;

public class JavaApp {
	public static void execution() {
		Project project1 = new Project(1, "project1", "project desc");
		Project project2 = new Project(2, "project2", "project desc2");
		Project project3 = new Project(3, "project3", "project desc3");
		
		List<Project> projects = new ArrayList<Project>();
		projects.add(project1);
		projects.add(project2);
		projects.add(project3);
		
		Student student1 = new Student(1,"Raja","Raja@gmail.com",789654123L, projects);
		Student student2 = new Student(2,"Rani","Rani@gmail.com",789654155L, projects);
		Student student3 = new Student(3,"Rocky","Rocky@gmail.com",789654173L, projects);
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		try {
			FileHandler.createTheFile();
			FileHandler.serialization(students);
			FileHandler.deserialization();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	