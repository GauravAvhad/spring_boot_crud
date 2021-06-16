package com.rest.spring.boot.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.spring.boot.crud.entity.Student;
import com.rest.spring.boot.crud.service.StudentService;

@RestController
@RequestMapping("/students")
public class RestStudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public List<Student> findAll() {
		System.out.println("rest controller");
		return studentService.findAll();
	}

	@GetMapping("/{id}")
	public Student findById(@PathVariable("id") int id) {
		return studentService.findById(id);
	}

	@PostMapping
	public List<Student> save(@RequestBody Student student) {
		studentService.save(student);
		return studentService.findAll();
	}

	@PutMapping
	public List<Student> update(@RequestBody Student student) {
		studentService.update(student);
		return studentService.findAll();
	}

	@DeleteMapping("/{id}")
	public List<Student> delete(@PathVariable("id") int id) {
		studentService.delete(id);
		return studentService.findAll();
	}
}
