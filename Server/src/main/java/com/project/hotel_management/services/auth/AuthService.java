package com.project.hotel_management.services.auth;

import com.project.hotel_management.dto.SignupRequest;
import com.project.hotel_management.dto.UserDto;

public interface AuthService {

	UserDto createUser(SignupRequest signupRequest);
}
