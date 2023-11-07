package com.demowebapp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataProperties {
		String url;
		String email;
		String password;
		String email1;
		String password1;
		
		 public DataProperties() {
				data();
		}
	 
		public void data() {
			File file = new File("C:\\Users\\pnagarajan2\\eclipse-workspace\\TechnicalAssessment3ES6448\\PadmapriyaTechnicalAssessment3\\src\\test\\resources\\login.properties");
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}
			Properties prop = new Properties();
			try {
				prop.load(fileInput);
			}catch(IOException e) {
				e.printStackTrace();
			}
			url = prop.getProperty("url");
			
			email = prop.getProperty("email");
			password = prop.getProperty("password");
			email1 = prop.getProperty("email1");
			password1 = prop.getProperty(password1);
			
		}
	 
	 
	}
	


