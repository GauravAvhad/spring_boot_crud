package com.rest.spring.boot.crud.dao;

import java.util.List;

import com.rest.spring.boot.crud.entity.Student;

public interface StudentDAO {
	public List<Student> findAll();
	public Student findById(int id);
	public void save(Student student);
	public void update(Student student);
	public void delete(int id);	
}
