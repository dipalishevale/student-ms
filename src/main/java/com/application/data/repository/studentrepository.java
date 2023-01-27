package com.application.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.application.data.entity.student;


public interface studentrepository extends JpaRepository<student,Long> {
	

}
