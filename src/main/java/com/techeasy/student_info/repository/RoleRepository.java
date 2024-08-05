package com.techeasy.student_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techeasy.student_info.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

}
