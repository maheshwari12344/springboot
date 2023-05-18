package com.StudentDetails.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.StudentDetails.Entity.Student;

public interface StudentDetailsRepository extends JpaRepository<Student, Integer> {
@Query(value="select * from  student where attendance >= ?",nativeQuery=true)
	public List<Student> getbyattendance(int attendance);

}
