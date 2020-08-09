package com.deptempjwtappln.model;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable{

	private String jwtResponse;

	public String getJwtResponse() {
		return jwtResponse;
	}

	public void setJwtResponse(String jwtResponse) {
		this.jwtResponse = jwtResponse;
	}

	public AuthenticationResponse(String jwtResponse) {
		super();
		this.jwtResponse = jwtResponse;
	}

	public AuthenticationResponse() {
		super();
	}
	
}
