package com.capgemini.serialization.execution;

import java.io.IOException;

import com.capgemini.serialization.fileHandler.FileHandler;

public class JavaApp {
	public static void execution() {
		try {
			FileHandler.createTheFile();
			FileHandler.serialization();
			FileHandler.deserialization();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	