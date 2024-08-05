package com.techeasy.student_info.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.techeasy.student_info.entity.StudentEntity;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentEntity, Long> {

	@Query("SELECT s FROM StudentEntity s LEFT JOIN FETCH s.subjects WHERE s.studentId = :studentId")
	StudentEntity getAllStudentsById(Long studentId);

	Object findByUsername(String username);
}
