package com.techeasy.student_info.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techeasy.student_info.entity.StudentEntity;
import com.techeasy.student_info.entity.SubjectEntity;
import com.techeasy.student_info.repository.StudentDetailsRepository;
import com.techeasy.student_info.repository.SubjectDetailsRepository;

@Service
public class StudentDetailsService {

	@Autowired
	StudentDetailsRepository studentDetailsRepository;

	@Autowired
	SubjectDetailsRepository subjectDetailsRepository;

	public StudentEntity saveStudentData(StudentEntity studentEntity) {

		StudentEntity student = studentDetailsRepository.save(studentEntity);

		return student;

	}

	public List<SubjectEntity> saveSubjectData(List<SubjectEntity> subjectEntity) {
		List<SubjectEntity> subjects = subjectDetailsRepository.saveAll(subjectEntity);
		return subjects;
	}

	public StudentEntity getStudentData(Long studentId) {
		StudentEntity studentEntity = null;
		List<SubjectEntity> subjects = subjectDetailsRepository.findAll();
		studentEntity = studentDetailsRepository.getAllStudentsById(studentId); // findById(studentId);
		studentEntity.setSubjects(subjects);
		return studentEntity;
	}

	public List<StudentEntity> getAllStudent() {
		List<StudentEntity> students = studentDetailsRepository.findAll();
		for(StudentEntity student : students ) {
			List<SubjectEntity> subjects = subjectDetailsRepository.findAll();
			student.setSubjects(subjects);
		}
		return students;
	}

	public List<SubjectEntity> getAllSubjects() {
		List<SubjectEntity> subjects = subjectDetailsRepository.findAll();
		return subjects;
	}

}
