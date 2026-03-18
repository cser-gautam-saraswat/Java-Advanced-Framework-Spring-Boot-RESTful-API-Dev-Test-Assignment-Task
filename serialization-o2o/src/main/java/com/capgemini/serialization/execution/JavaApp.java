package com.capgemini.serialization.execution;

import java.io.IOException;

import com.capgemini.serialization.entity.Project;
import com.capgemini.serialization.entity.Student;
import com.capgemini.serialization.fileHandler.FileHandler;

public class JavaApp {
	public static void execution() {
		Project project = new Project(1, "project1", "project desc");
		
		Student student = new Student(1,"Raja","Raja@gmail.com",789654123L, project);
		try {
			FileHandler.createTheFile();
			FileHandler.serialization(student);
			FileHandler.deserialization();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	