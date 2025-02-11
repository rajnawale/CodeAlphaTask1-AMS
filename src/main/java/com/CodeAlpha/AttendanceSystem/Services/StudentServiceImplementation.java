package com.CodeAlpha.AttendanceSystem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CodeAlpha.AttendanceSystem.Entitys.Student;
import com.CodeAlpha.AttendanceSystem.repositorys.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {

	@Autowired
	StudentRepository sRepo;
	public void addingStud(Student student) {
		
		sRepo.save(student);
	}

}
