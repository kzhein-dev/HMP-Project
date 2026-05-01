package com.project.hotel_management.dto;

import com.project.hotel_management.enums.UserRole;

import lombok.Data;

@Data
public class UserDto {
private Long id;
private String email;
private String name;
private UserRole userRole;
}
