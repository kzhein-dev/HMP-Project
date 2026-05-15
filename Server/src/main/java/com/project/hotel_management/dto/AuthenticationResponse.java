package com.project.hotel_management.dto;

import com.project.hotel_management.enums.UserRole;

import lombok.Data;

@Data
public class AuthenticationResponse {
	private String jwt;
	private Long userId;
	private UserRole userRole;

}
