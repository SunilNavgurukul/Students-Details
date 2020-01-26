package com.Students.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Students.Modal.Student_details;
import com.Students.Repositories.studentsRepository;

@RestController
@RequestMapping(value = "/allStudents_detail")
public class studentsController {
	
	@Autowired
	studentsRepository repo;
	
	
	@GetMapping(value="/students")
	private List<Student_details> getAll(){
		return repo.findAll();
	}
	
	@PostMapping(value="/post_data")
	private List<Student_details> load(@RequestBody final Student_details details ){
		repo.save(details);
		return repo.findAll();
	}
}
