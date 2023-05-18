package com.StudentDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.StudentDetails.Dao.StudentDetailsDao;
import com.StudentDetails.Entity.Student;
import com.StudentDetails.Entity.StudentAgeException;
@Service
public class StudentDetailsService {
	@Autowired
	StudentDetailsDao studDao;
	
	public String addStudent(Student s) {
		// TODO Auto-generated method stub
		return studDao.addStudent(s);
	}

	public String addListOfStudent(List<Student> s) {
		// TODO Auto-generated method stub
		return studDao.addListOfStudent(s);
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studDao.getStudentById(id);
	}

	public List<Student> getWholeListOfStudent() {
		// TODO Auto-generated method stub
		return studDao.getWholeListOfStudent();
	}

	public String updateStudent(Student id) {
		// TODO Auto-generated method stub
		return studDao.updateStudent(id);
	}

	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		return studDao.deleteStudentById(id);
	}

	public String valid(Student s) throws StudentAgeException {
		// TODO Auto-generated method stub
		
		if(s.getAge()<=18) {
			throw new StudentAgeException();
		}
		else {
			return studDao.valid(s);
		}
	}

	public List<Student> getbyattendance(int attendance) {
		// TODO Auto-generated method stub
	
		return studDao.getbyattendance(attendance);
	}
}
