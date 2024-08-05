package com.techeasy.student_info.entity;

public class AuthenticationResponseEntity {

	private final String jwt;

	public AuthenticationResponseEntity(String jwt) {
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}
}
