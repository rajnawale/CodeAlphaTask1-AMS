package com.CodeAlpha.AttendanceSystem.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.CodeAlpha.AttendanceSystem.Entitys.Branches;
import com.CodeAlpha.AttendanceSystem.Entitys.Student;
import com.CodeAlpha.AttendanceSystem.Services.BranchServiceImplementation;
import com.CodeAlpha.AttendanceSystem.Services.StudentServiceImplementation;

@Controller
public class BranchController {
	
	@Autowired
	BranchServiceImplementation bsi;
	
	@GetMapping("map-listofclasses")
	public String showBranches(Model model) {
		
		List<Branches>branchDetails=bsi.getBranches();
		
		model.addAttribute("branchDetails",branchDetails );
		return "listofbranches";	
	}
	
	@GetMapping("/branch/{name}/students")
	public String getStudentsByBranch(@PathVariable("name") String branchName,Model model) {
		List<Student>studentLists=bsi.getStudentsByBranch(branchName);
		model.addAttribute("studentLists", studentLists);
		model.addAttribute("branchName", branchName);
		System.out.println(studentLists);
		return "branchstudents";
	}
	
	@GetMapping("branchform")
	public String addBranches(Model model,@ModelAttribute Branches branch) {
     
		bsi.addBranch(branch);
		List<Branches>branchDetails=bsi.getBranches();
		model.addAttribute("branchDetails",branchDetails );
		return "listofbranches";
		
	}
	
	@Autowired
	StudentServiceImplementation ssi;
	@PostMapping("studentform")
	public String addStudent(@ModelAttribute Student student) {
		
		ssi.addingStud(student);
		return "studaddsuccess";
	}
	
	@GetMapping("branchpage")
	public String classesList(Model model) {
List<Branches>branchDetails=bsi.getBranches();
		
		model.addAttribute("branchDetails",branchDetails );
		return "listofbranches";
	}
}
