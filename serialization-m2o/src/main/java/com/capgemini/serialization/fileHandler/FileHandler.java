package com.capgemini.serialization.fileHandler;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.capgemini.serialization.entity.Project;
import com.capgemini.serialization.entity.Student;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileHandler {
	private static final String PATH = "src/main/resources/Student.json";
	private static final File FILE = new File(PATH);
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	public static void createTheFile() throws IOException {
		if(FILE.createNewFile()) {
			System.out.println("JSON File Created Successfully!");
		}
		else {
			System.out.println("JSON File Already Exists!");
		}
		
	}
	
	public static void serialization(List<Student> students) throws StreamWriteException, DatabindException, IOException {
		
		OBJECT_MAPPER.writeValue(FILE, students);
		System.out.println("Serialization Done Successfully");
		
	}
	
	public static void deserialization() throws StreamReadException, DatabindException, IOException {
		Student[] students = OBJECT_MAPPER.readValue(FILE, Student[].class);
		for(Student st : students) {
			System.out.println(st);
			System.out.println(st.getProject());
		}
		System.out.println("Deserialization Done Successfully");
		
	}
	
	public static void deleteTheFile() throws IOException {
		if(FILE.delete()) {
			System.out.println("JSON File Deleted Successfully!");
		}
		else {
			System.out.println("JSON File Doesn;t Exists!");
		}
	}
}