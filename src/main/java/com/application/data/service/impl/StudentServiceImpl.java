package com.application.data.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.data.entity.student;
import com.application.data.repository.studentrepository;
import com.application.data.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private studentrepository studentRepository;
	
	public StudentServiceImpl(studentrepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	@Override
	public student saveStudent(student student) {
		return studentRepository.save(student);
	}



	@Override
	public student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}



	@Override
	public student updateStudent(student student) {
		return studentRepository.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
		 studentRepository.deleteById(id);
	}



	

}
