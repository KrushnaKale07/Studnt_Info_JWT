package com.techeasy.student_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techeasy.student_info.entity.SubjectEntity;

@Repository
public interface SubjectDetailsRepository extends JpaRepository<SubjectEntity, Long> {
	
}
