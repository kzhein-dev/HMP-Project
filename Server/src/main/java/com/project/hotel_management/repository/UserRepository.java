package com.project.hotel_management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hotel_management.entity.User;
import com.project.hotel_management.enums.UserRole;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findFirstByEmail(String emmail);
	Optional<User> findByUserRole(UserRole userRole);

}
