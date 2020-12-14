package com.rest.spring.boot.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.spring.boot.crud.dao.StudentDAO;
import com.rest.spring.boot.crud.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<Student> findAll() {
		return studentDAO.findAll();
	}

	@Override
	public Student findById(int id) {
		return studentDAO.findById(id);
	}

	@Override
	public void save(Student student) {
		studentDAO.save(student);
	}

	@Override
	public void update(Student student) {
		studentDAO.update(student);
	}

	@Override
	public void delete(int id) {
		studentDAO.delete(id);
	}
}
