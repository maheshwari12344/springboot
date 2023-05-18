package com.StudentDetails.Controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.StudentDetails.Entity.Student;
import com.StudentDetails.Entity.StudentAgeException;
import com.StudentDetails.Service.StudentDetailsService;






@RestController
@RequestMapping(value="/studentdetails")
public class StudentDetailsController {
	@Autowired
	StudentDetailsService studSer;
	// post(add) single value in db
	@PostMapping(value="/addStudent")
	public String addStudent(@RequestBody Student s) {
		return studSer.addStudent(s);
	}
	// post(add) list of value in db
	@PostMapping(value="/addListOfStudent")
	public String addListOfStudent(@RequestBody List<Student> s) {
		return studSer.addListOfStudent(s);
	}
	//read single object from db
	@GetMapping(value="/getStudentByid/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studSer.getStudentById(id);
	}
	//read whole List of object from db
	@GetMapping(value="/getWholeListOfStudent")
	public List<Student> getWholeListOfStudent() {
		return studSer.getWholeListOfStudent();
	}
     //update-put method -save  repo method
	@PutMapping(value="/updateStudent/{id}")
	public String updateStudent(@RequestBody Student id) {
		return studSer.updateStudent(id);
	}
	//delete
	@DeleteMapping(value="/deleteStudentById/{id}")
	public String deleteStudentById(@PathVariable int id) {
		return studSer.deleteStudentById(id);
	}
	@PostMapping(value="/valid")
	public String valid(@RequestBody Student s)throws StudentAgeException {
		return studSer.valid(s);
	}
	@GetMapping(value="/getbyattendance/{attendance}")
	public List<Student> getbyattendance(@PathVariable int attendance){
		return studSer.getbyattendance(attendance);
	}
}
