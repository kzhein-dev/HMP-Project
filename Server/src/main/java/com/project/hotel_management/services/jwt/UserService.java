package com.project.hotel_management.services.jwt;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {

	UserDetailsService userDetailsService();
}
