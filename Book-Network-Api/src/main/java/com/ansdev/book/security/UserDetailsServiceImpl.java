package com.ansdev.book.security;

import com.ansdev.book.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userMail) throws UsernameNotFoundException {
        return userRepository.findByEmail(userMail)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with email: " + userMail));
    }
}
