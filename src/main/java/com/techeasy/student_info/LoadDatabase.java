package com.techeasy.student_info;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.techeasy.student_info.entity.RoleEntity;
import com.techeasy.student_info.entity.StudentEntity;
import com.techeasy.student_info.repository.RoleRepository;
import com.techeasy.student_info.repository.StudentDetailsRepository;

@Configuration
public class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(StudentDetailsRepository studentRepository, RoleRepository roleRepository) {
		return args -> {
			RoleEntity adminRole = new RoleEntity();
			adminRole.setRoleName("ADMIN");
			RoleEntity studentRole = new RoleEntity();
			studentRole.setRoleName("STUDENT");

			roleRepository.save(adminRole);
			roleRepository.save(studentRole);

			List<RoleEntity> adminRoles = new ArrayList<>();
			adminRoles.add(adminRole);

			List<RoleEntity> studentRoles = new ArrayList<>();
			studentRoles.add(studentRole);

			StudentEntity admin = new StudentEntity();
			admin.setUsername("admin");
			admin.setPassword(new BCryptPasswordEncoder().encode("adminpass"));
			admin.setRoles(adminRoles);
			studentRepository.save(admin);

			StudentEntity student = new StudentEntity();
			student.setUsername("student");
			student.setPassword(new BCryptPasswordEncoder().encode("studentpass"));
			student.setRoles(studentRoles);
			studentRepository.save(student);
		};
	}
}
