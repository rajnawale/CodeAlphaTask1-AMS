package com.CodeAlpha.AttendanceSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CodeAlpha.AttendanceSystem.Entitys.Branches;
import com.CodeAlpha.AttendanceSystem.Entitys.Student;
import com.CodeAlpha.AttendanceSystem.repositorys.BranchesRepository;
import com.CodeAlpha.AttendanceSystem.repositorys.StudentRepository;

@Service
public class BranchServiceImplementation implements BranchService{

	@Autowired
	BranchesRepository bRepo;
	
	public void addBranch(Branches branch) {
		bRepo.save(branch);
		System.out.println("Branch Added");
		
	}
	@Override
	public List<Branches> getBranches() {
		
		List<Branches> branchesList=bRepo.findAll();
		
		return branchesList;
	}
	@Autowired
	StudentRepository sRepo;
	public List<Student> getStudentsByBranch(String branchName){
		
		List<Student>studentList=sRepo.findByClassName(branchName);
		return studentList;
	}
	
	

}
