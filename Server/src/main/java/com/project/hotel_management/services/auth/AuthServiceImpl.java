package com.project.hotel_management.services.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.hotel_management.dto.SignupRequest;
import com.project.hotel_management.dto.UserDto;
import com.project.hotel_management.entity.User;
import com.project.hotel_management.enums.UserRole;
import com.project.hotel_management.repository.UserRepository;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityExistsException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @PostConstruct
    public void createAnAdminAccount() {
        Optional<User> adminAccount = userRepository.findByUserRole(UserRole.ADMIN);
        if (adminAccount.isEmpty()) {
            User user = new User();
            user.setEmail("admin@gmail.com");
            user.setName("Admin");
            user.setUserRole(UserRole.ADMIN);
            user.setPassword(new BCryptPasswordEncoder().encode("admin"));
            userRepository.save(user);
            System.out.println("Admin account created successfully");
        } else {
            System.out.println("Admin account already exist");
        }
    }


    public UserDto createUser(SignupRequest signupRequest) {
        if (userRepository.findFirstByEmail(signupRequest.getEmail()).isPresent()) {
            throw new EntityExistsException("User Already Present With Email " + signupRequest.getEmail());
        }

        User user = new User();
        user.setEmail(signupRequest.getEmail());
        user.setName(signupRequest.getName());
        user.setUserRole(UserRole.CUSTOMER);
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        
        User createdUser = userRepository.save(user);
        return createdUser.getUserDto();
    }
}

