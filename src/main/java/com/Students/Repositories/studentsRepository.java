package com.Students.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Students.Modal.Student_details;

public interface studentsRepository extends JpaRepository<Student_details, Integer>{

}
