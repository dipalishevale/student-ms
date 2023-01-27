package com.application.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.application.data.entity.student;
import com.application.data.repository.studentrepository;

@SpringBootApplication
public class StudentMsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentMsApplication.class, args);
	}
  @Autowired
  private studentrepository studentRepository;
  
  @Override
  public void run(String... args) throws Exception{
	  
	  
  }


	
}
