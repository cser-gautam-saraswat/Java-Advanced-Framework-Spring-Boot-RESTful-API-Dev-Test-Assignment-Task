package com.capgemini.serialization.fileHandler;

import java.io.File;
import java.io.IOException;

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
	
	public static void serialization(Student student) throws StreamWriteException, DatabindException, IOException {

		OBJECT_MAPPER.writeValue(FILE, student);
		System.out.println("Serialization Done Successfully");
		
	}
	
	public static void deserialization() throws StreamReadException, DatabindException, IOException {
		Student student = OBJECT_MAPPER.readValue(FILE, Student.class);
		System.out.println(student);
		System.out.println("Deserialization Done Successfully");
		
	}
	
	public static void deleteTheFile() throws IOException {
		if(FILE.delete()) {
			System.out.println("JSON File Deleted Successfully!");
		}
		else {
			System.out.println("JSON File Doesn't Exists!");
		}
	}
}