package com.techeasy.student_info.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techeasy.student_info.entity.StudentEntity;
import com.techeasy.student_info.entity.SubjectEntity;
import com.techeasy.student_info.service.StudentDetailsService;

@RestController
@RequestMapping("/details")
public class StudentDetailsController {

	@Autowired
	StudentDetailsService studentDetailsService;

	@PostMapping("/studentsDetails")
	public StudentEntity saveStudentData(@RequestBody StudentEntity studentEntity) {
		StudentEntity student = studentDetailsService.saveStudentData(studentEntity);

		return student;

	}

	@PostMapping("/subjectsDetails")
	public List<SubjectEntity> saveSubjectData(@RequestBody List<SubjectEntity>  subjectEntity) {
		List<SubjectEntity> subjects = studentDetailsService.saveSubjectData(subjectEntity);

		return subjects;

	}

	@GetMapping("/getStudentData/{studentId}")
	public StudentEntity getStudentData(@PathVariable Long studentId) {
		StudentEntity studentData = studentDetailsService.getStudentData(studentId);
		return studentData;
	}
	
	@GetMapping("/getAllStudents")
	public List<StudentEntity> getAllStudent(){
		List<StudentEntity> students = studentDetailsService.getAllStudent();
		return students;
		
	}
	
	@GetMapping("/getAllSubjects")
	public List<SubjectEntity> getAllSubjects(){
		List<SubjectEntity> subjects = studentDetailsService.getAllSubjects();
		return subjects;
		
	}
}
