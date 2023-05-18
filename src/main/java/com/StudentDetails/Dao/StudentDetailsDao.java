package com.StudentDetails.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.StudentDetails.Entity.Student;
import com.StudentDetails.Repository.StudentDetailsRepository;
@Repository
public class StudentDetailsDao {
@Autowired
StudentDetailsRepository studRepo;
	public String addStudent(Student s) {
		// TODO Auto-generated method stub
		 studRepo.save(s);
		 return "saved successfully";
	}
	public String addListOfStudent(List<Student> s) {
		// TODO Auto-generated method stub
		studRepo.saveAll(s);
		return "List saved successfully";
	}
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studRepo.findById(id).get();
	}
	public List<Student> getWholeListOfStudent() {
		// TODO Auto-generated method stub
		return studRepo.findAll();
	}
	public String updateStudent(Student id) {
		// TODO Auto-generated method stub
		studRepo.save(id);
		return "updated successfully";
	}
	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		studRepo.deleteById(id);
		return "deleted successfully";
	}
	public String valid(Student s) {
		// TODO Auto-generated method stub
		studRepo.save(s);
		return "saved successfully";
	}
	public List<Student> getbyattendance(int attendance) {
		// TODO Auto-generated method stub
		return studRepo.getbyattendance(attendance);
	}

}
