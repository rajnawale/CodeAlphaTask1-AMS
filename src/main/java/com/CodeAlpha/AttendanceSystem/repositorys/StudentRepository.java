package com.CodeAlpha.AttendanceSystem.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CodeAlpha.AttendanceSystem.Entitys.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	List<Student> findByClassName(String branchName);

}
