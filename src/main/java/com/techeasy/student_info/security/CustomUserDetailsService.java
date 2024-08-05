package com.techeasy.student_info.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.techeasy.student_info.entity.StudentEntity;
import com.techeasy.student_info.repository.StudentDetailsRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private StudentDetailsRepository studentRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<StudentEntity> studentOptional = (Optional<StudentEntity>) studentRepository.findByUsername(username);
		if (!studentOptional.isPresent()) {
			throw new UsernameNotFoundException("User not found");
		}
		StudentEntity student = studentOptional.get();
		return new CustomUserDetails(student);
	}

}
