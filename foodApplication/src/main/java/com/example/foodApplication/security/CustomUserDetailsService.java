package com.example.foodApplication.security;

import com.example.foodApplication.auth_users.entity.Users;
import com.example.foodApplication.auth_users.repository.UserRepository;
import com.example.foodApplication.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user =  userRepository.findByEmail(username)
                .orElseThrow(()-> new NotFoundException("user not found"));
        return AuthUser.builder()
                .users(user)
                .build();
    }
}
