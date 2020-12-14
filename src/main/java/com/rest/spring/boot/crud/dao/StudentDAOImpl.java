package com.rest.spring.boot.crud.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rest.spring.boot.crud.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	private List<Student> students;
	public StudentDAOImpl() {
		students = new ArrayList<Student>();
		students.add(new Student(1, "Nirav", "Ahmedabad"));
		students.add(new Student(2, "John", "Texas"));
		students.add(new Student(3, "Philip", "New York"));
	}

	@Override
	public List<Student> findAll() {
		return students;
	}

	@Override
	public Student findById(int id) {
		return students.get(id);
	}

	@Override
	public void save(Student student) {
		students.add(student);
	}
	
	@Override
	public void update(Student student) {
		students.set(student.getId(), student);
	}

	@Override
	public void delete(int id) {
		students.remove(id);
	}
}
