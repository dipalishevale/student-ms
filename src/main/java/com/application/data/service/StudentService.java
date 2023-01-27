package com.application.data.service;

import java.util.List;

import com.application.data.entity.student;

public interface StudentService {
	
	List<student> getAllStudents();
    student saveStudent(student student);
    
    student getStudentById(Long id);

    student updateStudent(student student);
    
    void deleteStudentById(Long id);

    
}
